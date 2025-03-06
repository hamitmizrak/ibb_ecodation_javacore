package com.hamitmizrak.tutorials._7_common;

public class _22_2_MethodStatic {

    // Method
    // 1-) voidli Parametresiz
    public static void voidliParametresiz() {
        System.out.println("static voidli Parametresiz");
    }

    // 2-) voidli Parametreli
    public static void voidliParametreli(int number) {
        System.out.println("static voidli Parametreli " + number);
    }

    // 3-) returnlu Parametresiz
    public static String returnluParametresiz() {
        return "static returnlu Parametresiz";
    }

    // 4-) returnlu Parametreli
    public static int returnluParametreli(int age) {
        return age;
    }

    // 4-) returnlu Parametreli (Overloading)
    public static int returnluParametreli(int number1, int number2) {
        return number1 + number2;
    }

    // PSVM Short Cut Beautify: ctrl+Alt+l
    public static void main(String[] args) {

        // static'te instance yazmadım (new yoktur)
        _22_2_MethodStatic.voidliParametresiz();
        _22_2_MethodStatic.voidliParametreli(44);

        String data3 = _22_2_MethodStatic.returnluParametresiz();
        System.out.println(data3);

        int data4 = _22_2_MethodStatic.returnluParametreli(38);
        System.out.println(data4);

        //Overloading
        int data5 = _22_2_MethodStatic.returnluParametreli(11, 22);
        System.out.println(data5);
    }

}
