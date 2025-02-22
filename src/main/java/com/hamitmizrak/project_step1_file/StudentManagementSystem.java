package com.hamitmizrak.project_step1_file;

import com.hamitmizrak.utils.SpecialColor;

import java.io.*;
import java.util.ArrayList;

// Öğrenci Yönetim Sistemi
public class StudentManagementSystem {

    // Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

    // static
    static {

    }

    // Parametresiz Constructor
    public StudentManagementSystem() {
        // Program başlarken Öğrenci Listesini hemen yüklesin
        loadStudentsListFromFile();
    }

    ////////////////////////////////////////////////////////////////
    // Login
    // Register

    /// /////////////////////////////////////////////////////////////
    // FileIO Create
    // File Create
    private void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(studentDtoList);
        } catch (IOException io) {
            System.out.println(SpecialColor.RED + " Dosya Ekleme Hatası" + SpecialColor.RESET);
            io.printStackTrace();
        }
    }

    // File Read
    // Öğrenci Listesini Yükle (Dosya)
    private void loadStudentsListFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            studentCounter = studentDtoList.size();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(SpecialColor.RED + " Öğrenci Kayıdı bulunamadı " + SpecialColor.RESET);
            fileNotFoundException.printStackTrace();
        } catch (IOException io) {
            System.out.println(SpecialColor.RED + " Dosya Okuma Hatası" + SpecialColor.RESET);
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /// /////////////////////////////////////////////////////////////
    // Öğrenci Ekle
    public void add(StudentDto dto) {
        studentDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(), dto.getBirthDate(), dto.getGrade()));
        System.out.println(SpecialColor.YELLOW + " Öğrenci Eklendi" + SpecialColor.RESET);
        // File Ekle
        saveToFile();
    }

    // Öğrenci Listesi
    public void list() {
        // Öğrenci Yoksa
        if (studentDtoList.isEmpty()) {
            System.out.println(SpecialColor.RED + " Öğrenci yoktur" + SpecialColor.RESET);
            return;
        } else {
            studentDtoList.forEach(System.out::println);
        }
    }

    // Öğrenci Ara
    public void search(String name) {
        studentDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    // Öğrenci Güncelle
    public void update(int id, StudentDto dto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDate(dto.getBirthDate());
                temp.setGrade(dto.getGrade());
                System.out.println("Öğrenci Güncellendi");
                saveToFile();
                return;
            }
        }
        System.out.println(SpecialColor.RED + " Öğrenci Bulunamadı" + SpecialColor.RESET);
    }

    // Öğrenci Sil
    public void delete(int id) {
        studentDtoList.removeIf(temp -> temp.getId() == id);
        System.out.println(SpecialColor.BLUE + " Öğrenci Silindir" + SpecialColor.RESET);
        saveToFile();
    }

    ////////////////////////////////////////////////////////////////
    // Toplam Öğrenci Sayısı
    // Rastgele Öğrenci
    // Öğrenci Not Ortalaması Hesapla
    // En Yüksek veya En Düşük Not Alan Öğrenci
    // Öğrenci Sıralaması (Doğum günü)
    // Console Seçim (Öğrenci Ekle)
}
