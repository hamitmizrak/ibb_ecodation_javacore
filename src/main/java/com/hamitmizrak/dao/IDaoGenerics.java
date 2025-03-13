package com.hamitmizrak.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

/*
Boş olabilir (Optional.empty())
Bir değer içerebilir (Optional.of(T value))
*/

/*
Java 8, bazı hazır fonksiyonel arayüzler de sunar:

Predicate → boolean test(T t)  → Koşul kontrolleri için.
Function<T, R> → R apply(T t)  → Bir değeri dönüştürmek için.
Consumer → void accept(T t)    → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
Supplier → T get()             → Parametre almaz, bir değer üretir.
 */

public interface IDaoGenerics<T> {

    // CRUD Metotları
    // CREATE
    Optional<T> create(T t);

    // LIST (List için Optional kullanmaya gerek yoktur)
    List<T> list();

    // FIND BY NAME
    Optional<T> findByName(String name);

    // FIND BY ID
    Optional<T> findById(int id);

    // UPDATE
    Optional<T> update(int id, T t);

    // DELETE
    Optional<T> delete(int id);

    // CHOOISE - Kullanıcı işlemlerini yönlendirme metodu
    void chooise();

    // DATABASE CONNECTION (Varsayılan olarak null dönüyor)
    default Connection getInterfaceConnection() {
        return null;
    }
}
