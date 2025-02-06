package com.hamitmizrak._1_part_javatypes;

public class _02_Variables {

    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken;
        // veri isimlendirmeleri;
        // 1-) isim, veya sıfat, zamir kullanmamız lazım.
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


    }
}
