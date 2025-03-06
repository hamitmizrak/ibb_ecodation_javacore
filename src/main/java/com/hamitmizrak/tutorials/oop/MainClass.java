package com.hamitmizrak.tutorials.oop;

public class MainClass {
    public static void main(String[] args) {

        // 1Student instance
        Student student1=new Student();
        student1.setName("adı-1");
        student1.setSurname("soyadı-1");
        System.out.println(student1.fullName());
        System.out.println(student1);

        System.out.println("***********************");
        // 1Student instance
        Student student2=new Student("adı-2","soyadı-2");
        System.out.println(student2.fullName());
        System.out.println(student2);

    }
}

// break : Döngüyü kırıyor çalışmıyor
// return: Döngüyü kırıyor çalışmıyor
// continue : o şarta çalışmıyor sonra döngü devam ediyor.
