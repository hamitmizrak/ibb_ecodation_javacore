package com.hamitmizrak.tutorials.oop;

// final class: extends edemezsiniz
public final class StaticFinalData {

    // const
    private static final String variableFinal="değişmez";


    // static Method : ClassName.methodAdi
    public static final void methodFinal(){
        System.out.println("Bu metot'u override edemezsiniz");
    }


    public static void main(String[] args) {
        String variableFinal1 = StaticFinalData.variableFinal;
        StaticFinalData.methodFinal();
    }
}

// break : Döngüyü kırıyor çalışmıyor
// return: Döngüyü kırıyor çalışmıyor
// continue : o şarta çalışmıyor sonra döngü devam ediyor.
