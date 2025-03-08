package com.hamitmizrak.tutorials.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _20_4_LocalDate {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        //Pattern
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
        String date=dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(date);
    }
}
