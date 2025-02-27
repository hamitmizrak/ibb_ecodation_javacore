package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoGenerics;
import com.hamitmizrak.dao.StudentDao;
import com.hamitmizrak.dto.StudentDto;

import java.util.List;

public class StudentController implements IDaoGenerics<StudentDto> {

    // INJECTION
    private final StudentDao studentDao;

    // Parametresiz Constructor
    public StudentController() {
        this.studentDao = new StudentDao();
    }

    // CREATE
    @Override
    public StudentDto create(StudentDto studentDto) {
        return studentDao.create(studentDto);
    }

    // FIND BY NAME
    @Override
    public StudentDto findByName(String name) {
        return studentDao.findByName(name);
    }

    @Override
    public StudentDto findById(int id) {
        return null;
    }

    // LIST
    @Override
    public List<StudentDto> list() {
        return studentDao.list();
    }

    // UPDATE
    @Override
    public StudentDto update(int id, StudentDto studentDto) {
        return studentDao.update(id, studentDto);
    }

    // DELETE
    @Override
    public StudentDto delete(int id) {
        return studentDao.delete(id);
    }

    // CHOOISE(Switch-case)
    @Override
    public void chooise() {
        studentDao.chooise();
    }
}
