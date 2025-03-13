package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoGenerics;
import com.hamitmizrak.dao.StudentDao;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.log.LogExecutionTime;
import com.hamitmizrak.utils.SpecialColor;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StudentController implements IDaoGenerics<StudentDto> {

    // INJECTION (DI)
    private final StudentDao studentDao;

    // Parametresiz Constructor
    public StudentController() {
        this.studentDao = new StudentDao();
    }

    // CREATE
    @Override
    @LogExecutionTime
    public Optional<StudentDto> create(StudentDto studentDto) {
        if (studentDto == null || studentDao.findById(studentDto.getId()).isPresent()) {
            System.out.println(SpecialColor.RED + "❌ Geçersiz veya mevcut olan öğrenciden dolayı eklenemez " + SpecialColor.RESET);
            return Optional.empty();
        }
        Optional<StudentDto> createdStudent = studentDao.create(studentDto);
        createdStudent.ifPresentOrElse(
                temp -> System.out.println(SpecialColor.GREEN + "✅Başarılı Öğrenci Başarıyla Eklendi" + SpecialColor.RESET),
                () -> System.out.println(SpecialColor.RED + "❌Başarısız Öğrenci Eklenmedi" + SpecialColor.RESET)
        );
        return createdStudent;
    }

    // FIND BY NAME
    @Override
    @LogExecutionTime
    public Optional<StudentDto> findByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Geçersiz isim girdiniz");
        }
        return studentDao.findByName(name.trim());
    }

    // FIND BY ID
    @Override
    @LogExecutionTime
    public Optional<StudentDto> findById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("❌ Geçersiz ID girdiniz");
        }
        return studentDao.findById(id);
    }

    // LIST
    @Override
    @LogExecutionTime
    public List<StudentDto> list() {
        List<StudentDto> studentDtoList = Optional.of(studentDao.list()).orElse(Collections.emptyList());
        if (studentDtoList.isEmpty()) {
            System.out.println(SpecialColor.YELLOW + " Henüz Kayıtlı bir öğrenci bulunmamaktadır" + SpecialColor.RESET);
        }
        return studentDtoList;
    }

    // UPDATE
    @Override
    @LogExecutionTime
    public Optional<StudentDto> update(int id, StudentDto studentDto) {
        if (id <= 0 || studentDto == null) {
            throw new IllegalArgumentException("❌ Güncelleme için geçerli bir öğrenci bilgisi giriniz");
        }
        return studentDao.update(id, studentDto);
    }

    // DELETE
    @Override
    @LogExecutionTime
    public Optional<StudentDto> delete(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("❌ Silmek için geçerli bir öğrencisi ID giriniz");
        }
        return studentDao.delete(id);
    }

    // CHOOISE(Switch-case)
    @Override
    @LogExecutionTime
    public void chooise() {
        studentDao.chooise();
    }
}
