package com.hamitmizrak._2_week;
import java.util.Scanner;

/*
Kullanıcının Verdiği pozitif bir sayıya kadar toplamını yapan hesaplayan Algoritma ?
Şartlar - 1 : Kullanıcı eğer sayı olarak  100  fazla sayı girerse 100 kadar toplasın. (break)
Şartlar - 2 : Kullanıcı verdiği sayılar içinde eğer 47 varsa bunu toplamaya dahil etmesin.(continue)
Çıkan sonuç tek mi ? çift mi ?
 */
public class Week2_Examples_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir pozitif bir sayı giriniz");
        int number = Math.abs(scanner.nextInt());

        // Başlangıç değer
        int sum = 0;

        // Loop
        for (int i = 1; i <= number; i++) {
            // Eğer 47 varsa toplama
            if (i == 47) {
                System.out.println("Verdiğiniz sayıda 47 olduğu için bunu toplamaya dahil etmiyoruz.");
                continue; // 47 toplama dahil etme
            }

            // Eğer 100'den fazla verilirse
            if (i > 100) {
                System.out.println("Verdiğiniz sayı 100 büyük olduğu için sadece 1<=SAYI<=100 kadar toplama yapabilir.");
                break; // 100'den sonra toplamı durdur.
            }
            // Toplama
            // sum=sum+i; //1.YOL
            sum += i;
        }

        System.out.println("Toplam: " + sum);

        // Çıkan sonuç Çift mi ? Tek mi ?
        if (sum % 2 == 0)
            System.out.println(sum + " sayı çift");
        else
            System.out.println(sum + " sayı tek");

        // Klavye Kapat
        scanner.close();
    } //end psvm
} // end class
