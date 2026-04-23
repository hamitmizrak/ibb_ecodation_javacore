package com.hamitmizrak.tutorials._5_week;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Optional;

/*
Java 8, bazı hazır fonksiyonel arayüzler de sunar:

Predicate → boolean test(T t)  → Koşul kontrolleri için.
Function<T, R> → R apply(T t)  → Bir değeri dönüştürmek için.
Consumer → void accept(T t)    → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
Supplier → T get()             → Parametre almaz, bir değer üretir.
 */



@Retention(RetentionPolicy.RUNTIME)                     // Çalışma zamanında erişilebilir
//@Target({ElementType.METHOD,ElementType.CONSTRUCTOR}) // Metotlarda ve Constructorlarda uygulanabilir
@Target({ElementType.METHOD})   // Yalnızca metotlara uygulanabilir
 @interface LogExecutionTimeLog {
}


// TEST CLASS
class Test {

    private String name;

    // @LogExecutionTimeLog  // buraya bu anatasyonu ekleyemezsiniz.
    public Test() {
    }

    @LogExecutionTimeLog
    public static void process() {
        System.out.println("Bu metot loglanacak.");
    }

    // PSVM
    public static void main(String[] args) {
        Test.process();
    }
}


public class Week5_05_Annotation {


}