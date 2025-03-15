package com.hamitmizrak.controller;

import com.hamitmizrak.dao.RegisterDao;
import com.hamitmizrak.dao.StudentDao;
import com.hamitmizrak.dao.TeacherDao;
import com.hamitmizrak.dto.*;
import com.hamitmizrak.utils.SpecialColor;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class LoginRegisterController {
    // Field
    private final RegisterDao registerDao;
    private final StudentDao studentDao;
    private final TeacherDao teacherDao;
    private final StudentController studentController;
    private final TeacherController teacherController;
    private final Scanner scanner;

    // Constructor
    public LoginRegisterController() {
        registerDao = new RegisterDao();
        studentDao = new StudentDao();
        teacherDao = new TeacherDao();
        studentController = new StudentController();
        teacherController = new TeacherController();
        scanner = new Scanner(System.in);
    }

    /// ///////////////////////////////////////////////////////////
    // Role Method
    public void isUserRole(RegisterDto registerDto) {
        if (registerDto.getRole().equalsIgnoreCase("STUDENT")) {
            studentController.chooise();
        } else if (registerDto.getRole().equalsIgnoreCase("TEACHER")) {
            teacherController.chooise();
        } else if (registerDto.getRole().equalsIgnoreCase("ADMIN")) {
            System.out.println("ADMIN SAYFASINA HOŞGELDİNİZ");
        } else {
            System.out.println("Yetkilendirilme yapılmamıştır lütfen admine başvurunuz. tel: 111-11-11-11");
        }
    }

    /// LOGIN
    public void login() {
        // Kalan Hak sayısı
        int maxAttempts = 3;
        Map<String,Integer> loginAttemps = new HashMap<>();

        while (true) {
            System.out.println("\n==== GİRİŞ EKRANI ====");
            String email, password, nickname;

            System.out.print("Email adresiniz: ");
            email = scanner.nextLine().trim();


            System.out.print("Nickname adresiniz: ");
            nickname = scanner.nextLine().trim();

            System.out.print("Şifreniz: ");
            password = scanner.nextLine().trim();

            // Email var mı yok mu ?
            Optional<RegisterDto> findIsEmail = registerDao.findByEmail(email);
            if (findIsEmail.isPresent()) {
                // user bilgileri al
                RegisterDto user = findIsEmail.get();

                // Kullanıcı kilitli mi ?
                if(user.isLocked()){
                    System.out.println("Hata Hesabınız kilitlenmiştir. Lütfen yöneticinizle irtibata geçiniz");
                    return;
                }

                // Email ve Şifre doğrulama
                if ((user.getEmailAddress().equals(email)||user.getNickname().equals(nickname)) && user.validatePassword(password)) {
                    System.out.println(SpecialColor.GREEN + "Başarıyla giriş yaptınız " + SpecialColor.RESET + SpecialColor.BLUE + "Hoşgeldiniz" + email + SpecialColor.RESET);
                    // Kullanıcı rolüne göre ilgili sayfaya yönlendirmek
                    isUserRole(user);
                    break;
                }else{
                    // Yanlış giriş saysıını artır
                    loginAttemps.put(email,loginAttemps.getOrDefault(email,0)+1);
                    int attempts = loginAttemps.get(email);

                    // Kalan Hak
                    int remaining= maxAttempts-attempts;
                    System.out.println("Hata: Kullanıcı adınız veya şifreniz yanlıştır"+ SpecialColor.BLUE+"Kalan hakkınız: "+remaining+SpecialColor.RESET);

                    // 3 kez yanlış girme hakkınu doldurduktan sonra kullanıcıyı sistemde kilitlensin
                    if(attempts>=maxAttempts){
                        user.setLocked(true);
                        System.out.println("Hata: Kullanıcı 3 kez hata girişi yaptğından sistem tarafından kilitlenmiştir");
                        return;
                    }
                }
            }else {
                System.out.println("Kullanıcı bulunamadı Önce Kayıt olmalısınız");
                register();
            }
        }
    }

    /// REGISTER
    private void register() {
        System.out.println("\n"+SpecialColor.BLUE+" Yeni Kullanıcı Kaydı"+SpecialColor.RESET);
        String name,surname,email, nickname, password;
        LocalDate birthDate;
        ERole role;

        // Name
        System.out.print("Name adresiniz: ");
        name= scanner.nextLine().trim();

        // Surname
        System.out.print("Surname adresiniz: ");
        surname= scanner.nextLine().trim();

        // Nickname
        System.out.print("Nickname giriniz: ");
        nickname= scanner.nextLine().trim();

        // Email
        System.out.print("Email adresiniz: ");
        email= scanner.nextLine().trim();

        // Şifre
        System.out.print("Şifrenizi giriniz: ");
        password= scanner.nextLine().trim();

        // Role
        System.out.print("Role giriniz (STUDENT, TEACHER): ");
        role= ERole.valueOf(scanner.nextLine().trim().toUpperCase());

        // Birthday
        System.out.print("Doğum Tarihi: ");
        birthDate= LocalDate.parse(scanner.nextLine().trim());

        // Auto Increment ID
        int generatedId= registerDao.generateNewId();
        RegisterDto register = null;
        /*
        UNDERGRADUATE, // Lisans
        GRADUATE,      // Yüksek Lisans
        PHD,           // Doktora
        OTHER          // Diğerleri
         */

        // Eğer Rol (Öğrenciyse)
        if(role == ERole.STUDENT){
            System.out.print("Öğrenci Türünüz (UNDERGRADUATE,GRADUATE,PHD,OTHER): ");
            EStudentType studentType= EStudentType.valueOf(scanner.nextLine().trim().toUpperCase());
            // Öğrenci Oluştur
            StudentDto student= new StudentDto(generatedId,name,surname,birthDate, studentType,role);

            // Kayıt Oluştur
            register= new RegisterDto(generatedId,nickname, email,password,"STUDENT".toUpperCase(),false,student, null);
            studentDao.create(student);
        } else if(role == ERole.TEACHER) {
            /*
            MATHEMATICS,
            CHEMISTRY,
            BIOLOGY,
            HISTORY,
            COMPUTER_SCIENCE,
            OTHER
             */
            System.out.print("Uzmanlık Alanınız (MATHEMATICS,CHEMISTRY,BIOLOGY,HISTORY,COMPUTER_SCIENCE,OTHER): ");
            ETeacherSubject eTeacherSubject= ETeacherSubject.valueOf(scanner.nextLine().trim().toUpperCase());
            System.out.print("Deneyim yılınızı giriniz: ");
            int yearsOfExperience= scanner.nextInt();

            System.out.print("Maaş bilginiz giriniz: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // maaş sonra tekrara geldiğinde double sonras String scanner hata almamak için

            // Öğretmen Oluştur
            TeacherDto teacher = new TeacherDto(generatedId, name, surname, birthDate,eTeacherSubject,yearsOfExperience,false,salary );

            // Kayıt oluştur     StudentDto studentDto, TeacherDto teacherDto
            register= new RegisterDto(generatedId,nickname, email,password,"TEACHER".toUpperCase(),false,null,teacher);
            teacherDao.create(teacher);
        }

        registerDao.create(register);
        System.out.println("Kayıt İşlemi başarılı Giriş yapabilirsiniz.");
    }

}

