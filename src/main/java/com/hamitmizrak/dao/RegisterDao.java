package com.hamitmizrak.dao;

import com.hamitmizrak.dto.ERole;
import com.hamitmizrak.dto.EStudentType;
import com.hamitmizrak.dto.RegisterDto;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.exceptions.RegisterNotFoundException;
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
        System.out.println(SpecialColor.RED + " Static: RegisterDao" + SpecialColor.RESET);
    }

    // Parametresiz Constructor
    public RegisterDao() {
        // FileHandler
        this.fileHandler = new FileHandler();
        this.fileHandler.setFilePath("registers.txt");

        // null pointer almamak için
        registerDtoList = new ArrayList<>();

        // Eğer registers.txt yoksa otomatik oluştur
        this.fileHandler.createFileIfNotExists();

        // Program başlarken registers Listesini hemen yüklesin
        this.fileHandler.readFile(this.fileHandler.getFilePath());
    }


    /// ///////////////////////////////////////////////////////////////////////////////////////////
    // Random Generate New Id
    // generateNewId() bu metot registerList adlı koleksiyonumzda bulunan ID değerinin en büyüğünü bulsun
    // ve buna 1 eklesin ve yeni bir ID döndürsün
    // ID her seferinde 1 artır.
    public int generateNewId() {
        return registerDtoList
                .stream() // Java Stream API kullanarak liste üzerindeki işlemleri bir akış(stream) halinde
                .mapToInt(RegisterDto::getId) //IntStream
                .max()
                .orElse(0) + 1; // Liste boşsa 0 göndür ve yeni ID olarak en büyük değere 1 eklesin
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
                        registerDto.isLocked() + "," +     // Register Kiliti
                        registerDto.getRole();   // Register doğum tarihini ekler
    }

    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme
    // Bu metod, CSV formatındaki bir satırı parçalayarak bir StudentDto nesnesine dönüştürür.
    // Dosyadan okunan her satır için çağrılır ve veriyi uygun şekilde nesneye aktarır.
    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme (Dosyadan okurken)
    private RegisterDto csvToRegister(String csvLine) {
        try {
            String[] parts = csvLine.split(",");  // Satırı virgülle bölerek bir dizi oluşturur
            if (parts.length < 6) {
                System.err.println("X Hatalı CSV Formatı" + csvLine);
                return null;    // **Eksik veri varsa işlemi durdurur ve null döndürür**
            }
            int id = generateNewId(); //ID Atasın
            return new RegisterDto(id, parts[0], parts[1], parts[2], parts[3],Boolean.valueOf(parts[4]) , null, null);
        } catch (Exception e) {
            System.out.println(SpecialColor.RED + "CSV'den Register yükleme hatası!" + SpecialColor.RESET);
            return null; // Hata durumunda null döndürerek programın çökmesini engeller
        }
    }


    /// ///////////////////////////////////////////////////////////////
    /// CREATE (REGISTER)
    @Override
    public Optional<RegisterDto> create(RegisterDto registerDto) {
        registerDtoList.add(registerDto);
        this.fileHandler.writeFile(registerToCsv(registerDto));
        return Optional.of(registerDto);
    }

    /// LIST (REGISTER)
    @Override
    public List<RegisterDto> list() {
        if (registerDtoList.isEmpty()) {
            throw new RegisterNotFoundException(SpecialColor.BLUE + "Kayıtlı kullanıcı bulunamadı" + SpecialColor.RESET);
        }
        return new ArrayList<>(registerDtoList);
    }


    /// FIND BY NICKNAME (REGISTER)
    @Override
    public Optional<RegisterDto> findByName(String nickName) {
        return registerDtoList
                .stream()
                .filter(s -> s.getNickname().equalsIgnoreCase(nickName))
                .findFirst();
    }

    /// FIND BY EMAIL (REGISTER)
    public Optional<RegisterDto> findByEmail(String email) {
        return registerDtoList
                .stream()
                .filter(s -> s.getEmailAddress().equals(email))
                .findFirst();
    }

    /// FIND BY ID (REGISTER)
    @Override
    public Optional<RegisterDto> findById(int id) {
        return registerDtoList
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst();
    }

    /// UPDATE (REGISTER)
    @Override
    public Optional<RegisterDto> update(int id, RegisterDto registerDto) {
        if (registerDto != null) {
            for (int i = 0; i < registerDtoList.size(); i++) {
                if (registerDtoList.get(i).getId() == id) {
                    registerDtoList.set(i, registerDto);
                    this.fileHandler.writeFile(this.fileHandler.getFilePath());

                }
            }
        }
        throw new RegisterNotFoundException("Güncellenecek Kayıt bulunamadı");
        //return Optional.of(registerDto);
    }

    /// DELETE (REGISTER)
    @Override
    public Optional<RegisterDto> delete(int id) {
        return Optional.empty();
    }

    /// //////////////////////////////////////////////////////////////

    /// CHOOISE (REGISTER)
    @Override
    public void chooise() {

    }
} //end class
