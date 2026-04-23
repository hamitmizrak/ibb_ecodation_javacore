package com.hamitmizrak.tutorials._2_week;

import java.util.Scanner;

public class Week2_Examples_1 {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen Pozitif bir sayı giriniz");
        int number=klavye.nextInt();

        // Validation
        // 1-) Kullanıcı pozitif bir sayı girmezse? (Math.abs(), Negatif sayı çarp)
        // 2-) Kullanıcı harf girerse
        // 3-) Sıfır(Çift)
        if(number<0){
            System.out.println("Negatif bir sayı girdiniz");
            //number=Math.abs(number);
            number=number*(-1);
        }

        if(number%2==0){
            System.out.println(number+" sayı Çift sayıdır");
        }else {
            System.out.println(number+" sayı Tek sayıdır");
        }
    }
}
