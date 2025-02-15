package com.hamitmizrak._2_week;

import java.util.Formatter;

// Formatter
// s
// d
// f
public class _12_2_StringFormat {

    // formatter1
    public static void formatter1(){
        Formatter formatter= new Formatter();
        formatter.format(" Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ","Hamit",11223344,44.23);
        System.out.println(formatter);
        formatter.close(); // Belleği serbest bırakma
    }

    public static void main(String[] args) {
        formatter1();
    }
}
