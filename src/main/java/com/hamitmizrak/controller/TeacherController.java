package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoGenerics;
import com.hamitmizrak.dao.TeacherDao;
import com.hamitmizrak.dto.ETeacherSubject;
import com.hamitmizrak.dto.TeacherDto;
import com.hamitmizrak.log.LogExecutionTime;
import com.hamitmizrak.log.LoggingAspect;
import com.hamitmizrak.utils.SpecialColor;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TeacherController implements IDaoGenerics<TeacherDto> {

    // INJECTION
    private final TeacherDao teacherDao;

    // Parametresiz Constructor
    public TeacherController() {
        this.teacherDao = new TeacherDao();
    }

    // CREATE
    @Override
    //@LogExecutionTime
    public Optional<TeacherDto> create(TeacherDto teacherDto) {
        if (teacherDto == null || teacherDao.findById(teacherDto.id()).isPresent()) {
            System.out.println(SpecialColor.RED + "❌ Geçersiz veya mevcut olan öğretmen eklenemez " + SpecialColor.RESET);
            return Optional.empty();
        }
        return teacherDao.create(teacherDto);
    }

    // FIND BY NAME
    @Override
    //@LogExecutionTime
    public Optional<TeacherDto> findByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Geçersiz isim girdiniz");
        }
        return teacherDao.findByName(name);
    }

    // FIND BY ID
    @Override
    //@LogExecutionTime
    public Optional<TeacherDto> findById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("❌ Geçersiz ID girdiniz");
        }
        return teacherDao.findById(id);
    }

    // LIST
    @Override
   @LogExecutionTime
    public List<TeacherDto> list() {
        List<TeacherDto> teacherDtoList = Optional.of(teacherDao.list()).orElse(Collections.emptyList());
        if (teacherDtoList.isEmpty()) {
            System.out.println(SpecialColor.YELLOW + " Henüz kayıtlı bir öğretmen bulunmamaktadır" + SpecialColor.RESET);
        }
        return teacherDtoList;
    }

    // UPDATE
    @Override
    //@LogExecutionTime
    public Optional<TeacherDto> update(int id, TeacherDto teacherDto) {
        if (id <= 0 || teacherDto == null) {
            throw new IllegalArgumentException("❌ Güncelleme için geçerli bir öğretmen bilgisi giriniz");
        }
        return teacherDao.update(id, teacherDto);
    }

    // DELETE
    @Override
    //@LogExecutionTime
    public Optional<TeacherDto> delete(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("❌ Silmek için geçerli bir öğretmen ID giriniz");
        }
        return teacherDao.delete(id);
    }

    // CHOOISE(Switch-case)
    @Override
    @LogExecutionTime
    public void chooise() {
        teacherDao.chooise();
    }


    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();

        // Parametresiz metodlar için
        LoggingAspect.invokeAnnotatedMethods(teacherController);

        // Parametreli metod çağrısı için
        TeacherDto teacherDto = new TeacherDto(1, "Ali", "Veli", LocalDate.now(), ETeacherSubject.COMPUTER_SCIENCE, 5, true, 5000);
        LoggingAspect.invokeAnnotatedMethods(teacherController, 1, teacherDto);
    }
    }
