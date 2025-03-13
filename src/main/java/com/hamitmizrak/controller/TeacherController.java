package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoGenerics;
import com.hamitmizrak.dao.TeacherDao;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.dto.TeacherDto;
import com.hamitmizrak.utils.SpecialColor;

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
    public Optional<TeacherDto> create(TeacherDto teacherDto) {
        // Eğer öğrenci oluşturulamazsa veya Var olan ID'li Öğrenciyi eklenmesin
        if(teacherDto ==null || teacherDao.findById(teacherDto.id()).isPresent()){
            System.out.println(SpecialColor.RED+"❌ Geçersiz veya Mevcut olan öğretmen dolayı eklenemez "+ SpecialColor.RESET);
            return Optional.empty();
        }
        // Create
        Optional<TeacherDto> teacherStudent = teacherDao.create(teacherDto);
        teacherStudent.ifPresentOrElse(
                temp -> System.out.println(SpecialColor.GREEN+"✅Başarılı Öğretmen Başarıyla Eklendi"+SpecialColor.RESET),
                () -> System.out.println(SpecialColor.RED+"❌Başarısız Öğretmen Eklenmedi"+SpecialColor.RESET)
        );
        return teacherStudent;
    }

    // FIND BY NAME
    @Override
    public Optional<TeacherDto> findByName(String name) {
        if(name ==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("❌ Geçersiz isim girdiniz");
        }
        return teacherDao.findByName(name) ;
    }

    @Override
    public Optional<TeacherDto> findById(int id) {
        if(id<=0){
            throw new IllegalArgumentException("❌ Geçersiz ID girdiniz");
        }
        return null;
    }

    // LIST
    @Override
    public List<TeacherDto> list() {
        List<TeacherDto> teacherDtoList = Optional.of(teacherDao.list()).orElse(Collections.emptyList());
        if(teacherDtoList.isEmpty()){
            System.out.println(SpecialColor.YELLOW+" Henüz Kayıtlı bir Öğretmen bulunmamaktadır"+SpecialColor.RESET);
        }
        return teacherDtoList;
    }

    // UPDATE
    @Override
    public Optional<TeacherDto> update(int id, TeacherDto teacherDto) {
        if(id<=0 || teacherDto==null){
            throw new IllegalArgumentException("❌ Güncelleme için geçerli bir Öğretmen bilgisi giriniz");
        }
        return teacherDao.update(id, teacherDto);
    }

    // DELETE
    @Override
    public Optional<TeacherDto> delete(int id) {
        if(id<=0){
            throw new IllegalArgumentException("❌ Silmek için geçerli bir öğretmen ID giriniz");
        }
        return teacherDao.delete(id);
    }

    // CHOOISE(Switch-case)
    @Override
    public void chooise() {
        teacherDao.chooise();
    }

    public static void main(String[] args) {
        TeacherController teacherController= new TeacherController();
        teacherController.chooise();
    }

    /*
    Teacher ID yerine auto incredement ID  ekle
    Teacher Inner Classın içine Handler Class ekle
    LoggingAspect Düzenle
    CSV Generics have to make it
     */
}
