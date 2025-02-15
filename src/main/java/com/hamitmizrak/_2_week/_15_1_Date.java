package com.hamitmizrak._2_week;

import java.util.Date;

public class _15_1_Date {

    // Date (GET)
    public static void dateGetMethod() {
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

    // Date (GET)
    public static void dateSetMethod() {

    }


    // 1.YÖNTEM()
    public static String nowFormat1() throws NullPointerException {
        Date now = new Date();
        String specialFormat = "Şimdiki Zaman: "
                .concat(String.valueOf(now.getHours()))
                .concat(":")
                .concat(String.valueOf(now.getMinutes()))
                .concat(":")
                .concat(String.valueOf(now.getSeconds()))
                .toString();
        return specialFormat;
    }

    // 2.YÖNTEM()
    public static String nowFormat2() throws NullPointerException {
        Date now = new Date();
        // %s: String
        // %d: Decimal
        // %f: Float
        return String.format("Şimdiki Zaman: %02d:%02d:%02d", now.getHours(), now.getMinutes(), now.getSeconds());
    }

    // 3.YÖNTEM()
    public static String nowFormat3() throws NullPointerException {
        return new Date(String.format("Şimdiki Zaman: %02d:%02d:%02d", now.getHours(), now.getMinutes(), now.getSeconds())).toString() ;
    }


    // PSVM
    public static void main(String[] args) {
        //dateMethod();

       /* String nowDate = nowFormat1();
        System.out.println(nowDate);*/

        String nowDate2 = nowFormat2();
        System.out.println(nowDate2);

        String nowDate3 = nowFormat3();
        System.out.println(nowDate3);


    }
}
