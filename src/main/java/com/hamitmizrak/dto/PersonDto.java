package com.hamitmizrak.dto;

import java.time.LocalDate;
import java.util.Date;

// Dikkat: Record'ta abstract, inheritance kullanamazsınız.
public abstract class PersonDto {

    protected Integer id;
    protected String name;
    protected String surname;
    protected LocalDate birthDate;
    protected Date createdDate;

    // Parametresiz constructor
    public PersonDto() {
        this.id = 0;
        this.name = "name Unknown";
        this.surname = "surnameUnknown";
        this.birthDate = LocalDate.now();
        this.createdDate = new Date();
    }

    // Parametreli constructor
    public PersonDto(Integer id, String name, String surname, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.createdDate = new Date();
    }

    // Abstract Method
    public abstract void displayInfo();

    // ToString
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

    // Getter & Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
