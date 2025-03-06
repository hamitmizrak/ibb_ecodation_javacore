package com.hamitmizrak.tutorials.oop.interfacex;

import java.io.Serializable;

// Student
// POJO
public class Student extends Person implements Serializable  {

    // Sadece Student
    private String studentSpecial;


    // Serilestirme
    public static final long serialVersionUID=1L;

    public Student() {
    }

    public Student(String name, String surname,String studentSpecial) {
        super(name, surname);
        // studentSpecial=xyz;
        this.studentSpecial=studentSpecial;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentSpecial='" + studentSpecial + '\'' +
                "} " + super.toString();
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Student Gövdesiz Method");
    }


    // INTERFACE
    @Override
    public void getUp() {
        System.out.println("Öğrenci Ayağa kalktı");
    }

    @Override
    public void eat() {
        System.out.println("Öğrenci Yemek yedi");
    }

    @Override
    public void goToSchool() {
        System.out.println("Öğrenci Okula Gitti");
    }

    @Override
    public void comeFromSchool() {
        System.out.println("Öğrenci Okuldan Geldi");
    }


    @Override
    public void interfaceGovdeliMethod() {
        super.interfaceGovdeliMethod();
        System.out.println("Student tinterface Gövdeli");
    }
}//end Class
