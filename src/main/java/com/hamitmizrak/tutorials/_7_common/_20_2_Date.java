package com.hamitmizrak.tutorials._7_common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _20_2_Date {

    public static void main(String[] args) {

        // 1 ocak 1970
        System.out.println(System.currentTimeMillis());
        Long times=System.currentTimeMillis();
        Date date= new Date(times);
        System.out.println(date);

        ///////////////////////////////////////////
        Locale locale= new Locale("tr","TR");
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss",locale);
        Date date1= new Date();
        String turkishDate= simpleDateFormat.format(date1);
        System.out.println(turkishDate);
    }
}
