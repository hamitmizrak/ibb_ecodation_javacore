package com.hamitmizrak.tutorials.oop.interfacex;

public class MainInterface {

    public static void main(String[] args) {

        // Student
        Student student=new Student("öğrenci adı-1","öğrenci soyadı-1","öğrenciye özel");
        student.fullName();
        System.out.println(student);
        System.out.println("interface");
        student.getUp();
        student.eat();
        student.goToSchool();
        student.comeFromSchool();
        student.interfaceGovdeliMethod();

        System.out.println("**********************************");

        // Teacher
        Teacher teacher=new Teacher("teacher adı-1","teacher soyadı-1");
        teacher.fullName();
        System.out.println("interface");
        teacher.getUp();
        teacher.eat();
        teacher.goToSchool();
        teacher.comeFromSchool();
        teacher.interfaceGovdeliMethod();
    }
}
