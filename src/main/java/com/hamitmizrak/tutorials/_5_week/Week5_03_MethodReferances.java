package com.hamitmizrak.tutorials._5_week;

import java.util.function.Consumer;

/*
Java 8, bazı hazır fonksiyonel arayüzler de sunar:

Predicate      → boolean test(T t)  → Koşul kontrolleri için.
Function<T, R> → R apply(T t)       → Bir değeri dönüştürmek için.
Consumer       → void accept(T t)   → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
Supplier       → T get()            → Parametre almaz, bir değer üretir.
 */

class Printer {
    static void printMessage(String message) {
        System.out.println(message);
    }
}

public class Week5_03_MethodReferances {

        //Consumer       → void accept(T t)   → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
        public static void main(String[] args) {
            // 1.YOL
            Printer printer1 = new Printer();
            printer1.printMessage("Merhabalar, Olmayan !!!! Method Reference!");

            // 2.YOL
            Consumer<String> printer2 = Printer::printMessage;
            printer2.accept("Merhabalar, Olannnn !!!! Method Reference!");
        }

}
