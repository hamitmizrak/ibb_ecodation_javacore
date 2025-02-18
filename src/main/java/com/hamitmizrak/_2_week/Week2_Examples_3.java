package com.hamitmizrak._2_week;


import com.hamitmizrak.utils.SpecialColor;

import java.util.Scanner;
/*
   Kullanıcıdan Girilen Sayının Faktoriyelini Bulma
   Soru:
   Kullanıcıdan bir tam sayı alarak faktöriyelini hesaplayan iterative ve recursive metota göre  programı yazınız.
   Kullanıcı Sıfırdan küçük bir sayı verene kadar hesaplama yapsın ?
   Çözüm:
*/

public class Week2_Examples_3 {

    public static void main(String[] args) {

        // Iterative
        // Variables
        // result:1 vermeliyiz ki, 1 sayısı çarpmada etkisizdir ve başlangıç değerimizdir.
        long number,result=1;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Sonsuz Döngü
        while(true){
            System.out.println("\nLütfen pozitif bir sayı giriniz");
            number=scanner.nextLong();

            if(number<0){
                System.out.println(SpecialColor.RED+" Sıfırdan küçük bir sayı girdiniz"+SpecialColor.RESET);
                number= Math.abs(number);

            }else if(number==0){
                System.out.println(number+ SpecialColor.BLUE+" sayısının faktöriyeli= 1");
                result=1;
            } else{
                for (int i = 1; i <=number ; i++) {
                    //result=result*i;
                    result*=i;
                }
                System.out.println(number+SpecialColor.YELLOW+" sayısının "+number+"!="+result+SpecialColor.RESET);
            }
        }
    }

} // end class
