package com.hamitmizrak.dao;

import com.hamitmizrak.dto.ERole;
import com.hamitmizrak.dto.EStudentType;
import com.hamitmizrak.dto.RegisterDto;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.iofiles.FileHandler;
import com.hamitmizrak.utils.SpecialColor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegisterDao implements IDaoGenerics<RegisterDto> {

    // field
    private final List<RegisterDto> registerDtoList;

    // IO
    // FileHandler
    private FileHandler fileHandler;
    private String filePath;

    ///////////////////////////////////////////////////////////////////////
    // static
    static {
        System.out.println(SpecialColor.RED+" Static: RegisterDao"+ SpecialColor.RESET);
    }

    // Parametresiz Constructor
    public RegisterDao() {
        // FileHandler
        this.fileHandler= new FileHandler();
        this.fileHandler.setFilePath("registers.txt");

        // null pointer almamak için
        registerDtoList = new ArrayList<>();

        // Eğer registers.txt yoksa otomatik oluştur
        this.fileHandler.createFileIfNotExists();

        // Program başlarken registers Listesini hemen yüklesin
        this.fileHandler.readFile(this.fileHandler.getFilePath());
    }


    /// ///////////////////////////////////////////////////////////////////////////////////////////
    // 📌 Register nesnesini CSV formatına çevirme
    // Bu metod, bir RegisterDto nesnesini virgülle ayrılmış bir metin (CSV) formatına çevirir.
    // Böylece Register verileri bir dosyada satır bazlı olarak saklanabilir.
    private String registerToCsv(RegisterDto registerDto) {
        return
                registerDto.getId() + "," +          // Register ID'sini ekler
                        registerDto.getNickname() + "," +        // Register adını ekler
                        registerDto.getEmailAddress() + "," +     // Register soyadını ekler
                        registerDto.getPassword() + "," +     // Register vize notunu ekler
                        registerDto.getRole();   // Register doğum tarihini ekler
    }

    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme
    // Bu metod, CSV formatındaki bir satırı parçalayarak bir StudentDto nesnesine dönüştürür.
    // Dosyadan okunan her satır için çağrılır ve veriyi uygun şekilde nesneye aktarır.
    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme (Dosyadan okurken)
    private RegisterDto csvToRegister(String csvLine) {
        try {
            String[] parts = csvLine.split(",");  // Satırı virgülle bölerek bir dizi oluşturur
            if (parts.length < 5)
            {
                System.err.println("X Hatalı CSV Formatı"+csvLine);
                return null;    // **Eksik veri varsa işlemi durdurur ve null döndürür**
            }
            int id= generateNewId(); //ID Atasın
            return new RegisterDto(id, parts[0],parts[1],parts[2],parts[3],null,null );
        } catch (Exception e) {
            System.out.println(SpecialColor.RED + "CSV'den Register yükleme hatası!" + SpecialColor.RESET);
            return null; // Hata durumunda null döndürerek programın çökmesini engeller
        }
    }

    // Random Generate New Id
    private int generateNewId() {
        return 0;
    }

    /// ///////////////////////////////////////////////////////////////
    @Override
    public Optional<RegisterDto> create(RegisterDto registerDto) {
        return Optional.empty();
    }

    @Override
    public List<RegisterDto> list() {
        return List.of();
    }

    @Override
    public Optional<RegisterDto> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<RegisterDto> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<RegisterDto> update(int id, RegisterDto registerDto) {
        return Optional.empty();
    }

    @Override
    public Optional<RegisterDto> delete(int id) {
        return Optional.empty();
    }

    @Override
    public void chooise() {

    }
}
