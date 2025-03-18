package com.hamitmizrak.dto;

/**
 * 📌 Kullanıcı Rollerini Tanımlayan Enum
 */
public enum ERole {
    STUDENT("Öğrenci"),
    TEACHER("Öğretmen"),
    ADMIN("Yönetici");

    // Field
    private final String description;

    // Parametreli
    ERole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 📌 String’den Enum’a güvenli dönüşüm yapar.
     */
    public static ERole fromString(String role) {
        try {
            return ERole.valueOf(role.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("❌ Geçersiz rol: " + role);
        }
    }
}
