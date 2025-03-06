package com.hamitmizrak.tutorials._7_common;

import java.util.Date;
import java.util.Formatter;

public class _23_2_Formatter {

    public static void main(String[] args) {
        String kelime="Java se Öğreniyorum";
        int sayi=44;
        float virgullu=14.53f;
        Date tarih=new Date(System.currentTimeMillis());
        System.out.println(tarih);

        Formatter formatter=new Formatter();
        formatter.format("%30s %10d %2.3f %tH,%tm",kelime,sayi,virgullu,tarih,tarih);
        String toChangeString=formatter.toString();
        System.out.println(toChangeString);

    }
}
