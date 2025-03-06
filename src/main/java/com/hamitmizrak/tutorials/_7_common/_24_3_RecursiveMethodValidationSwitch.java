package com.hamitmizrak.tutorials._7_common;

import java.util.Scanner;

// Recursive Method
public class _24_3_RecursiveMethodValidationSwitch {

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
    // All Data
    private static void validationAllData(){
        Scanner scanner=new Scanner(System.in);
        String allUserChooise=
                "\nLütfen Seçim yapınız"
                .concat("\n1-)İterative")
                        .concat("\n2-)Recursive")
                        .concat("\n3-)Exit");
        System.out.println(allUserChooise);
        int chooise=scanner.nextInt();

        switch (chooise){
            case 1:
                // negatif girmesin
                System.out.println("lütfen faktöriyel hesabı için pozitif sayı giriniz");
                int number = scanner.nextInt();
                int validationNumber=  positiveNumberValidation(number);
               int result= iterativeFactorial(validationNumber);
                System.out.println(validationNumber + "! sayısının İterative faktöriyeli " + result);
                break;
            case 2:
                // negatif girmesin
                System.out.println("lütfen faktöriyel hesabı için pozitif sayı giriniz");
                int number2 = scanner.nextInt();
                int validationNumber2=  positiveNumberValidation(number2);
                int recursive= recursiveFactorial(validationNumber2);
                System.out.println(validationNumber2 + "! sayısının recursive faktöriyeli " + recursive);
                break;
            case 3:
                System.out.println("Sistemden Çıkış yapılıyor");
                System.exit(0);
                break;
            default:
                System.out.println("Lütfen size belirtilen aralıkta seçim yapınız.");
        }
    }

    private static void allResultData(){
        // sonsuz döngü while(true){}
        // sonsuz döngü for(;;){}
        while(true){
            validationAllData();
        }
    }

    // Validation
    // PSVM
    public static void main(String[] args) {
        allResultData();
    }
}
