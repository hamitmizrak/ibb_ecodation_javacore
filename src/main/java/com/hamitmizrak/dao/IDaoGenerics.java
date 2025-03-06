package com.hamitmizrak.dao;

import com.hamitmizrak.dto.StudentDto;

import java.sql.Connection;
import java.util.List;

public interface IDaoGenerics<T> {

    // CRUD
    // CREATE
    T create(T t);

    // LIST
    List<T> list();

    // FIND BY NAME,ID
    T findByName(String name);

    T findById(int id);

    // UPDATE
    T update(int id, T t);

    // DELETE
    T delete(int id);

    // CHOOISE
    void chooise();

    // DATABASE CONNECTION
    default Connection getInterfaceConnection() {
        return null;
    }
}
