package com.hamitmizrak.dto;

import com.hamitmizrak.utils.SpecialColor;

import java.io.Serializable;
import java.time.LocalDate;

public class StudentDto extends PersonDto implements Serializable {

    // Serileştirme
    private static final long serialVersionUID = 556364655645656546L;

    // Field
    private EStudentType eStudentType;
    private ERole eRole;
    private Double midTerm;
    private Double finalTerm;
    private Double resultTerm;
    private String status;

    // static (Nesne boyunca 1 kere oluşturulur)
    static {
        System.out.println(SpecialColor.BLUE + "static StudentDto Yüklendi" + SpecialColor.RESET);
    }

    // Parametresiz Constructor
    public StudentDto() {
        super();
        this.eStudentType = EStudentType.OTHER;
        this.eRole = ERole.STUDENT;
        this.midTerm = 0.0;
        this.finalTerm = 0.0;
        this.resultTerm = calculateResult();
        this.status = determineStatus();
    }

    // Parametreli Constructor
    public StudentDto(Integer id, String name, String surname, LocalDate birthDate,
                      Double midTerm, Double finalTerm, EStudentType eStudentType, ERole eRole) {
        super(id, name, surname, birthDate);
        this.midTerm = (midTerm != null) ? midTerm : 0.0;
        this.finalTerm = (finalTerm != null) ? finalTerm : 0.0;
        this.resultTerm = calculateResult();
        this.status = determineStatus();
        this.eStudentType = eStudentType;
        this.eRole = eRole;
    }

    public StudentDto(Integer id, String name, String surname, LocalDate birthDate, EStudentType eStudentType, ERole eRole) {
        super(id, name, surname, birthDate);
        this.resultTerm = calculateResult();
        this.status = determineStatus();
        this.eStudentType = eStudentType;
        this.eRole = eRole;
    }

    // Metotlar
    // Vize ve Final Calculate
    // **📌 Sonuç Notu Hesaplama (Vize %40 + Final %60)**
    private Double calculateResult() {
        return ((midTerm != null ? midTerm : 0.0) * 0.4 + (finalTerm != null ? finalTerm : 0.6));
    }

    // **📌 Status: Geçme / Kalma**
    private String determineStatus() {
        return (this.resultTerm >= 50.0) ? "Geçti" : "Kaldı";
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", birthDate=" + getBirthDate() +
                ", eStudentType=" + eStudentType +
                ", eRole=" + eRole +
                ", midTerm=" + midTerm +
                ", finalTerm=" + finalTerm +
                ", resultTerm=" + resultTerm +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    /// ///////////////////////////////////////////////////////////////////////////////
    // Getter And Setter
    public EStudentType getEStudentType() {
        return eStudentType;
    }

    public void setEStudentType(EStudentType eStudentType) {
        this.eStudentType = eStudentType;
    }

    public ERole getERole() {
        return eRole;
    }

    public void setERole(ERole eRole) {
        this.eRole = eRole;
    }

    public Double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
        this.resultTerm = calculateResult();
        this.status = determineStatus();
    }

    public Double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
        this.status = determineStatus();
    }

    public Double getResultTerm() {
        return resultTerm;
    }

    public String getStatus() {
        return status;
    }
}