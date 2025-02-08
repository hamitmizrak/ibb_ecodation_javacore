package com.hamitmizrak._1_week;


import java.util.Scanner;

public class _08_1_Scanner {

    public static void main(String[] args) {

        // Field
        String name,surname;
        int language;

        //Kullanıcıdan veri almak istiyorsak
        Scanner klavye= new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz:");
        name=klavye.next();

        System.out.println("Lütfen soyadınız giriniz:");
        surname=klavye.nextLine();

        // String'ten int geçerken Scanner nasıl çözebiliriz ?
        System.out.println("Bildiğiniz Diller & Teknolojiler");
        language=klavye.nextInt();

        System.out.println("Adınız: "+name+" Soyadınız: "+surname+""+"\ndiller: "+language);

        // kullanmadığım Scanner nesnesini kapatalım.
        klavye.close();
    }
}
