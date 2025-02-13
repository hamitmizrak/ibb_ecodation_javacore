package com.hamitmizrak._2_week;

import java.io.IOException;
import java.util.Scanner;

/*
      Exception in thread "main" java.lang.ArithmeticException: / by zero
      at com.hamitmizrak._2_week._14_1_Exception.main(_14_1_Exception.java:8)
       */
public class _14_1_Exception {


    public static void calcula() throws ArithmeticException, IOException, NullPointerException {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.println("Number 1 giriniz");
        number1 = scanner.nextInt();

        System.out.println("Number 2 giriniz");
        number2 = scanner.nextInt();
        try {
            int result = number1 / number2;
            System.out.println(result);

        } catch (ArithmeticException ai) {
            ai.printStackTrace();
            //ai.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            //ai.getMessage();
        } finally {
            System.out.println("İstisna olsada olmazsada mutlaka yapılacak iş");
            scanner.close();
        }
        System.out.println("Son 10.000 satır");
    }

    public static void main(String[] args) throws IOException {
        calcula();
        System.out.println("################################");

        // Bilerek istisna gönder
        throw new NullPointerException("Neden boş verdiniz");
    }
}
