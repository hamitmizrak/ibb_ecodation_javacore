package com.hamitmizrak.tutorials.common;

import java.util.Scanner;

public class _18_5_Example_TriangleHypotenuse {

    public static void main(String[] args) {
        // Basit Hesap Makinesi
        Scanner scanner=new Scanner(System.in);
        int number1,number2;
        double hypotenuse;
        System.out.println("Lütfen üçgenin bir kenarını giriniz");
        number1=scanner.nextInt();

        System.out.println("Lütfen üçgenin bir kenarını giriniz");
        number2=scanner.nextInt();

        hypotenuse=Math.sqrt(Math.pow(number1,2)+Math.pow(number2,2));
        System.out.println("hypotenuse: "+hypotenuse);


    }
}
