package com.hamitmizrak.tutorials._7_common;

public class _4_DataTypesPrimitive {

    public static void main(String[] args) {

        // Primitive 8 tane
        // Tam sayılar
        // 8 bit= 1 byte
        byte b1=127; // -128<=X<=+127 (8 bit)
        short s1=32767; // -32.768<=X<=+32.767 (16 bit)
        int i1=2147483647; // -2.147.483.648<=X<=+2.147.483.647 (32 bit)
        long l1=32768L; // -9.223.372.036.858<=X<=+9.223.372.036.857 (364 bit)
        System.out.println(l1);
        long l1Data=32768l; // -9.223.372.036.858<=X<=+9.223.372.036.857 (364 bit)
        System.out.println(l1Data);

        // Virgüllü
        float f2=14.53F; // (32 bit)
        System.out.println(f2);
        float f2Data=14.53f; // (32 bit)
        System.out.println(f2Data);
        double d2=14.53; // (64 bit)

        // booelan
        boolean b3=true;
        boolean b3Data=3>1;

        // char
        char c5='Q';
        System.out.println(c5);

        //int data=null; //veremezsiniz

    }
}
