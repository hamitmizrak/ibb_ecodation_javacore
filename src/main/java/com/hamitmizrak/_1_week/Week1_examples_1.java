package com.hamitmizrak._1_week;

import java.util.Scanner;

/*
1. 1. Dereceden 1 Bilinmeyenli Denklemi Çözme (Scanner kullanlalım)
      Soru:
      Kullanıcıdan ax + b = 0 denklemindeki a ve b değerlerini alıp x'i hesaplayan programı yazınız.
      Çözüm:
 */

public class Week1_examples_1 {

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Variable
        double aValue, bValue = 0, result;

        System.out.println("Lütfen b değerini giriniz:");
        bValue = scanner.nextDouble();

        System.out.println("Lütfen a değerini giriniz:");
        aValue = scanner.nextDouble();

        // if else
        // ax+b=0 x=-b/a
        result = (-bValue / aValue);
        System.out.println("a değeri: " + aValue + " b değeri: " + bValue + " Sonuç: " + result);

        scanner.close();
    }
}
