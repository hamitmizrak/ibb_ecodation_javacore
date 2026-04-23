package com.hamitmizrak.tutorials.oop;

import java.io.Serializable;
import java.util.Objects;

// Student
// POJO
public class Student implements Serializable {

    // Serilestirme
    public static final long serialVersionUID=1L;

    //Variable
    private String name;
    private String surname;

    // Constructor (Parametresiz)
    public Student() {
    }

    // Constructor (Parametreli)
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    // Method
    public String fullName(){
        return  this.name+" "+this.surname;
    }

    // GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.length()>=3){
            this.surname = surname.toUpperCase().substring(0,3);
        }
        this.surname = surname.toUpperCase();
    }
}//end Class
