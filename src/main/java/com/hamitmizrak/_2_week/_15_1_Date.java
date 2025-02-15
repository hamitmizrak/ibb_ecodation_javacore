package com.hamitmizrak._2_week;

import java.util.Date;

public class _15_1_Date {

    // Date
    public static void dateMethod() {
        //java.util.Date date= new Date();
        Date now = new Date();
        System.out.println("Şu andaki zaman: " + now);
        System.out.println("1 ocak 1970 yılından şimdi ki zamana kadar geçen sürenin milisaniye cinsinden:" + now.getTime());
        System.out.println("Date:" + now.getDate());

        System.out.println("#######################");
        System.out.println("Day:" + now.getDay());
        System.out.println("Month:" + now.getMonth()); // Saymaya Sıfırdan başlar 0=Ocak 1=Şubat
        System.out.println("Year:" + (1900 + now.getYear()));  // 1900(Ekle veya Çıkar)
        System.out.println("Date yıl:" + (2025 - now.getYear()));
        System.out.println("Hours:" + now.getHours());
        System.out.println("Minutes:" + now.getMinutes());
        System.out.println("Seconds:" + now.getSeconds());
    }


    public static String nowFormat1() throws NullPointerException {
        Date now = new Date();
        String specialFormat = "Zaman: "
                .concat(now.getHours())
                .concat(now.getMinutes())
                .concat(now.getSeconds())
                .toString();
        return specialFormat;
    }


    // PSVM
    public static void main(String[] args) {
        //dateMethod();
        nowFormat1();
    }
}
