package com.hamitmizrak._1_week;

public class _04_1_JavaWrapperTypes {

    public static void main(String[] args) {
        // PRIMITIVE TYPE
        byte primitiveTypeByte = 127;
        // primitiveTypeByte=null; //primitive type null veremezsiniz.
        System.out.println(primitiveTypeByte);
        short primitiveTypeShort = 32767;
        int primitiveTypeInt = 2147483647;
        long primitiveTypeLong = 9223372036854775807L;

        float primitiveTypeFloat=14.23f;
        double primitiveTypeDouble=14.23;

        boolean primitiveTypeBoolean=true;
        char primitiveTypeChar='a';
        ///////////////////////////////////////////////////////////////////
        // WRAPPER TYPE (new yoksa)
        Byte wrapperTypeByte = 127;
        wrapperTypeByte=null; // wrapper class null veebiliriz.
        System.out.println(wrapperTypeByte);
        Short wrapperTypeShort = 32767;
        Integer wrapperTypeInt = 2147483647;
        Long wrapperTypeLong = 9223372036854775807L;

        Float wrapperTypeFloat=14.23f;
        Double wrapperTypeDouble=14.23;

        Boolean wrapperTypeBoolean=true;
        Character wrapperTypeChar='a';
    }
}
