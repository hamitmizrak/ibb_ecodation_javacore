package com.hamitmizrak._2_week;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _15_3_LocalDateTime {

    // Yeni nesil Date
    // LocalDateTime (1)
    public static void localDateFormatMethod1() {

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
    public static void localDateFormatMethod2() {
    }

    // PSVM
    public static void main(String[] args) {
        localDateFormatMethod1();
    }

}
