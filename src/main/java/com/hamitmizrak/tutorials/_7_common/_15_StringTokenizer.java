package com.hamitmizrak.tutorials._7_common;

import java.util.StringTokenizer;

public class _15_StringTokenizer {

    public static void main(String[] args) {

        String tech1="java +",tech2="jsp -",tech3="servlet";

       // StringBuilder
        StringBuilder stringBuilder= new StringBuilder(tech1);
        stringBuilder.append(tech2).append(tech3);
        String toChange=stringBuilder.toString();
        System.out.println(toChange);

        // StringTokenizer
        StringTokenizer stringTokenizer=new StringTokenizer(toChange,"+-& ");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
