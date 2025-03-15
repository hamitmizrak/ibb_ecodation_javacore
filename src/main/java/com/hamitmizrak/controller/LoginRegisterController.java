package com.hamitmizrak.controller;

import com.hamitmizrak.dao.RegisterDao;
import com.hamitmizrak.dao.StudentDao;
import com.hamitmizrak.dao.TeacherDao;
import com.hamitmizrak.dto.RegisterDto;
import com.hamitmizrak.utils.SpecialColor;

import java.util.Optional;
import java.util.OptionalInt;
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
        registerDao= new RegisterDao();
        studentDao= new StudentDao();
        teacherDao= new TeacherDao();
        studentController= new StudentController();
        teacherController= new TeacherController();
        scanner= new Scanner(System.in);
    }
    /// ///////////////////////////////////////////////////////////
    // Role Method
    public void isUserRole(RegisterDto registerDto){
        if(registerDto.getRole().equalsIgnoreCase("STUDENT")){
            studentController.chooise();
        }else if(registerDto.getRole().equalsIgnoreCase("TEACHER")){
            teacherController.chooise();
        }else if(registerDto.getRole().equalsIgnoreCase("ADMIN")){
            System.out.println("ADMIN SAYFASINA HOŞGELDİNİZ");
        }else{
            System.out.println("Yetkilendirilme yapılmamıştır lütfen admine başvurunuz. tel: 111-11-11-11");
        }
    }

    /// Login And Register
    public void loginOrRegister(){
        while(true){
            System.out.println("\n==== GİRİŞ EKRANI ====");
            String email,password,nickname;

            System.out.println("Email adresiniz");
             email=scanner.nextLine().trim();

            System.out.println("Nickname adresiniz");
            email=scanner.nextLine().trim();

            System.out.println("Şifreniz");
            password=scanner.nextLine().trim();

            // Email var mı yok mu ?
            Optional<RegisterDto> findIsEmail= registerDao.findByEmail(email);
            if(findIsEmail.isPresent()){
                // user bilgileri al
                RegisterDto user= findIsEmail.get();

                //if(user.)

                System.out.println(SpecialColor.GREEN+"Başarıyla giriş yaptınız "+SpecialColor.RESET+ SpecialColor.BLUE+"Hoşgeldiniz"+ email+SpecialColor.RESET);
                isUserRole(user);
                break;
            }
        }

    }


}
