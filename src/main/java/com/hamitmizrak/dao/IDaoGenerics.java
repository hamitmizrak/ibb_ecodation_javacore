package com.hamitmizrak.dao;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoGenerics<T> {

    // CRUD
    // CREATE
    T create(T t);

    // FIND BY NAME
    T findByName(String name);

    // LIST
    ArrayList<T> list();

    // UPDATE
    T update(int id, T t);

    // DELETE
    T delete(int id);

    // CHOOISE
    public void chooise();

    // BODY Method
    default Connection getInterfaceConnection() {
        return null;
    }

}
