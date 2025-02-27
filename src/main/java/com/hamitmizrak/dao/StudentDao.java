package com.hamitmizrak.dao;

import com.hamitmizrak.dto.EStudentType;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.exceptions.StudentNotFoundException;
import com.hamitmizrak.utils.SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;


// Öğrenci Yönetim Sistemi
public class StudentDao implements IDaoGenerics<StudentDto> {

    // Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

    // **📌 Scanner Nesnesini En Üste Tanımladık**
    private final Scanner scanner = new Scanner(System.in);

    // static
    static {

    }

    // Parametresiz Constructor
    public StudentDao() {
        // Eğer students.txt yoksa otomatik oluştur
        createFileIfNotExists();

        // Program başlarken Öğrenci Listesini hemen yüklesin
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

    // 📌 Öğrencileri dosyaya kaydetme (BufferedWriter)
    private void saveToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (StudentDto student : studentDtoList) {
                bufferedWriter.write(studentToCsv(student) + "\n");
            }
            System.out.println(SpecialColor.GREEN + "Öğrenciler dosyaya kaydedildi." + SpecialColor.RESET);
        } catch (IOException e) {
            System.out.println(SpecialColor.RED + "Dosya kaydetme hatası!" + SpecialColor.RESET);
            e.printStackTrace();
        }
    }

    // 📌 Öğrencileri dosyadan yükleme (BufferedReader)
    private void loadStudentsListFromFile() {
        // Listedeki verileri temizle
        studentDtoList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StudentDto student = csvToStudent(line);
                if (student != null) {
                    studentDtoList.add(student);
                }
            }
            //studentCounter = studentDtoList.size();
            // ✅ Öğrenciler içindeki en büyük ID'yi bul
            studentCounter = studentDtoList.stream()
                    .mapToInt(StudentDto::getId)
                    .max()
                    .orElse(0); // Eğer öğrenci yoksa sıfır başlat
            System.out.println(SpecialColor.BLUE + "Dosyadan yüklenen öğrenci sayısı: " + studentCounter + SpecialColor.RESET);
        } catch (IOException e) {
            System.out.println(SpecialColor.RED + "Dosya okuma hatası!" + SpecialColor.RESET);
            e.printStackTrace();
        }
    }

    /// /////////////////////////////////////////////////////////////
    // 📌 Öğrenci nesnesini CSV formatına çevirme
    // Bu metod, bir StudentDto nesnesini virgülle ayrılmış bir metin (CSV) formatına çevirir.
    // Böylece öğrenci verileri bir dosyada satır bazlı olarak saklanabilir.
    private String studentToCsv(StudentDto student) {
        return student.getId() + "," +          // Öğrenci ID'sini ekler
                student.getName() + "," +        // Öğrenci adını ekler
                student.getSurname() + "," +     // Öğrenci soyadını ekler
                student.getMidTerm() + "," +     // Öğrenci vize notunu ekler
                student.getFinalTerm() + "," +   // Öğrenci final notunu ekler
                student.getResultTerm() + "," +  // Öğrenci sonuç notunu ekler
                student.getBirthDate() + "," +   // Öğrenci doğum tarihini ekler
                student.geteStudentType();       // Öğrencinin eğitim türünü (Lisans, Yüksek Lisans vb.) ekler
    }

    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme
    // Bu metod, CSV formatındaki bir satırı parçalayarak bir StudentDto nesnesine dönüştürür.
    // Dosyadan okunan her satır için çağrılır ve veriyi uygun şekilde nesneye aktarır.
    private StudentDto csvToStudent(String csvLine) {
        try {
            String[] parts = csvLine.split(",");  // Satırı virgülle bölerek bir dizi oluşturur
            if (parts.length < 8) return null;    // Eksik veri varsa işlemi durdurur ve null döndürür

            return new StudentDto(
                    Integer.parseInt(parts[0]),  // ID değerini integer olarak dönüştürür
                    parts[1],                    // Adı alır
                    parts[2],                    // Soyadı alır
                    Double.parseDouble(parts[3]), // Vize notunu double olarak dönüştürür
                    Double.parseDouble(parts[4]), // Final notunu double olarak dönüştürür
                    LocalDate.parse(parts[6]),    // Doğum tarihini LocalDate formatına çevirir
                    EStudentType.valueOf(parts[7]) // Öğrencinin eğitim türünü (Enum) çevirir
            );
        } catch (Exception e) {
            // Eğer CSV'den okuma sırasında hata olursa, hata mesajını gösterir
            System.out.println(SpecialColor.RED + "CSV'den öğrenci yükleme hatası!" + SpecialColor.RESET);
            return null; // Hata durumunda null döndürerek programın çökmesini engeller
        }
    }

    /// /////////////////////////////////////////////////////////////
    // C-R-U-D
    // Öğrenci Ekle
    @Override
    public StudentDto create(StudentDto studentDto) {
        studentDto.setId(++studentCounter);
        studentDtoList.add(
                new StudentDto(studentDto.getId()-1, studentDto.getName(), studentDto.getSurname(), studentDto.getMidTerm(), studentDto.getFinalTerm(), studentDto.getBirthDate(), studentDto.geteStudentType())
        );
        System.out.println(SpecialColor.YELLOW + " Öğrenci Eklendi" + SpecialColor.RESET);
        // File Ekle
        saveToFile();
        return studentDto;
    }


    // Öğrenci Listesi
    @Override
    public ArrayList<StudentDto> list() {
        // Öğrenci Yoksa
        if (studentDtoList.isEmpty()) {
            System.out.println(SpecialColor.RED + " Öğrenci yoktur" + SpecialColor.RESET);
            throw new StudentNotFoundException("Öğrenci Yoktur");
        } else {
            System.out.println(SpecialColor.BLUE + " Öğrenci Listesi" + SpecialColor.RESET);
            studentDtoList.forEach(System.out::println);
        }
        return studentDtoList;
    }

    // Öğrenci Ara
    @Override
    public StudentDto findByName(String name) {
        // 1.YOL
        /* studentDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println); */
        // Eğer Öğrenci varsa true dönder

        // 2.YOL
        /*
        boolean found = studentDtoList
                .stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .peek(System.out::println) // Eğer ilgili data varsa yazdır
                .findAny() // Herhangi bir eşleşen öğrenci var mı yok mu ? kontrol et
                .isPresent();

        // Öğrenci Yoksa
        if (!found) {
            throw new StudentNotFoundException(name + " isimli Öğrenci bulunamadı");
        }
        */

        // 3.YOL
        Optional<StudentDto> student = studentDtoList.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
        return student.orElseThrow(() -> new StudentNotFoundException(name + " isimli öğrenci bulunamadı."));
    }

    // FIND BY ID
    @Override
    public StudentDto findById(int id) {
        return null;
    }

    // Öğrenci Güncelle
    @Override
    public StudentDto update(int id, StudentDto studentDto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(studentDto.getName());
                temp.setSurname(studentDto.getSurname());
                temp.setBirthDate(studentDto.getBirthDate());
                temp.setMidTerm(studentDto.getMidTerm());
                temp.setFinalTerm(studentDto.getFinalTerm());
                temp.seteStudentType(studentDto.geteStudentType());
                // Güncellenmiş Öğrenci Bilgileri
                System.out.println(SpecialColor.BLUE + temp + " Öğrenci Bilgileri Güncellendi" + SpecialColor.RESET);
                // Dosyaya kaydet
                saveToFile();
                return temp;
            }
        }
        throw new StudentNotFoundException("Öğrenci bulunamadı.");
    }

    // Öğrenci Sil
    @Override
    public StudentDto delete(int id) {
        //studentDtoList.removeIf(temp -> temp.getId() == id);
        boolean removed = studentDtoList.removeIf(temp -> temp.getId() == id);
        if (removed) {
            System.out.println(SpecialColor.BLUE + "Öğrenci Silindi" + SpecialColor.RESET);
            // Silinen Öğrenciyi dosyaya kaydet
            saveToFile();
            return null;
        } else {
            System.out.println(SpecialColor.RED + "Öğrenci Silinmedi" + SpecialColor.RESET);
            throw new StudentNotFoundException("Öğrenci silinemedi, ID bulunamadı.");
        }
    }

    ////////////////////////////////////////////////////////////////
    // Toplam Öğrenci Sayısı
    // Rastgele Öğrenci
    // Öğrenci Not Ortalaması Hesapla
    // En Yüksek veya En Düşük Not Alan Öğrenci
    // Öğrenci Sıralaması (Doğum günü)

    /// //////////////////////////////////////////////////////////////////////
    // Enum Öğrenci Türü Method
    public EStudentType studentTypeMethod() {
        System.out.println("Öğrenci türünü seçiniz.\n1-)Lisans\n2-)Yüksek Lisans\n3-)Doktora");
        int typeChooise = scanner.nextInt();
        EStudentType swichCaseStudent = switch (typeChooise) {
            case 1 -> EStudentType.UNDERGRADUATE;
            case 2 -> EStudentType.GRADUATE;
            case 3 -> EStudentType.PHD;
            default -> EStudentType.OTHER;
        };
        return swichCaseStudent;
    }

    /// ///////////////////////////////////////////////////////////////////////

    // Console Seçim (Öğrenci)
    @Override
    public void chooise() {
        while (true) {
            System.out.println("\n===== ÖĞRENCİ YÖNETİM SİSTEMİ =====");
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrenci Listele");
            System.out.println("3. Öğrenci Ara");
            System.out.println("4. Öğrenci Güncelle");
            System.out.println("5. Öğrenci Sil");
            System.out.println("6. Toplam Öğrenci Sayısı");
            System.out.println("7. Rastgele Öğrenci Seç");
            System.out.println("8. Öğrenci Not Ortalaması Hesapla");
            System.out.println("9. En Yüksek & En Düşük Not Alan Öğrenci");
            System.out.println("10. Öğrencileri Doğum Tarihine Göre Sırala");
            System.out.println("11. Çıkış");
            System.out.print("Seçiminizi yapınız: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Boşluğu temizleme

            switch (choice) {
                case 1 -> { // Öğrenci Ekleme
                    chooiseStudentAdd();
                }
                case 2 -> { // Öğrenci Listeleme
                    chooiseStudentList();
                }
                case 3 -> { // Öğrenci Arama
                    chooiseStudenSearch();
                }
                case 4 -> { // Öğrenci Güncelleme
                    chooiseStudenUpdate();
                }
                case 5 -> { // Öğrenci Silme
                    chooiseStudenDelete();
                }
                case 6 -> { // Toplam Öğrenci Sayısı
                    chooiseSumCounter();
                }
                case 7 -> { // Rastgele Öğrenci Seçme
                    chooiseRandomStudent();
                }
                case 8 -> { // Öğrenci Not Ortalaması Hesapla
                    chooiseStudentNoteAverage();
                }
                case 9 -> { // En Yüksek & En Düşük Not Alan Öğrenci
                    chooiseStudentNoteMinAndMax();
                }
                case 10 -> { // Öğrencileri Doğum Tarihine Göre Sırala
                    chooiseStudentBirthdaySortedDate();
                }
                case 11 -> { // Çıkış
                    chooiseExit();
                }
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    } //end chooise


    /// Student Add
    public void chooiseStudentAdd() {
        System.out.print("Öğrenci Adı: ");
        String name = scanner.nextLine();

        System.out.print("Öğrenci Soyadı: ");
        String surname = scanner.nextLine();

        System.out.print("Doğum Tarihi (YYYY-MM-DD): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Vize Notu: ");
        double midTerm = scanner.nextDouble();

        System.out.print("Final Notu: ");
        double finalTerm = scanner.nextDouble();

        EStudentType studentType = studentTypeMethod();
        StudentDto newStudent = new StudentDto(++studentCounter, name, surname, midTerm, finalTerm, birthDate, studentType);
        create(newStudent);
        System.out.println("Öğrenci başarıyla eklendi.");
    }

    /// Student List
    public void chooiseStudentList() {
        try {
            //list().forEach(System.out::println);
            list();
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /// Student Search
    public void chooiseStudenSearch() {
        list();
        System.out.print("Aranacak Öğrenci Adı: ");
        String searchName = scanner.nextLine();
        try {
            System.out.println(findByName(searchName));
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /// Student Update
    public void chooiseStudenUpdate() {
        list();
        System.out.print("Güncellenecek Öğrenci ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Boşluğu temizleme

        System.out.print("Yeni Adı: ");
        String nameUpdate = scanner.nextLine();

        System.out.print("Yeni Soyadı: ");
        String surnameUpdate = scanner.nextLine();

        System.out.print("Doğum Tarihi (YYYY-MM-DD): ");
        LocalDate birthDateUpdate = LocalDate.parse(scanner.nextLine());

        System.out.print("Yeni Vize Notu: ");
        double midTermUpdate = scanner.nextDouble();

        System.out.print("Yeni Final Notu: ");
        double finalTermUpdate = scanner.nextDouble();

        StudentDto studentUpdate = new StudentDto(id, nameUpdate, surnameUpdate, midTermUpdate, finalTermUpdate, birthDateUpdate, studentTypeMethod());
        try {
            update(id, studentUpdate);
            System.out.println("Öğrenci başarıyla güncellendi.");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /// Student Delete
    public void chooiseStudenDelete() {
        list();
        System.out.print("Silinecek Öğrenci ID: ");
        int deleteID = scanner.nextInt();
        try {
            delete(deleteID);
            System.out.println("Öğrenci başarıyla silindi.");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /// Student Sum Counter
    public void chooiseSumCounter() {
        System.out.println("Toplam Öğrenci Sayısı: " + studentDtoList.size());
    }

    /// Student Random
    public void chooiseRandomStudent() {
        if (!studentDtoList.isEmpty()) {
            StudentDto randomStudent = studentDtoList.get((int) (Math.random() * studentDtoList.size()));
            System.out.println("Rastgele Seçilen Öğrenci: " + randomStudent);
        } else {
            System.out.println("Sistemde öğrenci yok.");
        }
    }

    /// Öğrenci Not Ortalaması Hesapla
    public void chooiseStudentNoteAverage() {
        if (!studentDtoList.isEmpty()) {
            double avg = studentDtoList.stream()
                    .mapToDouble(StudentDto::getResultTerm)
                    .average()
                    .orElse(0.0);
            System.out.println("Öğrenci Not Ortalaması: " + avg);
        } else {
            System.out.println("Öğrenci listesi boş.");
        }
    }

    /// En Yüksek & En Düşük Not Alan Öğrenci
    public void chooiseStudentNoteMinAndMax() {
        if (!studentDtoList.isEmpty()) {
            StudentDto maxStudent = studentDtoList.stream()
                    .max((s1, s2) -> Double.compare(s1.getResultTerm(), s2.getResultTerm()))
                    .orElse(null);

            StudentDto minStudent = studentDtoList.stream()
                    .min((s1, s2) -> Double.compare(s1.getResultTerm(), s2.getResultTerm()))
                    .orElse(null);

            System.out.println("En Yüksek Not Alan Öğrenci: " + maxStudent);
            System.out.println("En Düşük Not Alan Öğrenci: " + minStudent);
        } else {
            System.out.println("Öğrenci listesi boş.");
        }
    }

    /// Öğrencileri Doğum Tarihine Göre Sırala
    public void chooiseStudentBirthdaySortedDate() {
        studentDtoList.stream()
                .sorted((s1, s2) -> s1.getBirthDate().compareTo(s2.getBirthDate()))
                .forEach(System.out::println);
    }

    public void chooiseExit() {
        System.out.println("Sistemden çıkılıyor...");
        scanner.close();
        return;
    }

} // end class
