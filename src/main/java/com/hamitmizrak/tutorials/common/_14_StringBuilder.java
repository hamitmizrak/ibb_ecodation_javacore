package com.hamitmizrak.tutorials.common;

public class _14_StringBuilder {

    public static void main(String[] args) {

        String tech1="java",tech2="jsp",tech3="servlet";

        // + operant
        String allData = tech1 + tech2 + tech3;
        System.out.println(allData);

        // String concat
        String concatString = tech1.concat(tech2).concat(tech3);
        System.out.println(concatString);

       // StringBuilder
        StringBuilder stringBuilder= new StringBuilder(tech1);
        stringBuilder.append(tech2).append(tech3);
        String toChange=stringBuilder.toString();
        System.out.println(toChange);

        // StringBuffer
        StringBuffer stringBuffer= new StringBuffer(tech1);
        stringBuffer.append(tech2).append(tech3);
        String toChange2=stringBuffer.toString();
        System.out.println(toChange2);

    }
}
