package com.hamitmizrak.tutorials._7_common;

import java.util.Scanner;

// Recursive Method
public class _24_2_RecursiveMethodValidation {

    // İterative Faktöriyel
    private static int iterativeFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
            //result*=i;
        }
        return result;
    }

    // Recursive Faktöriyel
    private static int recursiveFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * recursiveFactorial(number - 1);
        }
    }

    // Validation
    private static int positiveNumberValidation(int number){
        if(number<0){
            System.err.println("Negatif Sayı Girdiniz");
            number=number*(-1);
            //number=Math.abs(number); //2.YOL
            return number;
        }else if(number==0 || number==1){
            System.out.println(number+ "! faktöriyel 1");
            return 1;
        }
        return number;
    }

    // Validation
    // PSVM
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif sayı giriniz");
        int number = scanner.nextInt();

        // negatif girmesin
      int validationNumber=  positiveNumberValidation(number);

        // iterative
        int iterative = _24_2_RecursiveMethodValidation.iterativeFactorial(validationNumber);
        System.out.println(validationNumber + "! sayısının faktöriyeli " + iterative);

        // recursive
        int recursive = _24_2_RecursiveMethodValidation.recursiveFactorial(validationNumber);
        System.out.println(validationNumber + "! sayısının faktöriyeli " + recursive);
    }

}
