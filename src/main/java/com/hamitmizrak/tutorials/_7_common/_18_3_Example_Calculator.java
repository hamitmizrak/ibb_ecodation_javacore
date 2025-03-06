package com.hamitmizrak.tutorials._7_common;

import java.util.Scanner;

public class _18_3_Example_Calculator {

    public static void main(String[] args) {
        // Basit Hesap Makinesi
        Scanner scanner=new Scanner(System.in);
        int number1,number2;
        System.out.println("1.sayıyı giriniz");
        number1=scanner.nextInt();

        System.out.println("2.sayıyı giriniz");
        number2=scanner.nextInt();

        System.out.println("Toplama: "+(number1+number2));
        System.out.println("Çıkarma: "+(number1-number2));
        System.out.println("Çarpma: "+(number1*number2));
        System.out.println("Bölme: "+(number1/number2));
        System.out.println("Kalan: "+(number1%number2));
    }
}
