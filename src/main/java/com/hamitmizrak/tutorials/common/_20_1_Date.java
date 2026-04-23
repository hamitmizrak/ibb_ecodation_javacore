package com.hamitmizrak.tutorials.common;
import java.util.Date;

public class _20_1_Date {

    public static void main(String[] args) {

        //java.util.Date date= new Date();
        Date date= new Date();
        System.out.println(date);

        // GET
        // Pazar:0 Pazartesi:1 Cuma:5
        System.out.println("Hafta Günü: "+date.getDay());

        // Aylar: Saymaya Sıfırdan başlar
        System.out.println("Ay: "+date.getMonth());

        // Yıl: 1900
        System.out.println("Yıl: "+date.getYear());
        System.out.println("Yıl: "+(1900+date.getYear()));

        // Saat
        System.out.println("Saat: "+date.getHours());
        System.out.println("Dakika: "+date.getMinutes());
        System.out.println("Saniye: "+date.getSeconds());

        String fullDateTime=date.getHours()+":"+date.getMinutes()+":"+ date.getSeconds();
        System.out.println(fullDateTime);

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(date.getHours()).append(":").append(date.getMinutes()).append(":").append(date.getSeconds());
        String toChangeDate=stringBuilder.toString();
        System.out.println(toChangeDate);

        ////////////////////////////////////
        // SET
        System.out.println(date.getMinutes());
        date.setMinutes(55);
        System.out.println(date.getMinutes());
    }
}
