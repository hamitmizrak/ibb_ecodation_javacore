package com.hamitmizrak.tutorials._7_common;

import java.time.LocalDate;
import java.time.LocalTime;
public class _20_5_LocalDate {

    // PSVM
    public static void main(String[] args) {

        //SET
        LocalDate date = LocalDate.of(2022, 1, 5);
        System.out.println(date);

        System.out.println("//////////////////////////////");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Hafta: "+localDate.getDayOfWeek());
        System.out.println("Ay: "+localDate.getDayOfMonth());

        System.out.println("Yıl: "+localDate.getYear());
        System.out.println("Ay: "+localDate.getMonth());

        System.out.println("//////////////////////////////");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println("Saat: "+localTime.getHour());
        System.out.println("Dakika: "+localTime.getMinute());
        System.out.println("Saniye: "+localTime.getSecond());
    }
}
