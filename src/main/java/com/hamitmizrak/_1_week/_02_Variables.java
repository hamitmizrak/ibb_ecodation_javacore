package com.hamitmizrak._1_week;

public class _02_Variables {

    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken;
        // veri isimlendirmeleri;
        // 1-) isim, veya sıfat, zamir kullanmamız lazım.
        // Anlamlı ve açıklayıcı isimler seçiniz
        // int studentCounter=11;
        // float totalSalary=14.5355f;
        int schoolNumber = 23;
        System.out.println(schoolNumber);

        schoolNumber = 44;
        System.out.println(schoolNumber);

        //2-) _ veya $ ile başlayabilirsiniz
        int _schoolNumber = 55;
        System.out.println(_schoolNumber);

        //2-) _ veya $ ile başlayabilirsiniz
        int $schoolNumber = 99;
        System.out.println($schoolNumber);

        // 3-) sayı ile bitebilir.
        int schoolNumber123 = 105;
        System.out.println(schoolNumber123);

        /*
            4-) Sayı ile başlanmaz
            5-) _veya$ dışında özel simgelerle başlanmaz
            6-) değişken isimlerini camelCase kuralına göre yazılır
         */
        // yazamazsınız
        //int schoolNumber=11; // aynı isimde yazamazsınız
        //int 44schoolNumber=11; // sayıyla başlayamazsınız.
        //int ~schoolNumber=11;   // özel simgeyle başlayamazsınız.
        //int ``schoolNumber=11;   // özel simgeyle başlayamazsınız.
        //int   school-number=99;    // kebab-case yazamazsınız.
        //System.out.println(school-number);
        //int school number=66;  // değişkenlerde boşluk kullanılamaz

        // yazmayalım
        float totalSalary = 14.5355f;
        System.out.println(totalSalary);

        // SABIT
        final int MAX_STUDENTS = 100;
        System.out.println(MAX_STUDENTS);
    }
}
