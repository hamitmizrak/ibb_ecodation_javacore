package com.hamitmizrak.tutorials._7_common;

import java.util.Scanner;

public class _18_4_Example_VKI {

    public static void main(String[] args) {
        // Basit Hesap Makinesi
        Scanner scanner=new Scanner(System.in);
        double height,weight,result;
        System.out.println("Lütfen boy cm cinsinden giriniz");
        height=scanner.nextDouble();

        System.out.println("Lütfen Kilo kg cinsinden giriniz");
        weight=scanner.nextDouble();

        result=(weight/ (height*height));
        System.out.println("VKI: "+result);


    }
}
