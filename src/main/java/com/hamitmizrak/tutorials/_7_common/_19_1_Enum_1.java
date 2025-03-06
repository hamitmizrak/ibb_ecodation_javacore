package com.hamitmizrak.tutorials._7_common;

// Enum Java 1.5 ile gelen özelliktir.
// Type Safe
public class _19_1_Enum_1 {
    // Enum
    enum Days{
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
    } //end enum

    // psvm
    public static void main(String[] args) {
        Days days=Days.PAZARTESI;
        System.out.println(days);

        // getClass, type(instanceof)
        System.out.println("CLASS NAME: "+days.getClass());
        System.out.println(days instanceof Days);

        //Enum toString()
        String data=Days.PAZARTESI.toString();
        System.out.println(data.toLowerCase());

        // Enum: Sıfırdan sayarak Gelir
        System.out.println("Sıra: "+Days.PAZARTESI.ordinal());

        // Enum: Values
        System.out.println("Value: "+Days.PAZARTESI.values()[0]);

        // Döngüsel
        for( Days temp :Days.values()){
            System.out.print(temp+ " ");
        }
    }
} //end class
