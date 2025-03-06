package com.hamitmizrak.tutorials._7_common;

public class _18_6_Example_SumEvenOdd {

    public static void main(String[] args) {
        // Toplam
        int sum=0,oddNumber=0,evenNumber=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
            sum=sum+i;
            if(i%2==0){
                evenNumber+=i;
            }else{
                oddNumber+=i;
            }
        }
        System.out.println("\n1-10 dahil toplamları: "+(sum));
        System.out.println("1-10 dahil tek sayı toplamları: "+(oddNumber));
        System.out.println("1-10 dahil çift sayı toplamları: "+(evenNumber));


    }
}
