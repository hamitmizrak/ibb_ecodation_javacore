package com.hamitmizrak.tutorials.oop.abstractx;

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
}//end Class
