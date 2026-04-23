package com.hamitmizrak.tutorials._5_week;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
Java 8, bazı hazır fonksiyonel arayüzler de sunar:

Predicate → boolean test(T t)  → Koşul kontrolleri için.
Function<T, R> → R apply(T t)  → Bir değeri dönüştürmek için.
Consumer → void accept(T t)    → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
Supplier → T get()             → Parametre almaz, bir değer üretir.
 */

public class Week5_08_Java8 {

    // List
    private static List<String> getArrayToDataList() {
        String[] frontend = {"html5", "css3", "seo", "seo", "seo", "bootstrap5", "tailwindcss", "reactjs", "angular", "jquery", "nodejs"};
        List<String> arrayToList = new ArrayList<>();
        arrayToList = List.of(frontend);
        return arrayToList;
    }

    // Collect
    private static List<String> streamCollectData() {
        List<String> list = getArrayToDataList();
        List<String> result = list.stream().collect(Collectors.toList());
        return result;
    }

    // ForEach
    private static void streamForEach() {
        List<String> list = streamCollectData();
        list.stream().forEach((temp) -> {
            System.out.print(temp + " ");
        });
    }

    // Distinct
    private static void streamDistinct() {
        List<String> list = streamCollectData();
        list.stream()
                .distinct()
                .forEach((temp) -> {
                    System.out.print(temp + " ");
                });
    }

    // Sorted
    private static void streamSorted() {
        List<String> list = streamCollectData();
        list
                .stream()
                .sorted()
                .forEach((temp) -> {
                    System.out.print(temp + " ");
                });
    }

    // Reverse Sorted
    private static void streamReverseSorted() {
        List<String> list = streamCollectData();
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach((temp) -> {
                    System.out.print(temp + " ");
                });
    }

    // Filtreleme
    private static void streamFilter() {
        List<String> list = streamCollectData();
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .filter((temp) -> !"seo".equals(temp))
                .forEach((temp) -> {
                    System.out.print(temp + " ");
                });
    }


    // Map
    private static void streamMap() {
        List<String> list = streamCollectData();
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .filter((temp) -> !"seo".equals(temp))
                .map((temp) -> temp.toUpperCase())
                .forEach((temp) -> {
                    System.out.print(temp + " ");
                });
    }

    // Map
    private static void streamLimit() {
        List<String> list = streamCollectData();
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .filter((temp) -> !"seo".equals(temp))
                .map((temp) -> temp.toUpperCase())
                .limit(3)
                .forEach((temp) -> {
                    System.out.print(temp + " ");
                });
    }


    // PSVM
    public static void main(String[] args) {
        //streamForEach();
        //System.out.println("");
        //streamSorted();
        //streamReverseSorted();
        //streamFilter();
        //streamMap();
        //streamDistinct();
        //streamLimit();
    }
}
