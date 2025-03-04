package com.hamitmizrak.dto;

import java.io.Serializable;

/**
 * @param personDto
 * @param subject
 * @param yearsOfExperience
 * @param isTenured
 * @param salary
 * TeacherDto bir Record olarak tanımlanmıştır.
 * Record'lar Javada Immutable(değiştirilemez)  veri taşıma nesneleridir.
 * Inheritance (Desteklemez)  ancak Composition yöntemiyle PersonDto kullanabiliriz
 */

/*
Dikkat:
1-) Record => public record Deneme(PARAMETRELER){}
2-) Constructor public Deneme {}
*/

// RECORD
public record TeacherDto(
        PersonDto personDto, // (Composition) PersonDto içindeki ortak alanları kullanır.
        String subject,      // Öğretmenin Uzmanlık Alanı Branşı
        int yearsOfExperience, // Öğretmenin toplam deneyim yılı
        boolean isTenured,  // Kadrolu mu? (true,false)
        double salary       // Öğretmenin maaşı
) implements Serializable {

    // Varsayılan Constructorlar ile Veri doğrulaması
    public TeacherDto {
        if (personDto == null) throw new IllegalArgumentException("Teacher içinde Person bilgisi boş geçilemez");
        if (subject == null || subject.isBlank() || subject.isEmpty())
            throw new IllegalArgumentException("Öğrenmenin uzmanlık alanını boş geçtiniz");
        if (yearsOfExperience < 0) throw new IllegalArgumentException("Deneyim yılınız sıfırdan küçük yazılmaz.");
        if (salary < 0) throw new IllegalArgumentException("Maaş negatif olamaz");
    }

    // Method
    public String fullName() {
        return personDto.id + " " + personDto.name + " " + personDto.surname;
    }

    public String experienceLevel() {
        return (yearsOfExperience > 10) ? "Kıdemli Öğretmen" : "Yeni Öğretmen";
    }

} //end Record
