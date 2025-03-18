package com.hamitmizrak.dto;

/**
 * 📌 Öğretmen Branşları Enum
 */
public enum ETeacherSubject {
    MATHEMATICS("Matematik"),
    CHEMISTRY("Kimya"),
    BIOLOGY("Biyoloji"),
    HISTORY("Tarih"),
    COMPUTER_SCIENCE("Bilgisayar Bilimi"),
    OTHER("Diğer");

    private final String description;

    ETeacherSubject(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
