package com.hamitmizrak.exceptions;

public class TeacherNotFoundException extends RuntimeException {

    // Parametresiz Constructor
    public TeacherNotFoundException() {
        super("Kayıt bulunamadı");
    }

    // Parametreli Constructor
    public TeacherNotFoundException(String message) {
        super(message);
    }
}
