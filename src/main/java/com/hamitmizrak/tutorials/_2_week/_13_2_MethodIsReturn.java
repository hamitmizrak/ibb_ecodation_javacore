package com.hamitmizrak.tutorials._2_week;

public class _13_2_MethodIsReturn {

    // 3-) Return lu parametresiz
    public String metotReturluParametresiz() {
        return "metot Returnlu Parametresiz";
    }


    // 4-) Return lu parametreli
    public Integer metotReturluParametreli(int number) {
        return number;
    }

    // PSVM
    public static void main(String[] args) {
        _13_2_MethodIsReturn isReturn1 = new _13_2_MethodIsReturn();

        String result1 = isReturn1.metotReturluParametresiz();
        System.out.println(result1);

        Integer result2 = isReturn1.metotReturluParametreli(123456);
        System.out.println(result2);
    }

}
