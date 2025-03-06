package com.hamitmizrak.tutorials._7_common;

public class _17_2_Loop_While {

    public static void main(String[] args) {

        // For Loop
        System.out.println("** For ********");
        for(int i = 1; i <=5 ; i++) {
            System.out.print(i+" ");
        }

        // While Loop
        System.out.println("\n\n ** While ********");
        int y = 1;
        while(y<=5){
            System.out.print(y+" ");
            //y++;
            //y=y+1;
            y+=1;
        }

    }
}
