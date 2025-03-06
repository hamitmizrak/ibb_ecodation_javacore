package com.hamitmizrak.tutorials.oop.interfacex;

import java.io.Serializable;
import java.util.Objects;

// Abstract
abstract public class Person implements IPersonCommonFeatures, Serializable {

    // Serilestirme
    public static final long serialVersionUID=1L;

    //Variable
    private String name;
    private String surname;

    // Constructor (Parametresiz)
    public Person() {
    }

    // Constructor (Parametreli)
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    // Method (Gövdeli)
    public String fullName(){
        return  this.name+" "+this.surname;
    }

    // Method (Gövdesiz)
   abstract public void govdesizMethod();

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
}
