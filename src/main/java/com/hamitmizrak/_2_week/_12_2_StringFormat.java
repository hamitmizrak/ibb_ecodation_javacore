package com.hamitmizrak._2_week;

import java.util.Formatter;


/*
 Garbarage Collectors:
 Yalnızca ama yalnızca kapalı olmayan dosya, scanner, formatter vb yapılarda otomatik kapanmaz eğer biz bunu manuel olarak kapatmazsak bu kapatılmayan nesneyi temizleyebilir ancak açık olan dosyayı kapatmazsak cache belleği kullanmaya devam eder.
*/
// Formatter
// s
// d
// f
public class _12_2_StringFormat {

    // formatter1
    public static void formatter1() {
        // Eğer new Formatter yazarsak close() ile manuel kapatmak zorundayız.
        Formatter formatter = new Formatter();
        formatter.format("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", "Hamit", 11223344, 44.23);
        System.out.println(formatter);
        formatter.close(); // Belleği serbest bırakma
    }

    // formatter2 (Best Practice)
    public static void formatter2() {
        // Eğer String.format() yazarsak kapatmak zorunda değiliz GC(Garbarage Collector) otomatik çalışır
        String formatterString = String.format("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", "Hamit", 11223344, 44.23);
        System.out.println(formatterString);
    }

    // formatter (Best Practice)
    public static void formatter3(){

    }

    // formatter4
    public static void formatter4() {
        System.out.printf("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", "Hamit", 11223344, 44.23);
    }

    public static void main(String[] args) {
        // formatter1();
        //formatter2();
         formatter3();
        //formatter4();
    }
}
