package com.hamitmizrak.tutorials._7_common;

public class _16_3_Conditional_SwitchCase {

    public static void main(String[] args) {

        // if else
        int number = 3;
        if (number ==1) {
            System.out.println( "sayı 1");
        } else if (number ==2) {
            System.out.println("sayı 2");
        } else if (number ==3) {
            System.out.println( "sayı 3");
        }else if (number ==4) {
            System.out.println( "sayı 4");
        }else if (number ==5) {
            System.out.println( "sayı 5");
        }else {
            System.out.println("1<=SAYI<=5 dışındadır");
        }

        // Switch Case
        switch (number){
            case 2:
                System.out.println("sayı 2");
                break;
            case 1:
                System.out.println("sayı 1");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;
            case 5:
                System.out.println("sayı 5");
                break;
            default:
                System.out.println("1<=SAYI<=5 dışındadır");
                break;

        }


    }
}
