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

    private static final Logger logger = Logger.getLogger(LoginRegisterController.class.getName());
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

            Optional<RegisterDto> findIsEmail = registerDao.findByEmail(email);
            if (findIsEmail.isPresent()) {
                RegisterDto user = findIsEmail.get();

                if (user.isLocked()) {
                    System.out.println("Hesabınız kilitli.");
                    return;
                }

                if (user.validatePassword(password)) {
                    System.out.println(SpecialColor.GREEN + "Başarıyla giriş yaptınız " + SpecialColor.RESET +
                            SpecialColor.BLUE + "Hoşgeldiniz " + email + SpecialColor.RESET);
                    isUserRole(user);
                    break;
                } else {
                    loginAttempts.put(email, loginAttempts.getOrDefault(email, 0) + 1);
                    int remaining = maxAttempts - loginAttempts.get(email);
                    System.out.println("Hata: Kullanıcı adı veya şifre yanlış. Kalan hakkınız: " + remaining);

                    if (remaining == 0) {
                        user.setLocked(true);
                        registerDao.update(user.getId(), user);
                        System.out.println("Hata: 3 yanlış giriş nedeniyle hesap kilitlendi.");
                        return;
                    }
                }
            } else {
                System.out.println("Kullanıcı bulunamadı! Önce kayıt olmalısınız.");
                register();
            }
        }
    }

    private void register() {
        System.out.println("\n" + SpecialColor.BLUE + " Yeni Kullanıcı Kaydı" + SpecialColor.RESET);
        String name, surname, email, nickname, password;
        LocalDate birthDate;
        ERole role;

        System.out.print("Name: ");
        name = scanner.nextLine().trim();
        System.out.print("Surname: ");
        surname = scanner.nextLine().trim();
        System.out.print("Nickname: ");
        nickname = scanner.nextLine().trim();
        System.out.print("Email: ");
        email = scanner.nextLine().trim();
        System.out.print("Şifre: ");
        password = scanner.nextLine().trim();

        while (true) {
            try {
                System.out.print("Role giriniz (STUDENT, TEACHER): ");
                role = ERole.valueOf(scanner.nextLine().trim().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Hatalı giriş! Lütfen doğru rolü girin (STUDENT, TEACHER).");
            }
        }

        while (true) {
            try {
                System.out.print("Doğum Tarihi (YYYY-MM-DD) : ");
                birthDate = LocalDate.parse(scanner.nextLine().trim());
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Hatalı tarih formatı! Lütfen tekrar deneyin (YYYY-MM-DD).");
            }
        }

        int generatedId = registerDao.generateNewId();
        RegisterDto register;

        if (role == ERole.STUDENT) {
            System.out.print("Öğrenci Türünüz (UNDERGRADUATE, GRADUATE, PHD, OTHER): ");
            EStudentType studentType = EStudentType.valueOf(scanner.nextLine().trim().toUpperCase());
            StudentDto student = new StudentDto(generatedId, name, surname, birthDate, studentType, role);
            register = new RegisterDto(generatedId, nickname, email, password, "STUDENT", false, student, null);
            studentDao.create(student);
        } else {
            System.out.print("Uzmanlık Alanınız (MATHEMATICS, CHEMISTRY, BIOLOGY, HISTORY, COMPUTER_SCIENCE, OTHER): ");
            ETeacherSubject eTeacherSubject = ETeacherSubject.valueOf(scanner.nextLine().trim().toUpperCase());
            System.out.print("Deneyim yılınızı giriniz: ");
            int yearsOfExperience = scanner.nextInt();
            System.out.print("Maaş bilginizi giriniz: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            TeacherDto teacher = new TeacherDto(generatedId, name, surname, birthDate, eTeacherSubject, yearsOfExperience, false, salary);
            register = new RegisterDto(generatedId, nickname, email, password, "TEACHER", false, null, teacher);
            teacherDao.create(teacher);
        }

        registerDao.create(register);
        System.out.println("Kayıt İşlemi başarılı! Giriş yapabilirsiniz.");
    }
}