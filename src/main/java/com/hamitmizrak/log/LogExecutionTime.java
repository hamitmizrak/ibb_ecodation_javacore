package com.hamitmizrak.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 📌 Özel anotasyon oluşturuyoruz
@Retention(RetentionPolicy.RUNTIME) // Çalışma zamanında erişilebilir
@Target(ElementType.METHOD) // Sadece metotlara uygulanabilir
public @interface LogExecutionTime {
}
