package com.hamitmizrak.tutorials.oop.encapsulationdata;

// Encapsulation
// POJO: Plain Old Java Object: field+getterandsetter
// BEAN: Pojo+constructor+toString...
public class Person {

    // Field
    private String name;
    private int age;

    // Getter And Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }else{
            System.err.println("Yaş için Sıfırdan Küçük giremezsiniz");
            this.age=Math.abs(age);
        }

    }
}
