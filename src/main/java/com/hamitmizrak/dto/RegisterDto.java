package com.hamitmizrak.dto;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterDto {

    private static final Logger logger = Logger.getLogger(RegisterDto.class.getName());

    private int id;
    private String nickname;
    private String emailAddress;
    private String password;
    private boolean isLocked;
    private String role;

    private StudentDto studentDto;
    private TeacherDto teacherDto;

    private static final String AES_ALGORITHM = "AES";
    private static final String SECRET_KEY = "MY_SECRET_AES_KEY12"; // 16 karakter olmalı

    public RegisterDto() {
        this.id = 0;
        this.nickname = "your_nickname";
        this.emailAddress = "your_email@example.com";
        this.password = encryptPassword("default_password");
        this.role = "UNKNOWN";
        this.isLocked = false;
        this.studentDto = null;
        this.teacherDto = null;
    }

    public RegisterDto(int id, String nickname, String emailAddress, String password, String role, boolean isLocked,
                       StudentDto studentDto, TeacherDto teacherDto) {
        this.id = id;
        this.nickname = (nickname != null && !nickname.isBlank()) ? nickname.toLowerCase() : "unknown_user";
        this.emailAddress = emailAddress;
        this.password = encryptPassword(password);
        this.role = (role != null && !role.isBlank()) ? role.toUpperCase() : "UNKNOWN";
        this.isLocked = isLocked;
        this.studentDto = studentDto;
        this.teacherDto = teacherDto;
    }

    private static SecretKey generateKey() {
        byte[] keyBytes = SECRET_KEY.getBytes(StandardCharsets.UTF_8);
        return new SecretKeySpec(keyBytes, 0, 16, AES_ALGORITHM); // İlk 16 baytı kullan
    }


    public static String encryptPassword(String password) {
        try {
            SecretKey key = generateKey();
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedBytes = cipher.doFinal(password.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "❌ Şifreleme başarısız!", e);
            return null;
        }
    }

    public static String decryptPassword(String encryptedPassword) {
        try {
            SecretKey key = generateKey();
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "❌ Şifre çözme başarısız!", e);
            return null;
        }
    }

    public boolean validatePassword(String inputPassword) {
        String decryptedPassword = decryptPassword(this.password);
        return decryptedPassword != null && decryptedPassword.equals(inputPassword);
    }

    public String getDecryptedPassword() {
        return decryptPassword(this.password);
    }

    @Override
    public String toString() {
        return "RegisterDto{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", role='" + role + '\'' +
                ", isLocked=" + isLocked +
                '}';
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = encryptPassword(password); }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public boolean isLocked() { return isLocked; }
    public void setLocked(boolean locked) { isLocked = locked; }

    public StudentDto getStudentDto() { return studentDto; }
    public void setStudentDto(StudentDto studentDto) { this.studentDto = studentDto; }

    public TeacherDto getTeacherDto() { return teacherDto; }
    public void setTeacherDto(TeacherDto teacherDto) { this.teacherDto = teacherDto; }
}