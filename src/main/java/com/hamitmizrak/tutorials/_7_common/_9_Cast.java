package com.hamitmizrak.tutorials._7_common;

public class _9_Cast {

    public static void main(String[] args) {
        // Cast(Dönüşüm)
        float f1=14.53f;
        long l1=4444444L;

        int number1=44;
        int number2=16;

        // Sayıyı String'e çevir
        String intToString=String.valueOf(number2);
        String intToString2=Integer.toString(number2);
        System.out.println(intToString);

        System.out.println((number1+number2));
        System.out.println((number1+intToString));

        //  String'i Sayıya çevir
        String value="23";
        int stringToInt1=Integer.valueOf(value);
        int stringToInt2=Integer.parseInt(value);

        System.out.println(value+value);
        System.out.println(stringToInt1+stringToInt2);

        // Primitive Types (Boxing)
        int numberPrimitive=15;
        Integer numberWrapper=numberPrimitive;
        System.out.println(numberWrapper);

        // Unboxing
        Integer number2Wrapper=20;
        int number2Primitive=number2Wrapper;

    }
}
