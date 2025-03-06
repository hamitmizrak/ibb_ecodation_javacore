package com.hamitmizrak.tutorials._7_common;

public class _16_2_Conditional_Ternary {

    public static void main(String[] args) {

        // if else
        int number=+5;
        if(number>0){
            System.out.println(number+" sayı Pozitiftir");
        }else {
            System.out.println(number+" sayı Negatiftir");
        }


        // Ternary
        String result = (number>0) ? number+" sayı Pozitiftir" : number+" sayı Negatiftir";
        System.out.println(result);
    }
}
