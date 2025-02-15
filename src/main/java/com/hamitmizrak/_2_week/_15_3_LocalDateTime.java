package com.hamitmizrak._2_week;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _15_3_LocalDateTime {

    // Yeni nesil Date
    // LocalDateTime (1)
    public static void localDateFormatGetMethod1() {

        LocalDateTime now = LocalDateTime.now();
        Locale locale = new Locale("tr", "TR");

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);

        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss",locale);
        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss",locale);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss", locale);

        // Normal Çıktı
        System.out.println("Şu andaki zaman: " + now);
        System.out.println("Şu andaki zaman: " + now.format(formatter));
    }

    // LocalDateTime (2)
    public static void localDateFormatGetMethod2() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Gün:"+now.getDayOfMonth());
        System.out.println("Kaçıncı Ay:"+now.getMonthValue());
        System.out.println("Yıl:"+now.getYear());
        System.out.println("Saat:"+now.getHour());
        System.out.println("Dakika:"+now.getMinute());
        System.out.println("Saniye:"+now.getSecond());
        System.out.println("######################################");
    }

    public static void localDateFormatSetMethod2() {
        Locale locale = new Locale("tr", "TR");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss", locale);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newData= now
                .withDayOfMonth(11) //
                .withMonth(12)  //
                .withYear(2029)
                .withHour(14)
                .withMinute(44)
                .withSecond(23);
        //System.out.println(now);
        System.out.println("Normal Tarih: "+now);
        System.out.println("Değiştirilmiş Tarih: "+newData.format(formatter));
    }

    // PSVM
    public static void main(String[] args) {
        //localDateFormatGetMethod1();
        //localDateFormatGetMethod2();
        localDateFormatSetMethod2();
    } //end psvm
} //end class
