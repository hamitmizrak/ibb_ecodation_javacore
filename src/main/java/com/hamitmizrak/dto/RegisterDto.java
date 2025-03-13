package com.hamitmizrak.dto;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class RegisterDto {

    // Register Field
    private String emailAddress;
    private String password;
    // Composition

    // AES ENCRYPTED
    private static final String AES_ALGORITHM="AES";
    private static final String SECRET_KEY="MY_SECRET_AES_KEY"; //Gerçek projelerde dikkat güvenli olması gerekiyor

    // Composition
    private StudentDto studentDto;

    // Parametresiz Constructor
    public RegisterDto() {
        this.emailAddress= "your_email address";
        this.password="your password";
        studentDto= new StudentDto();
    }

    // Parametreli Constructor
    public RegisterDto(String emailAddress, String password, StudentDto studentDto) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.studentDto = studentDto;
    }

    // Method
    // AES Şifreleme
    private static String encryptPassword(String password){
        try {
            SecretKey key = generateKey();
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedBytes = cipher.doFinal(password.getBytes(StandardCharsets.UTF_8));
            return new String(encryptedBytes, StandardCharsets.UTF_8);
        }catch (Exception exception){
            exception.printStackTrace();
            throw new RuntimeException("Encrption Failed",exception);
        }
    }

    // AES Şifre Çözme
    public static String deEncryptPassword(String encryptedPassword){
        try {
            SecretKey key = generateKey();
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedPassword));
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        }catch (Exception exception){
            exception.printStackTrace();
            throw new RuntimeException("Encrption Failed",exception);
        }
    }

    // Anahtar
    private static SecretKey generateKey()  {
        try {
            byte[] keyBytes = SECRET_KEY.getBytes(StandardCharsets.UTF_8);
            return new SecretKeySpec(keyBytes,0,16,AES_ALGORITHM);
        }catch (Exception exception){
            exception.printStackTrace();
            throw new RuntimeException("Encrption Failed",exception);
        }

    }

    // toString
    @Override
    public String toString() {
        return "RegisterDto{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", studentDto=" + studentDto +
                '}';
    }

    // Getter And Setter
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }
    // Gelen şifreyi masking(Maskele)
    public void setPassword(String password) {
        try {
            this.password= encryptPassword(password);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public StudentDto getStudentDto() {
        return studentDto;
    }

    public void setStudentDto(StudentDto studentDto) {
        this.studentDto = studentDto;
    }

}
