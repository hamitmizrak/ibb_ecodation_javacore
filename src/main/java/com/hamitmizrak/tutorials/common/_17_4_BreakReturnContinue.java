package com.hamitmizrak.tutorials.common;

public class _17_4_BreakReturnContinue {

    private static void breakReturnContinue(){
        int sum=0;
        // 1-10 dahil olacak şekilde Toplama
        // 5 sayıyı dahil etme
        for (int i = 1; i <=10 ; i++) {

            // Sayılardan eğer 5 varsa
            if(i==5)
                continue;

            if(i>=9)
                break;
            // 1-8 arasındakilerini dahil edi

            sum+=i;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        breakReturnContinue();
    }

}
