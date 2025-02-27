package com.hamitmizrak.dao;

import com.hamitmizrak.dto.StudentDto;

import java.sql.Connection;
import java.util.List;

public interface IDaoGenerics<T> {

    // CRUD
    // CREATE
    T create(T t);

    // FIND BY NAME,ID
    T findByName(String name);
    T  findById(int id);

    // LIST
    List<T> list();

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
