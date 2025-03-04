package com.hamitmizrak.dto;

import com.hamitmizrak.utils.SpecialColor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;

// LOMBOK
@AllArgsConstructor
@Builder
@EqualsAndHashCode

// Student
public class StudentDto extends PersonDto implements Serializable {

    // Serileştirme
    private static final long serialVersionUID = 556364655645656546L;

    // Field
    private EStudentType eStudentType; // Enum Öğrenci Türü
    private Double midTerm;      // Vize notu
    private Double finalTerm;    // Final notu
    private Double resultTerm;   // Sonuç Notu: (Vize%40 + Final%60)
    private String status;       // Geçti mi ? Kaldı mı ?

    // static (Nesne boyunca 1 kere oluşturulur)
    static {
        System.out.println(SpecialColor.BLUE + "static StudentDto Yüklendi" + SpecialColor.RESET);
    }

    // Parametresiz Constructor
    public StudentDto() {
        super();
        this.midTerm = 0.0;
        this.finalTerm = 0.0;
        this.resultTerm = 0.0;
        this.resultTerm = 0.0; // varsayılan olarak
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "StudentDto{" +
                "eStudentType=" + eStudentType +
                ", midTerm=" + midTerm +
                ", finalTerm=" + finalTerm +
                ", resultTerm=" + resultTerm +
                ", status='" + status + '\'' +
                "} ";
    }

    @Override
    public void displayInfo() {
        System.out.println("Öğrenci " + name + " " + surname + " " + birthDate);
    }

    // Parametreli Constructor
    public StudentDto(Integer id, String name, String surname, LocalDate birthDate, Double midTerm, Double finalTerm, EStudentType eStudentType) {
        // Üst atadan gelen (StudentDto)
        super(id, name, surname, birthDate);
        // this: Local
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
        this.status = determineStatus();
        this.eStudentType = eStudentType;
    }

    // Metotlar
    // Vize ve Final Calculate
    // **📌 Sonuç Notu Hesaplama (Vize %40 + Final %60)**
    private Double calculateResult() {
        if (midTerm == null || finalTerm == null)
            return 0.0;
        else
            return (midTerm * 0.4 + finalTerm * 0.6);
    }

    // **📌 Status: Geçme / Kalma**
    private String determineStatus() {
        if (this.resultTerm == null) return "Bilinmiyor"; // **Null kontrolü ekledik**
        return (this.resultTerm >= 50.0) ? "Geçti" : "Kaldı";
    }


    /// ///////////////////////////////////////////////////////////////////////////////
    // Getter And Setter
    public EStudentType geteStudentType() {
        return eStudentType;
    }

    public void seteStudentType(EStudentType eStudentType) {
        this.eStudentType = eStudentType;
    }

    public Double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
    }

    public Double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
    }

    public Double getResultTerm() {
        return resultTerm != null ? resultTerm : 0.0;
    }

    public void setResultTerm(Double resultTerm) {
        if (resultTerm == null) {
            this.resultTerm = 0.0;
        }
        this.resultTerm = resultTerm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

} //end Student
