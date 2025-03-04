package com.hamitmizrak.dao;

import com.hamitmizrak.dto.EStudentType;
import com.hamitmizrak.dto.PersonDto;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.dto.TeacherDto;
import com.hamitmizrak.exceptions.TeacherNotFoundException;
import com.hamitmizrak.utils.SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * TeacherDao, Generics Yapıda
 * Lambda Expression
 */

public class TeacherDao implements IDaoGenerics<TeacherDto> {

    // Field
    private ArrayList<TeacherDto> teacherDtoList = new ArrayList<>();
    // ID artık tüm sınıflar tarafından erişilebilir olacak
    int maxId = 0;
    private static final String FILE_NAME = "teachers.txt";

    // Parametresiz Constructor
    public TeacherDao teacherDao() {
        // Eğer students.txt yoksa otomatik oluştur
        createFileIfNotExists();

        // Program başlarken Öğretmen Listesini hemen yüklesin
        loadStudentsListFromFile();
    }

    /// /////////////////////////////////////////////////////////////
    // FileIO
    // 📌 Eğer dosya yoksa oluşturur
    private void createFileIfNotExists() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println(SpecialColor.YELLOW + FILE_NAME + " oluşturuldu." + SpecialColor.RESET);
                }
            } catch (IOException e) {
                System.out.println(SpecialColor.RED + "Dosya oluşturulurken hata oluştu!" + SpecialColor.RESET);
                e.printStackTrace();
            }
        }
    }

    // 📌 Öğretmenleri dosyaya kaydetme (BufferedWriter)
    private void saveToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (StudentDto student : teacherDtoList) {
                bufferedWriter.write(teacherToCsv(student) + "\n");
            }
            System.out.println(SpecialColor.GREEN + "Öğretmenler dosyaya kaydedildi." + SpecialColor.RESET);
        } catch (IOException e) {
            System.out.println(SpecialColor.RED + "Dosya kaydetme hatası!" + SpecialColor.RESET);
            e.printStackTrace();
        }
    }

    // 📌 Öğretmenleri dosyadan yükleme (BufferedReader)
    private void loadStudentsListFromFile() {
        // Listedeki verileri temizle
        teacherDtoList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                TeacherDto teacherDto = csvToStudent(line);
                if (teacherDto != null) {
                    teacherDtoList.add(teacherDto);
                }
            }
            //studentCounter = studentDtoList.size();
            // ✅ Öğretmenler içindeki en büyük ID'yi bul
            /*
            studentCounter = studentDtoList.stream()
                    .mapToInt(StudentDto::getId)
                    .max()
                    .orElse(0); // Eğer Öğretmen yoksa sıfır başlat
            */


        } catch (IOException e) {
            System.out.println(SpecialColor.RED + "Dosya okuma hatası!" + SpecialColor.RESET);
            e.printStackTrace();
        }
    }


    /// /////////////////////////////////////////////////////////////
    // 📌 Öğretmen nesnesini CSV formatına çevirme
    // Bu metod, bir StudentDto nesnesini virgülle ayrılmış bir metin (CSV) formatına çevirir.
    // Böylece Öğretmen verileri bir dosyada satır bazlı olarak saklanabilir.
    private String teacherToCsv(TeacherDto teacherDto) {
        return
                teacherDto. () + "," +          // Öğretmen ID'sini ekler
                teacherDto.getName() + "," +        // Öğretmen adını ekler
                teacherDto.getSurname() + "," +     // Öğretmen soyadını ekler
                teacherDto.getMidTerm() + "," +     // Öğretmen vize notunu ekler
                teacherDto.getFinalTerm() + "," +   // Öğretmen final notunu ekler
                teacherDto.getResultTerm() + "," +  // Öğretmen sonuç notunu ekler
                teacherDto.getStatus() + "," +      // Öğretmen geçti/kaldı notunu ekler
                teacherDto.getBirthDate() + "," +   // Öğretmen doğum tarihini ekler
                teacherDto.geteStudentType();       // Öğretmennin eğitim türünü (Lisans, Yüksek Lisans vb.) ekler
    }

    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme
    // Bu metod, CSV formatındaki bir satırı parçalayarak bir StudentDto nesnesine dönüştürür.
    // Dosyadan okunan her satır için çağrılır ve veriyi uygun şekilde nesneye aktarır.
    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme (Dosyadan okurken)
    private StudentDto csvToStudent(String csvLine) {
        try {
            String[] parts = csvLine.split(",");  // Satırı virgülle bölerek bir dizi oluşturur
            if (parts.length < 9) return null;    // **Eksik veri varsa işlemi durdurur ve null döndürür**

            // PersonDto =>  Integer id, String name, String surname, LocalDate birthDate
            // StudentDto =>  Integer id, String name, String surname, LocalDate birthDate, Double midTerm, Double finalTerm,EStudentType eStudentType
            StudentDto student = new StudentDto(
                    Integer.parseInt(parts[0]),  // ID değerini integer olarak dönüştürür
                    parts[1],                    // Adı alır
                    parts[2],                    // Soyadı alır
                    LocalDate.parse(parts[3]),    // Doğum tarihini LocalDate formatına çevirir
                    Double.parseDouble(parts[4]), // Vize notunu double olarak dönüştürür
                    Double.parseDouble(parts[5]), // Final notunu double olarak dönüştürür
                    EStudentType.valueOf(parts[8]) // Öğretmennin eğitim türünü (Enum) çevirir
            );

            // **Geçti/Kaldı durumu CSV'den okunduğu gibi Öğretmen nesnesine eklenir**
            student.setResultTerm(Double.parseDouble(parts[6])); // **Sonuç notunu ayarla**
            student.setStatus(parts[7]); // **Geçti/Kaldı durumunu CSV'den al**

            return student;
        } catch (Exception e) {
            System.out.println(SpecialColor.RED + "CSV'den Öğretmen yükleme hatası!" + SpecialColor.RESET);
            return null; // Hata durumunda null döndürerek programın çökmesini engeller
        }
    }

    LocalDate birthDate

    /// /////////////////////////////////////////////////////////////
    // C-R-U-D
    // Öğretmen Create
    @Override
    public TeacherDto create(TeacherDto teacherDto) {
        try {
            teacherDto = new TeacherDto(
                    new PersonDto(
                            maxId++,
                            teacherDto.personDto().getName(),
                            teacherDto.personDto().getSurname(),
                            teacherDto.personDto().getBirthDate()),
                    teacherDto.subject(), teacherDto.yearsOfExperience(), teacherDto.isTenured(), teacherDto.salary());
            teacherDtoList.add(teacherDto);

            saveToFile();
            System.out.println(teacherDto + SpecialColor.GREEN + "✅ teacherDto başarıyla eklendi!" + SpecialColor.RESET);
            return teacherDto;

        } catch (IllegalArgumentException e) {
            System.out.println(SpecialColor.RED + "⛔ Hata: " + e.getMessage() + SpecialColor.RESET);
            return null; // Hata durumunda nesne oluşturulmaz
        }
    }

    // Öğretmen Find By Name
    @Override
    public TeacherDto findByName(String name) {
        if(teacherDtoList.isEmpty()) throw  new TeacherNotFoundException("Öğretmen bulunamadı");
        return teacherDtoList.stream().filter(temp -> temp.personDto().getName().equalsIgnoreCase(name)).findFirst().orElseThrow(() -> TeacherNotFoundException(name+" isimli öğretmen yoktur"));
    }

    @Override
    public TeacherDto findById(int id) {
        if(teacherDtoList.isEmpty()) throw  new TeacherNotFoundException("Öğretmen bulunamadı");
        return teacherDtoList.stream().filter(temp-> temp.getID().eequals(id)).orElseThrow(() -> TeacherNotFoundException(id+" ID öğretmen yoktur"));
    }

    // LIST
    @Override
    public List<TeacherDto> list() {
        if(teacherDtoList.isEmpty()) throw  new TeacherNotFoundException("Öğretmen bulunamadı");
        teacherDtoList.forEach(System.out::println); //Lambda ile Method Referance kullandım
        return teacherDtoList; //List.of();
    }

    @Override
    public TeacherDto update(int id, TeacherDto teacherDto) {
        TeacherDto updateTeacher= new PersonDto(
                maxId++,
                teacherDto.personDto().getName(),
                teacherDto.personDto().getSurname(),
                teacherDto.personDto().getBirthDate()),
        teacherDto.subject(), teacherDto.yearsOfExperience(), teacherDto.isTenured(), teacherDto.salary());
        return null;
    }

    // Öğretmen Silme (Lambda)
    @Override
    public TeacherDto delete(int id) {
        try {
        Predicate<TeacherDto> isMatch = temp ->temp.personDto().getId().equals(id);
        TeacherDto foundUpdate= teacherDtoList.stream().filter(isMatch).findFirst().orElseThrow(() -> new TeacherNotFoundException("ID: "+id+ "Öğretmen bulumadı"));
        teacherDtoList.removeIf(isMatch);
        saveToFile();
        return foundUpdate;
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void chooise() {

    }
}
