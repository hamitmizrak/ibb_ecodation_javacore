package com.hamitmizrak.tutorials.oop.abstractx;

public class MainAbstract {

    public static void main(String[] args) {

        // Person
        Person studentPolymorphism=new Student("studentPolymorphism Student adı-1","studentPolymorphism Student soyadı-1","special data");
        studentPolymorphism.fullName();
        System.out.println(studentPolymorphism);

        Person teacherPolymorphism=new Teacher("teacherPolymorphism Student adı-1","teacherPolymorphism Student soyadı-1");
        teacherPolymorphism.fullName();
        System.out.println(teacherPolymorphism);

        System.out.println("**********************************");

        // Student
        Student student=new Student("öğrenci adı-1","öğrenci soyadı-1","öğrenciye özel");
        student.fullName();
        System.out.println(student);
        System.out.println("**********************************");

        // Teacher
        Teacher teacher=new Teacher("teacher adı-1","teacher soyadı-1");
        teacher.fullName();
        System.out.println(teacher);
    }
}
