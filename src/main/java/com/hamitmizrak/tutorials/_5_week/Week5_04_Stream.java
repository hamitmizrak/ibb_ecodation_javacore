package com.hamitmizrak.tutorials._5_week;


import com.hamitmizrak.utils.SpecialColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Java 8, bazı hazır fonksiyonel arayüzler de sunar:

Predicate → boolean test(T t)  → Koşul kontrolleri için.
Function<T, R> → R apply(T t)  → Bir değeri dönüştürmek için.
Consumer → void accept(T t)    → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
Supplier → T get()             → Parametre almaz, bir değer üretir.
 */
public class Week5_04_Stream {

    // Normal List Add
    public static ArrayList<String> streamExam1() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Ahmet");
        names.add("Asım");
        names.add("Veli");
        names.add("Ayşe");
        names.add("Ayfer");
        names.add("aslı");
        names.add("Fatma");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
        System.out.println();
        return names;
    }

    // Arrays.asList() => Diziyi Listeye çevirerek
    public static void streamExam2() {
        List<String> names = Arrays.asList("Ali", "Ahmet", "Asım", "Veli", "Ayşe", "Ayfer", "aslı", "Fatma");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
        System.out.println();
    }

    // Java 8 gelen Stream Özelliği
    public static void streamExam3() {
        List<String> names = streamExam1()
                .stream()
                .filter(xyz -> xyz.startsWith("A"))
                .collect(Collectors.toList());
        names.forEach(System.out::print);
    }

    public static void main(String[] args) {
        System.out.println(SpecialColor.YELLOW + "1.YÖNTEM" + SpecialColor.RESET);
        streamExam1();

        System.out.println(SpecialColor.BLUE + "2.YÖNTEM" + SpecialColor.RESET);
        streamExam2();

        System.out.println(SpecialColor.CYAN + "3.YÖNTEM" + SpecialColor.RESET);
        streamExam3();
    }
}