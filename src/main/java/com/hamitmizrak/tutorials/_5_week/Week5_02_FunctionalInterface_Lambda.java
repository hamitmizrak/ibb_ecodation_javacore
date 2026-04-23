package com.hamitmizrak.tutorials._5_week;

// Java 1.7 ile gelen özellik
interface MathOperation1 {
    int operation(int a, int b);
}


// Java 1.8 ile gelen: @FunctionalInterface (1 tane gövdesiz metotu oluşturmak)
@FunctionalInterface
interface MathOperation2 {
    int operation(int a, int b);
}



public class Week5_02_FunctionalInterface_Lambda {

    public static void main(String[] args) {
        // Java 1.7 Öncesinde Lambda Expression
        MathOperation1 addition1 = new MathOperation1() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(addition1.operation(5, 10));

        // Java 1.8 ile gelen Lambda Expression
        MathOperation2 addition2 = (a, b) -> a + b;
        System.out.println(addition2.operation(5, 10));
    }
}
