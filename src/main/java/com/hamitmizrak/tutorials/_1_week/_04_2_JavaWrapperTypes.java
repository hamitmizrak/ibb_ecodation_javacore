package com.hamitmizrak.tutorials._1_week;

public class _04_2_JavaWrapperTypes {

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
        // WRAPPER TYPE (new varsa)
        Byte wrapperTypeByte = new Byte((byte)127);
        Short wrapperTypeShort = new Short((short)32767) ;
        Integer wrapperTypeInt = new Integer(2147483647) ;
        Long wrapperTypeLong = new Long(9223372036854775807L) ;

        Float wrapperTypeFloat= new Float(14.23f);
        Double wrapperTypeDouble= new Double(14.23);

        Boolean wrapperTypeBoolean=new Boolean(true);
        Character wrapperTypeChar= new Character('a');

    }
}
