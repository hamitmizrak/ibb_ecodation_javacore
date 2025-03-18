package com.hamitmizrak.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Logger;

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

// Record : TeacherDto
public record TeacherDto(
        Integer id,
        String name,
        String surname,
        LocalDate birthDate,
        ETeacherSubject subject,
        int yearsOfExperience,
        boolean isTenured,
        double salary
) implements Serializable {

    // Logger
    private static final Logger logger = Logger.getLogger(TeacherDto.class.getName());

    public TeacherDto {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("❌ ID negatif olamaz!");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("❌ İsim boş olamaz!");
        }
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("❌ Soyisim boş olamaz!");
        }
        if (birthDate == null) {
            throw new IllegalArgumentException("❌ Doğum tarihi boş olamaz!");
        }
        if (subject == null) {
            throw new IllegalArgumentException("❌ Uzmanlık alanı boş olamaz!");
        }
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("❌ Deneyim yılı negatif olamaz!");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("❌ Maaş negatif olamaz!");
        }
    }
    // Method
    public String fullName() {
        return id + " - " + name + " " + surname + " (" + subject + ")";
    }

    public String experienceLevel() {
        if (yearsOfExperience >= 15) {
            return "Kıdemli Öğretmen 🏅";
        } else if (yearsOfExperience >= 5) {
            return "Deneyimli Öğretmen 🎓";
        } else {
            return "Yeni Öğretmen 🆕";
        }
    }

    @Override
    public String toString() {
        return "TeacherDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", subject=" + subject +
                ", yearsOfExperience=" + yearsOfExperience +
                ", isTenured=" + isTenured +
                ", salary=" + salary +
                ", experienceLevel=" + experienceLevel() +
                '}';
    }
}
