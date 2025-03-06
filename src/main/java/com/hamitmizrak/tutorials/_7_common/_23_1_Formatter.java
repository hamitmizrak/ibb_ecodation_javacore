package com.hamitmizrak.tutorials._7_common;

import java.util.Date;

public class _23_1_Formatter {

    public static void main(String[] args) {
        String kelime="Java se Öğreniyorum";
        int sayi=44;
        float virgullu=14.53f;
        Date tarih=new Date(System.currentTimeMillis());

        // S D F
        System.out.printf("%s %d %f ",kelime,sayi,virgullu);
        System.out.println("\n***********");
        System.out.printf("%30s %d %f ",kelime,sayi,virgullu);
        System.out.println("\n***********");
        System.out.printf("%30s %10d %f ",kelime,sayi,virgullu);
        System.out.println("\n***********");
        System.out.printf("%30s %10d %2.3f ",kelime,sayi,virgullu);
        System.out.println("\n***********");
        System.out.printf("%-30s %10d %2.3f ",kelime,sayi,virgullu);
        System.out.println("\n***********");
        System.out.printf("%30s %10d %2.3f",kelime,sayi,virgullu);
    }
}
