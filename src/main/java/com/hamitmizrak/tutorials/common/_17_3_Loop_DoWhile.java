package com.hamitmizrak.tutorials.common;

public class _17_3_Loop_DoWhile {

    public static void main(String[] args) {

        // For Loop
        System.out.println("** For ********");
        for(int i = 1; i <=5 ; i++) {
            System.out.print(i+" ");
        }
        // For Sonsuz =>  for(;;){}


        // While Loop
        System.out.println("\n\n ** While ********");
        int y = 1;
        while(y<=5){
            System.out.print(y+" ");
            //y++;
            //y=y+1;
            y+=1;
        }
        // While Sonsuz Döngü =>  while(true){}

        // Do-While Loop
        System.out.println("\n\n ** Do-While ********");
        int x = 1;
        do{
            System.out.print(x+" ");
            x+=1;
        }while(x<=-5);
    }
}
