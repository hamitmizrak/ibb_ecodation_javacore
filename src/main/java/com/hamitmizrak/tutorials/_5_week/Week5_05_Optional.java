package com.hamitmizrak.tutorials._5_week;

import java.util.Optional;

/*
Java 8, bazı hazır fonksiyonel arayüzler de sunar:

Predicate → boolean test(T t)  → Koşul kontrolleri için.
Function<T, R> → R apply(T t)  → Bir değeri dönüştürmek için.
Consumer → void accept(T t)    → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
Supplier → T get()             → Parametre almaz, bir değer üretir.
 */


public class Week5_05_Optional {

    // 1.Problem Çözümü
    public String isNotValidation(String data) {
        return data;
    }

    // 2.Problem çözümü
    // data.isEmpty() || data == null || data.isBlank(
    public String validation(String data) {
        if (data.isEmpty() || data == null || data.isBlank()) {
            return "Unknown";
        } else {
            return data;
        }
    }

    // 3.Problem çözümü
    public Optional<String> optionaLResult(String data) {
        Optional<String> name = Optional.ofNullable(null);
        return name;
    }


    public static void main(String[] args) {
        // Instance
        Week5_05_Optional week505Optional = new Week5_05_Optional();

        // 1.YOL
        String result1 = week505Optional.isNotValidation("");
        System.out.println(result1);


        // 2.YOL
        String result2 = week505Optional.validation("");
        System.out.println(result2);

        Optional<String> result3 = week505Optional.optionaLResult("");
        System.out.println(result3);

    }
}