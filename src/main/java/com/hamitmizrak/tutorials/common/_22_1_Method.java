package com.hamitmizrak.tutorials.common;

public class _22_1_Method {

    // Method
    // 1-) voidli Parametresiz
    public void voidliParametresiz() {
        System.out.println("voidli Parametresiz");
    }

    // 2-) voidli Parametreli
    public void voidliParametreli(int number) {
        System.out.println("voidli Parametreli " + number);
    }

    // 3-) returnlu Parametresiz
    public String returnluParametresiz() {
        return "returnlu Parametresiz";
    }

    // 4-) returnlu Parametreli
    public int returnluParametreli(int age) {
        return age;
    }

    // 4-) returnlu Parametreli (Overloading)
    public int returnluParametreli(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        // new: doğmak
        // null: ölmek
        // instance
        _22_1_Method method = new _22_1_Method();
        method.voidliParametresiz();
        method.voidliParametreli(44); //44: argüman

        String data3 = method.returnluParametresiz();
        System.out.println(data3);

        int data4 = method.returnluParametreli(38);
        System.out.println(data4);

        //Overloading
        int data5 = method.returnluParametreli(11, 22);
        System.out.println(data5);
    }

}
