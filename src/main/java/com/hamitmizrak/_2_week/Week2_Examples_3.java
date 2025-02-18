package com.hamitmizrak._2_week;


import com.hamitmizrak.utils.SpecialColor;

import java.util.Scanner;
/*
   Kullanıcıdan Girilen Sayının Faktoriyelini Bulma
   Soru:
   Kullanıcıdan bir tam sayı alarak faktöriyelini hesaplayan iterative ve recursive metota göre  programı yazınız.
   Validation-1:Kullanıcı Sıfırdan küçük bir sayı verene kadar hesaplama yapsın ?
   Validation-2: Kullanıcı Sıfırdan küçük sayı verirse döngü dursun(break)
   Validation-3: Kullanıcı eğer virgüllü sayı verirse, kullanıcıya tekrardan sayı girilmesi beklensin, Eğer kullanıcı 3 kere virgülü sayı girerse kullanıcın hakkı kalmadığından sistemden atsın(System.exit(0)).
   Çözüm:
*/

// System

// Access Modifier
public class Week2_Examples_3 {

    // Iterative Method
    public static void iterativeFactoriyel() {
        // Iterative
        // Variables
        // result:1 vermeliyiz ki, 1 sayısı çarpmada etkisizdir ve başlangıç değerimizdir.
        long number, result = 1;
        byte doubleRemainingRight = 3; // Ondalıklı sayı giriş hakkı
        boolean isActive = true;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Sonsuz Döngü
        while (true) {
            if (doubleRemainingRight > 0) {
                System.out.println("\nLütfen pozitif bir sayı giriniz");

                // Kullanıcıdan ondalıklı sayı girip girmediğini kontrol edelim
                if (scanner.hasNextInt()) {
                    number = scanner.nextLong();
                    if (number < 0) {
                        System.out.println(SpecialColor.RED + "Sıfırdan küçük bir sayı girdiniz sistem kapatılıyor" + SpecialColor.RESET);
                        //number = Math.abs(number);
                        break;             // 1.YOL(Yalnızca bulunduğu döngü veya switch bloğu etkiliyor)
                        //System.exit(0); // 2.YOL (JVM'yi kapatarak programı tamamem sonlandırıyor.)
                    } else if (number == 0) {
                        System.out.println(number + SpecialColor.BLUE + " sayısının faktöriyeli= 1");
                        result = 1;
                    } else {
                        result = 1;
                        for (int i = 1; i <= number; i++) {
                            //result=result*i;
                            result *= i;
                        }
                        System.out.println(number + SpecialColor.YELLOW + " sayısının " + number + "!=" + result + SpecialColor.RESET);
                    }
                } else if (scanner.hasNextDouble()) {
                    //doubleRemainingRight= (byte) (doubleRemainingRight-1);
                    doubleRemainingRight--; // Best practice
                    System.out.println(SpecialColor.RED + "Ondalıklı bir sayı girdiniz kalan hakkınız: " + doubleRemainingRight + SpecialColor.RESET);

                    if (doubleRemainingRight == 0) {
                        System.out.println("üç defa ondalıklı sayı girdiğinizde dolayı Program sonlandı");
                        isActive = false;
                        System.exit(0);
                    }
                    scanner.next(); // Geçersiz girdileri temizlemek içindir
                } else {
                    System.out.println(SpecialColor.RED + "Harf girdiniz." + SpecialColor.RESET);
                    //break;
                    scanner.next(); // Geçersiz girdileri temizlemek içindir
                } //end harf
            } else {
                System.out.println("Virgüllü sayı kalan hakkınız kalmadı ve program sonlanıyor(JVM) tarafından");
                System.exit(0);
            }
        } //end while
        // Scanner Close
        scanner.close();
    }


    // Recursive Method
    public static void recursiveFactoriyel() {

    }


    // PSVM
    public static void main(String[] args) {
        System.out.println("\nLütfen Seçim yapınız\n1-)Iterative Factoriyel\n2-)Recursive Factoriyel\n3-)Çıkış");
        Scanner scanner = new Scanner(System.in);
        int chooise = scanner.nextInt();
        switch (chooise) {
            case 1:
                iterativeFactoriyel();
                break;
            case 2:
                recursiveFactoriyel();
                break;
            default:
                System.out.println("Doğru seçim yapınız");
                break;
        }

    } // end class

}