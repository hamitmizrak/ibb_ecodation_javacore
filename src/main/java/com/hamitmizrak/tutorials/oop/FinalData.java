package com.hamitmizrak.tutorials.oop;

// final class: extends edemezsiniz
public final class FinalData {

    // final değişkenler
    private final String variableFinal="değişmez";


    // final Method
    public final void methodFinal(){
        System.out.println("Bu metot'u override edemezsiniz");
    }


    public static void main(String[] args) {
        FinalData staticFinalData=new FinalData();
        System.out.println(staticFinalData.variableFinal);
    }
}

// break : Döngüyü kırıyor çalışmıyor
// return: Döngüyü kırıyor çalışmıyor
// continue : o şarta çalışmıyor sonra döngü devam ediyor.
