package com.hamitmizrak.dto;

import java.time.LocalDate;
import java.util.Date;

/**
 * 📌 Temel Kişi (Person) DTO Sınıfı
 * Öğrenci ve öğretmen gibi varlıklar için ortak alanları içerir.
 */
public abstract class PersonDto {

    protected Integer id;
    protected String name;
    protected String surname;
    protected LocalDate birthDate;
    protected final Date createdDate;

    /**
     * 📌 Varsayılan Constructor (Boş nesne oluşturur)
     */
    public PersonDto() {
        this.id = 0;
        this.name = "Bilinmeyen";
        this.surname = "Bilinmeyen";
        this.birthDate = LocalDate.now();
        this.createdDate = new Date();  // Değiştirilemez alan
    }

    /**
     * 📌 Parametreli Constructor
     */
    public PersonDto(Integer id, String name, String surname, LocalDate birthDate) {
        this.id = (id != null) ? id : 0;
        this.name = (name != null && !name.isBlank()) ? name : "Bilinmeyen";
        this.surname = (surname != null && !surname.isBlank()) ? surname : "Bilinmeyen";
        this.birthDate = (birthDate != null) ? birthDate : LocalDate.now();
        this.createdDate = new Date();  // Değiştirilemez alan
    }

    /**
     * 📌 Soyut Metot - Alt sınıflar tarafından uygulanmalıdır.
     */
    public abstract void displayInfo();

    @Override
    public String toString() {
        return "PersonDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", createdDate=" + createdDate +
                '}';
    }

    // Getter & Setter Metotları
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = (id != null) ? id : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name != null && !name.isBlank()) ? name : "Bilinmeyen";
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = (surname != null && !surname.isBlank()) ? surname : "Bilinmeyen";
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = (birthDate != null) ? birthDate : LocalDate.now();
    }

    public Date getCreatedDate() {
        return createdDate; // Değiştirilemez
    }
}
