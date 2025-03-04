package com.hamitmizrak.dto;

import java.io.Serializable;
import java.time.LocalDate;

public record TeacherDto(
        Integer id,
        String name,
        String surname,
        LocalDate birthDate,
        String subject,
        int yearsOfExperience,
        boolean isTenured,
        double salary
) implements Serializable {

    public TeacherDto {
        if (id == null || id < 0) throw new IllegalArgumentException("ID negatif olamaz");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("İsim boş olamaz");
        if (surname == null || surname.isBlank()) throw new IllegalArgumentException("Soyisim boş olamaz");
        if (birthDate == null) throw new IllegalArgumentException("Doğum tarihi boş olamaz");
        if (subject == null || subject.isBlank()) throw new IllegalArgumentException("Uzmanlık alanı boş olamaz");
        if (yearsOfExperience < 0) throw new IllegalArgumentException("Deneyim yılı negatif olamaz");
        if (salary < 0) throw new IllegalArgumentException("Maaş negatif olamaz");
    }

    public String fullName() {
        return name + " " + surname;
    }

    public String experienceLevel() {
        return (yearsOfExperience > 10) ? "Kıdemli Öğretmen" : "Deneyimli Öğretmen";
    }
}
