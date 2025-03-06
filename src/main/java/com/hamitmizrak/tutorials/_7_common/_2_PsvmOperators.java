package com.hamitmizrak.tutorials._7_common;

public class _2_PsvmOperators {

    // psvm => TAB
    public static void main(String[] args) {

        // Atama Operators
        int number=10;
        System.out.println(number);

        // Artırma Azalma
        // number++;
        // number=number+1;
        number+=1;
        System.out.println("Artırma: "+number);

        number--;
        System.out.println("Azaltma: "+number);

        // Araştırma
        //number++;
        //++number;

        // Dört işlem
        int number1=20;
        int number2=3;
        System.out.println("Toplam: "+ (number1+number2));
        System.out.println("Çıkarma: "+ (number1-number2));
        System.out.println("Çarpma: "+ (number1*number2));
        System.out.println("Bölme: "+ (number1/number2));
        System.out.println("Kalan: "+ (number1%number2));

        // Karşılaştırma Operatörü
        boolean isResult= (number1==number2);
        System.out.println(isResult);
        // > >= < <=

        // Mantıksal Operatörler
        // VE &&
        // VEYA ||
        // DEGİL !

        // Bitsel Operatörler
        // VE &
        // VEYA |
        // DEGİL !
    }
}
