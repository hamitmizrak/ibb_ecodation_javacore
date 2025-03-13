package com.hamitmizrak.log;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class LoggingAspect {

    public static void invokeAnnotatedMethods(Object obj, Object... args) {
        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                try {
                    method.setAccessible(true);

                    // Metodun parametrelerini kontrol et
                    Parameter[] parameters = method.getParameters();

                    if (parameters.length == 0) {
                        // Eğer metod parametre almıyorsa, args olmadan çağır
                        method.invoke(obj);
                    } else {
                        // Parametreli metod ise, sadece parametre sayısı uyuyorsa çağır
                        if (args.length == parameters.length) {
                            method.invoke(obj, args);
                        } else {
                            System.err.println("⚠️ " + method.getName() + " metodu için yanlış parametre sayısı verildi! Beklenen: " + parameters.length + ", verilen: " + args.length);
                        }
                    }

                } catch (Exception e) {
                    throw new RuntimeException("Metod çağrılırken hata oluştu: " + method.getName(), e);
                }
                long end = System.nanoTime();
                System.out.println("✅ " + method.getName() + " metodu " + (end - start) / 1_000_000.0 + " milisaniye sürdü.");
            }
        }
    }
}
