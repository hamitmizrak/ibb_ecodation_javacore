package com.hamitmizrak.controller;

import com.hamitmizrak.dao.RegisterDao;
import com.hamitmizrak.dao.StudentDao;
import com.hamitmizrak.dao.TeacherDao;
import com.hamitmizrak.dto.*;
import com.hamitmizrak.utils.SpecialColor;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

public class LoginRegisterController {

    // Loglama
    private static final Logger logger = Logger.getLogger(LoginRegisterController.class.getName());

    // Field
    private final RegisterDao registerDao;
    private final StudentDao studentDao;
    private final TeacherDao teacherDao;
    private final StudentController studentController;
    private final TeacherController teacherController;
    private final Scanner scanner = new Scanner(System.in);

    public LoginRegisterController() {
        registerDao = new RegisterDao();
        studentDao = new StudentDao();
        teacherDao = new TeacherDao();
        studentController = new StudentController();
        teacherController = new TeacherController();
    }

    public void isUserRole(RegisterDto registerDto) {
        switch (registerDto.getRole()) {
            case "STUDENT" -> studentController.choose();
            case "TEACHER" -> teacherController.choose();
            default -> System.out.println("Yetkilendirilme yapılmamıştır. Yönetici ile iletişime geçin.");
        }
    }

    public void login() {
        int maxAttempts = 3;
        Map<String, Integer> loginAttempts = new HashMap<>();

        while (true) {
            System.out.println("\n==== GİRİŞ EKRANI ====");
            System.out.print("Email: ");
            String email = scanner.nextLine().trim();
            System.out.print("Şifre: ");
            String password = scanner.nextLine().trim();

            // Email var mı yok mu ?
            Optional<RegisterDto> findIsEmail = registerDao.findByEmail(email);
            if (findIsEmail.isPresent()) {
                // Kullanıcı bilgilerini al
                RegisterDto user = findIsEmail.get();
                System.out.println("Locked: "+user.isLocked());

                // Kullanıcı kilitli mi ?
                if (user.isLocked()) {
                    System.out.println("Hesabınız kilitli.");
                    return;
                }

                // 📌 Şifreyi düz metin olarak almak için yeni metod kullanıldı
                String plainPassword = user.getDecryptedPassword();
                RegisterDto registerDto= new RegisterDto();
                System.out.println("Email: "+user.getEmailAddress().equals(email));
                System.out.println("şifre: "+plainPassword.equals(password));
                //System.out.println("şifre doğrulama: "+plainPassword.equals( registerDto.encryptPassword(password) ));

                // Email ve Şifre doğrulama
                if (user.getEmailAddress().equals(email) && plainPassword.equals( registerDto.encryptPassword(password) )) {
                    System.out.println(SpecialColor.GREEN + "Başarıyla giriş yaptınız " + SpecialColor.RESET +
                            SpecialColor.BLUE + "Hoşgeldiniz " + email + SpecialColor.RESET);
                    isUserRole(user);
                    break;
                } else {
                    // Yanlış giriş sayısını artır
                    loginAttempts.put(email, loginAttempts.getOrDefault(email, 0) + 1);
                    int attempts = loginAttempts.get(email);

                    // Kalan Hak
                    int remaining = maxAttempts - attempts;
                    System.out.println("Hata: Kullanıcı adınız veya şifreniz yanlıştır" +
                            SpecialColor.BLUE + " Kalan hakkınız: " + remaining + SpecialColor.RESET);

                    // 3 kez yanlış girerse kullanıcı kilitlensin
                    if (attempts >= maxAttempts) {
                        user.setLocked(true);
                        registerDao.update(user.getId(), user); // Güncellenmiş kullanıcıyı kaydet
                        System.out.println("Hata: Kullanıcı 3 kez hatalı giriş yaptığı için sistem tarafından kilitlenmiştir.");
                        return;
                    }
                }
            } else {
                System.out.println("Kullanıcı bulunamadı! Önce kayıt olmalısınız.");
                register();
            }
        }
    }


    /// REGISTER
    private void register() {
        System.out.println("\n" + SpecialColor.BLUE + " Yeni Kullanıcı Kaydı" + SpecialColor.RESET);
        String name, surname, email, nickname, password;
        LocalDate birthDate;
        ERole role;

        // Name
        System.out.print("Name adresiniz: ");
        name = scanner.nextLine().trim();

        // Surname
        System.out.print("Surname adresiniz: ");
        surname = scanner.nextLine().trim();

        // Nickname
        System.out.print("Nickname giriniz: ");
        nickname = scanner.nextLine().trim();

        // Email
        System.out.print("Email adresiniz: ");
        email = scanner.nextLine().trim();

        // Şifre
        System.out.print("Şifrenizi giriniz: ");
        password = scanner.nextLine().trim();

        // Role
        System.out.print("Role giriniz (STUDENT, TEACHER): ");
        role = ERole.valueOf(scanner.nextLine().trim().toUpperCase());

        // Birthday
        System.out.print("Doğum Tarihi (YYYY-MM-DD) : ");
        birthDate = LocalDate.parse(scanner.nextLine().trim());

        // Auto Increment ID
        int generatedId = registerDao.generateNewId();
        RegisterDto register = new RegisterDto();
        /*
        UNDERGRADUATE, // Lisans
        GRADUATE,      // Yüksek Lisans
        PHD,           // Doktora
        OTHER          // Diğerleri
         */

        // Eğer Rol (Öğrenciyse)
        if (role == ERole.STUDENT) {
            System.out.print("Öğrenci Türünüz (UNDERGRADUATE,GRADUATE,PHD,OTHER): ");
            EStudentType studentType = EStudentType.valueOf(scanner.nextLine().trim().toUpperCase());
            // Öğrenci Oluştur
            StudentDto student = new StudentDto(generatedId, name, surname, birthDate, studentType, role);

            // Kayıt Oluştur
            register = new RegisterDto(generatedId, nickname, email, password, "STUDENT".toUpperCase(), false, student, null);
            studentDao.create(student);
        } else if (role == ERole.TEACHER) {
            /*
            MATHEMATICS,
            CHEMISTRY,
            BIOLOGY,
            HISTORY,
            COMPUTER_SCIENCE,
            OTHER
             */
            System.out.print("Uzmanlık Alanınız (MATHEMATICS,CHEMISTRY,BIOLOGY,HISTORY,COMPUTER_SCIENCE,OTHER): ");
            ETeacherSubject eTeacherSubject = ETeacherSubject.valueOf(scanner.nextLine().trim().toUpperCase());
            System.out.print("Deneyim yılınızı giriniz: ");
            int yearsOfExperience = scanner.nextInt();

            System.out.print("Maaş bilginiz giriniz: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // maaş sonra tekrara geldiğinde double sonras String scanner hata almamak için

            // Öğretmen Oluştur
            TeacherDto teacher = new TeacherDto(generatedId, name, surname, birthDate, eTeacherSubject, yearsOfExperience, false, salary);

            // Kayıt oluştur     StudentDto studentDto, TeacherDto teacherDto
            register = new RegisterDto(generatedId, nickname, email, password, "TEACHER".toUpperCase(), false, null, teacher);
            teacherDao.create(teacher);
        }

        registerDao.create(register);
        System.out.println("Kayıt İşlemi başarılı Giriş yapabilirsiniz.");
    }

}
