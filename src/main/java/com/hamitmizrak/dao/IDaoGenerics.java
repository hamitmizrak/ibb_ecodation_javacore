package com.hamitmizrak.dao;

import java.util.List;
import java.util.Optional;

/**
 * 📌 Generic DAO Arayüzü
 * CRUD işlemleri için temel arayüzdür.
 */
public interface IDaoGenerics<T> {
    Optional<T> create(T entity);
    List<T> list();
    Optional<T> findByName(String name);
    Optional<T> findById(int id);
    Optional<T> update(int id, T entity);
    Optional<T> delete(int id);
    void choose();
}
