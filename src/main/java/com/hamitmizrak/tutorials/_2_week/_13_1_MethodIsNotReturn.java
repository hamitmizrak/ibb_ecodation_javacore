package com.hamitmizrak.tutorials._2_week;

public class _13_1_MethodIsNotReturn {

    // 1- Metotlar (Returnsuz Parametresiz)
    public void metotReturnsuzParametresiz(){
        System.out.println("metot Returnsuz Parametresiz");
    }

    // 2- Metotlar (ReturnsuzParametreli)
    public static void metotReturnsuzParametreli(String name){
        System.out.println("metot Returnsuz Parametreli "+name);
    }

    // Overloading(Aşırı Yüklemek)
    public static void metotReturnsuzParametreli(String name,String surname){
        System.out.println("metot Returnsuz Parametreli "+name+" "+surname);
    }

    // new
    // static
    public static void main(String[] args) {
        _13_1_MethodIsNotReturn data1= new _13_1_MethodIsNotReturn();
        data1.metotReturnsuzParametresiz();

        // instance(new) olmadan static ile çağırdım
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Hamit");
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Hamit","Mızrak");
    }
}
