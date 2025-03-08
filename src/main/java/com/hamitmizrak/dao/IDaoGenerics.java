package com.hamitmizrak.dao;

import com.hamitmizrak.dto.StudentDto;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public interface IDaoGenerics<T> {

    // CRUD
    // CREATE
    T create(T t);

    // LIST
    List<T> list();

    // FIND BY NAME
    Optional<T> findByName(String name);

    // FIND BY ID
    Optional<T> findById(int id);

    // UPDATE
    Optional<T> update(int id, T t);

    // DELETE
    Optional<T> delete(int id);

    // CHOOISE
    void chooise();

    // DATABASE CONNECTION
    default Connection getInterfaceConnection() {
        return null;
    }
}
