package com.hamitmizrak.tutorials.common;

import java.util.Scanner;

// Recursive Method
public class _25_5_PaswordRePassword {

    private static String[] userData(){
        Scanner scanner=new Scanner(System.in);
        String password, rePassword;
        String[] arr=new String[2];
        System.out.println("Sifrenizi Giriniz");
        password=scanner.nextLine();
        arr[0]=password;
        System.out.println("Sifrenizi Tekrar Giriniz");
        rePassword=scanner.nextLine();
        arr[1]=rePassword;
        return arr;
    }

    private static void resultLogin(){
        String[] arr=userData();
        /*
        for (String temp : arr) {
            System.out.print(temp+" ");
        }
        */
        System.out.println("1.şifre: "+arr[0]);
        System.out.println("2.şifre: "+arr[1]);

        // arr[0]==arr[1]: sayılarda
        // arr[0].equals(arr[1]): String
        if(arr[0].equals(arr[1])){
            System.out.println("Sifreler aynı");
            System.exit(0);
        }else{
            System.out.println("Sifreler bir birine uymuyor");
            userData();
        }
    }


    public static void main(String[] args) {
        resultLogin();
    }
}
