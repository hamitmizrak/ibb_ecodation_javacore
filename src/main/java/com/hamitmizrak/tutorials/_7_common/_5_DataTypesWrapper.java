package com.hamitmizrak.tutorials._7_common;

public class _5_DataTypesWrapper {

    public static void main(String[] args) {

        // Wrapper
        // Tam sayılar
         Byte b1=127;
         byte bytePrimitive=1;
         Byte b2= new Byte(bytePrimitive);
         System.out.println(b2);

         Short s1=32767;
         Integer i1=2147483647;
         Integer i2=new Integer(41);
         Long l1=32768L;

        // Virgüllü
        Float f2=14.53f;
        Double d2=14.53;
        Double d2Data=new Double(14.53);
        System.out.println(d2Data);

        // booelan
        Boolean b3=true;
        boolean b3Data=3>1;

        // char
        Character c5='Q';
        System.out.println(c5);

        Integer data=null; //verebilirsiniz

        // Boxing: Primiviti bir türü Wrapper çevirmek
        int primitiveNumber=44;
        Integer wrapperNumber=primitiveNumber;
    }
}
