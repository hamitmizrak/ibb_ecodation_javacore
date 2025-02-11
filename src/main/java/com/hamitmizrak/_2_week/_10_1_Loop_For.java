package com.hamitmizrak._2_week;

public class _10_1_Loop_For {

    public static void main(String[] args) {
        // i++
        // i=i+1
        // i+=1
        int i = 1;
        for (; i <= 10; i++) {
            System.out.print(i + " - ");
        }
        System.out.println("\n################################\n");
        // for döngüsü sonsuzluk
        // for(;;){}
        int number = 1;
        for (; ; ) {
            System.out.print(number + " ");
            number++;
            if (number >= 50)
                break;
        }
    }
}
