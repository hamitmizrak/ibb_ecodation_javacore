package com.hamitmizrak.project_step1_file;

import java.util.ArrayList;

// Öğrenci Yönetim Sistemi
public class StudentManagementSystem {

    // Field
    private ArrayList<StudentDto> students = new ArrayList<>();
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

    // Öğrenci Listesini Yükle(Dosya)
    private void loadStudentsListFromFile() {
    }

    // Öğrenci Ekle
    // Öğrenci Listesi
    // Öğrenci Ara
    // Öğrenci Güncelle
    // Öğrenci Sil
    ////////////////////////////////////////////////////////////////
    // FileIO Create
    // Öğrenci Dosyalarını kaydeden metot
    // Öğrenci Dosyalarını okuyan metot

    ////////////////////////////////////////////////////////////////
    // Toplam Öğrenci Sayısı
    // Öğrenci Not Ortalaması Hesapla
    // En Yüksek veya En Düşük Not Alan Öğrenci
    // Öğrenci Sıralaması (Doğum günü)
    // Console Seçim (Öğrenci Ekle)


}
