package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoGenerics;
import com.hamitmizrak.dao.StudentDao;
import com.hamitmizrak.dto.StudentDto;

import java.util.ArrayList;

public class StudentController implements IDaoGenerics<StudentDto> {

    // Injection
    private StudentDao studentDao;

    // Parametresiz Constructor
    public StudentController() {
        studentDao = new StudentDao();
    }

    /// ///////////////////////////////////////////////////////////
    // CRUD
    @Override
    public StudentDto create(StudentDto studentDto) {
        return studentDao.create(studentDto);
    }

    @Override
    public StudentDto findByName(String name) {
        return studentDao.findByName(name);
    }

    @Override
    public ArrayList<StudentDto> list() {
        return studentDao.list();
    }

    @Override
    public StudentDto update(int id, StudentDto studentDto) {
        return studentDao.update(id,studentDto);
    }

    @Override
    public StudentDto delete(int id) {
        return studentDao.delete(id);
    }

    @Override
    public void chooise() {
        studentDao.chooise();
    }
}
