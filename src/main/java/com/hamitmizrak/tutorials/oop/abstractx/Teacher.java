package com.hamitmizrak.tutorials.oop.abstractx;

import java.io.Serializable;

// Student
// POJO
public class Teacher  extends Person implements Serializable  {

    // Serilestirme
    public static final long serialVersionUID=1L;

    public Teacher() {
    }

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Teacher Gövdesiz Method");
    }
}//end Class
