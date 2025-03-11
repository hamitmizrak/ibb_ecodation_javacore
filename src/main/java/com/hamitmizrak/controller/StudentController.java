package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoGenerics;
import com.hamitmizrak.dao.StudentDao;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.utils.SpecialColor;

import java.util.List;
import java.util.Optional;

public class StudentController implements IDaoGenerics<StudentDto> {

    // INJECTION
    private final StudentDao studentDao;

    // Parametresiz Constructor
    public StudentController() {
        this.studentDao = new StudentDao();
    }

    // CREATE
    @Override
    public Optional<StudentDto> create(StudentDto studentDto) {
        Optional<StudentDto> createdStudent = studentDao.create(studentDto);

        if (createdStudent == null) {
            System.out.println(SpecialColor.RED + "❌ Öğrenci oluşturulamadı. Geçerli bilgiler giriniz." + SpecialColor.RESET);
            return Optional.empty(); // Eğer öğrenci oluşturulamazsa boş Optional dön
        }
        return createdStudent;
    }


    // FIND BY NAME
    @Override
    public Optional<StudentDto> findByName(String name) {
        return studentDao.findByName(name);
    }

    @Override
    public Optional<StudentDto> findById(int id) {
        return studentDao.findById(id);
    }

    // LIST
    @Override
    public List<StudentDto> list() {
        return studentDao.list();
    }

    // UPDATE
    @Override
    public Optional<StudentDto> update(int id, StudentDto studentDto) {
        return studentDao.update(id, studentDto);
    }

    // DELETE
    @Override
    public Optional<StudentDto> delete(int id) {
        return studentDao.delete(id) ;
    }

    // CHOOISE(Switch-case)
    @Override
    public void chooise() {
        studentDao.chooise();
    }
}
