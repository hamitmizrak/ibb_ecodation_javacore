package com.hamitmizrak.tutorials.common;

import java.util.Scanner;

// Recursive Method
public class _24_1_RecursiveMethod {

    // İterative Faktöriyel
    public static int iterativeFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
            //result*=i;
        }
        return result;
    }

    // Recursive Faktöriyel
    public static int recursiveFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * recursiveFactorial(number - 1);
        }
    }

    // Validation
    // PSVM
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif sayı giriniz");
        int number = scanner.nextInt();

        // iterative
        int iterative = _24_1_RecursiveMethod.iterativeFactorial(number);
        System.out.println(number + "! sayısının faktöriyeli " + iterative);

        // recursive
        int recursive = _24_1_RecursiveMethod.recursiveFactorial(number);
        System.out.println(number + "! sayısının faktöriyeli " + recursive);
    }

}
