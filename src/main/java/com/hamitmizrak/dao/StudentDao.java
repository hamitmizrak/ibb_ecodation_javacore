package com.hamitmizrak.dao;

import com.hamitmizrak.dto.EStudentType;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.exceptions.StudentNotFoundException;
import com.hamitmizrak.utils.SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
        return
                student.getId() + "," +          // Öğrenci ID'sini ekler
                        student.getName() + "," +        // Öğrenci adını ekler
                        student.getSurname() + "," +     // Öğrenci soyadını ekler
                        student.getMidTerm() + "," +     // Öğrenci vize notunu ekler
                        student.getFinalTerm() + "," +   // Öğrenci final notunu ekler
                        student.getResultTerm() + "," +  // Öğrenci sonuç notunu ekler
                        //student.getStatus() + "," +      // Öğrenci geçti/kaldı notunu ekler
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
    // 📌 Öğrenci Ekleme (Create)
    @Override
    public StudentDto create(StudentDto studentDto) {
        try {
            // 📌 Verilerin doğrulanmasını sağlıyoruz
            validateStudent(studentDto);

            // ID'yi artırıp nesneye atıyoruz
            studentDto.setId(++studentCounter);
            studentDtoList.add(studentDto);
            saveToFile();

            System.out.println(SpecialColor.GREEN + "✅ Öğrenci başarıyla eklendi!" + SpecialColor.RESET);
            return studentDto;

        } catch (IllegalArgumentException e) {
            System.out.println(SpecialColor.RED + "⛔ Hata: " + e.getMessage() + SpecialColor.RESET);
            return null; // Hata durumunda nesne oluşturulmaz
        }
    }

    // 📌 Öğrenci Validasyonu (Geçerli Veri Kontrolü)
    private void validateStudent(StudentDto studentDto) {
        if (studentDto.getId() != null && studentDto.getId() < 1) {
            throw new IllegalArgumentException("ID 1 veya daha büyük olmalıdır.");
        }

        if (studentDto.getName() == null || !studentDto.getName().matches("^[a-zA-ZığüşöçİĞÜŞÖÇ]+$")) {
            throw new IllegalArgumentException("Ad yalnızca harf içermeli ve boş olamaz.");
        }

        if (studentDto.getSurname() == null || !studentDto.getSurname().matches("^[a-zA-ZığüşöçİĞÜŞÖÇ]+$")) {
            throw new IllegalArgumentException("Soyad yalnızca harf içermeli ve boş olamaz.");
        }

        if (studentDto.getMidTerm() == null || studentDto.getMidTerm() < 0 || studentDto.getMidTerm() > 100) {
            throw new IllegalArgumentException("Vize notu 0 ile 100 arasında olmalıdır.");
        }

        if (studentDto.getFinalTerm() == null || studentDto.getFinalTerm() < 0 || studentDto.getFinalTerm() > 100) {
            throw new IllegalArgumentException("Final notu 0 ile 100 arasında olmalıdır.");
        }

        // Doğrum tarihi gelecekte bir zamanda olmaz.
        if (studentDto.getBirthDate() == null || studentDto.getBirthDate().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Doğum tarihi bugünden büyük olamaz.");
        }

        if (studentDto.geteStudentType() == null) {
            throw new IllegalArgumentException("Öğrenci türü boş olamaz.");
        }
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


            for (StudentDto temp : studentDtoList) {
                if (temp.getResultTerm() != null) {
                    System.out.println(temp + " -Durum " + (temp.getResultTerm() >= 50 ? "Geçti" : "Kaldı"));
                }
            }
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
                temp.setResultTerm(temp.getMidTerm() * 0.4 + temp.getFinalTerm() * 0.6);
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
            try {
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
                System.out.println("11. Öğrenci Geçti/Kaldı Durumunu göster");
                System.out.println("12. Çıkış");
                System.out.print("Seçiminizi yapınız: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Boşluğu temizleme

                switch (choice) {
                    case 1 -> chooiseStudentAdd();

                    case 2 -> chooiseStudentList();

                    case 3 -> chooiseStudenSearch();

                    case 4 -> chooiseStudenUpdate();

                    case 5 -> chooiseStudenDelete();

                    case 6 -> chooiseSumCounter();

                    case 7 -> chooiseRandomStudent();

                    case 8 -> chooiseStudentNoteAverage();

                    case 9 -> chooiseStudentNoteMinAndMax();

                    case 10 -> chooiseStudentBirthdaySortedDate();

                    case 11 -> listStudentsWithStatus();

                    case 12 -> chooiseExit();

                    default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                }
            } catch (Exception e) {
                System.out.println(SpecialColor.RED + "⛔ Beklenmeyen bir hata oluştu: " + e.getMessage() + SpecialColor.RESET);
                scanner.nextLine(); // Hata oluştuğunda kullanıcıdan yeni giriş alabilmesi için scanner'ı temizle
            }
        }
    }


    /// ///////////////////////////////////////////////////////////////////////
    /// Student Add
    public void chooiseStudentAdd() {
        while (true) { // Kullanıcı geçerli giriş yapana kadar döngü devam eder
            try {
                // 📌 Kullanıcıdan geçerli bir ad alana kadar döngüde kal
                String name;
                while (true) {
                    System.out.print("Öğrenci Adı: ");
                    name = scanner.nextLine().trim();
                    if (name.matches("^[a-zA-ZığüşöçİĞÜŞÖÇ]+$")) break;
                    System.out.println(SpecialColor.RED + "⛔ Geçersiz ad! Sadece harf giriniz." + SpecialColor.RESET);
                }

                // 📌 Kullanıcıdan geçerli bir soyad alana kadar döngüde kal
                String surname;
                while (true) {
                    System.out.print("Öğrenci Soyadı: ");
                    surname = scanner.nextLine().trim();
                    if (surname.matches("^[a-zA-ZığüşöçİĞÜŞÖÇ]+$")) break;
                    System.out.println(SpecialColor.RED + "⛔ Geçersiz soyad! Sadece harf giriniz." + SpecialColor.RESET);
                }

                // 📌 Kullanıcıdan geçerli bir doğum tarihi alana kadar döngüde kal
                LocalDate birthDate;
                while (true) {
                    System.out.print("Doğum Tarihi (YYYY-MM-DD): ");
                    String input = scanner.nextLine().trim();
                    try {
                        birthDate = LocalDate.parse(input);
                        if (!birthDate.isAfter(LocalDate.now())) break;
                        System.out.println(SpecialColor.RED + "⛔ Geçersiz doğum tarihi! Gelecekte olamaz." + SpecialColor.RESET);
                    } catch (Exception e) {
                        System.out.println(SpecialColor.RED + "⛔ Geçersiz format! Lütfen YYYY-MM-DD olarak giriniz." + SpecialColor.RESET);
                    }
                }

                // 📌 Kullanıcıdan geçerli bir vize notu alana kadar döngüde kal
                double midTerm;
                while (true) {
                    System.out.print("Vize Notu (0-100): ");
                    String input = scanner.nextLine().trim();
                    try {
                        midTerm = Double.parseDouble(input);
                        if (midTerm >= 0 && midTerm <= 100) break;
                        System.out.println(SpecialColor.RED + "⛔ Geçersiz vize notu! 0-100 arasında giriniz." + SpecialColor.RESET);
                    } catch (NumberFormatException e) {
                        System.out.println(SpecialColor.RED + "⛔ Geçersiz giriş! Lütfen bir sayı giriniz." + SpecialColor.RESET);
                    }
                }

                // 📌 Kullanıcıdan geçerli bir final notu alana kadar döngüde kal
                double finalTerm;
                while (true) {
                    System.out.print("Final Notu (0-100): ");
                    String input = scanner.nextLine().trim();
                    try {
                        finalTerm = Double.parseDouble(input);
                        if (finalTerm >= 0 && finalTerm <= 100) break;
                        System.out.println(SpecialColor.RED + "⛔ Geçersiz final notu! 0-100 arasında giriniz." + SpecialColor.RESET);
                    } catch (NumberFormatException e) {
                        System.out.println(SpecialColor.RED + "⛔ Geçersiz giriş! Lütfen bir sayı giriniz." + SpecialColor.RESET);
                    }
                }

                // 📌 Öğrenci türünü seçme
                EStudentType studentType = studentTypeMethod();

                // 📌 Öğrenci nesnesini oluştur
                StudentDto newStudent = new StudentDto(++studentCounter, name, surname, midTerm, finalTerm, birthDate, studentType);
                StudentDto createdStudent = create(newStudent);

                if (createdStudent != null) {
                    System.out.println(SpecialColor.GREEN + "✅ Öğrenci başarıyla eklendi!" + SpecialColor.RESET);
                    break; // 🔹 Başarıyla eklenirse döngüden çık
                } else {
                    System.out.println(SpecialColor.RED + "⛔ Öğrenci eklenirken hata oluştu. Lütfen tekrar deneyin." + SpecialColor.RESET);
                }
            } catch (Exception e) {
                System.out.println(SpecialColor.RED + "⛔ Beklenmeyen hata oluştu: " + e.getMessage() + SpecialColor.RESET);
                scanner.nextLine(); // 🔹 Hata sonrası buffer temizleme
            }
        }
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

    ////////////////////////////////////////////////////////////////
    // Toplam Öğrenci Sayısı

    /// Student Sum Counter
    public void chooiseSumCounter() {
        System.out.println("Toplam Öğrenci Sayısı: " + studentDtoList.size());
    }

    // Rastgele Öğrenci

    /// Student Random
    public void chooiseRandomStudent() {
        if (!studentDtoList.isEmpty()) {
            StudentDto randomStudent = studentDtoList.get((int) (Math.random() * studentDtoList.size()));
            System.out.println("Rastgele Seçilen Öğrenci: " + randomStudent);
        } else {
            System.out.println("Sistemde öğrenci yok.");
        }
    }

    // Öğrenci Not Ortalaması Hesapla

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

    // En Yüksek veya En Düşük Not Alan Öğrenci

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

    // Öğrenci Sıralaması (Doğum günü)

    /// Öğrencileri Doğum Tarihine Göre Sırala
    public void chooiseStudentBirthdaySortedDate() {
        studentDtoList.stream()
                .sorted((s1, s2) -> s1.getBirthDate().compareTo(s2.getBirthDate()))
                .forEach(System.out::println);
    }

    // Geçen Öğrencilere
    private List<StudentDto> listStudentsWithStatus() {
        List<StudentDto> studentDtostatus = list();
        return studentDtostatus;
    }

    // Exit
    public void chooiseExit() {
        System.out.println("Sistemden çıkılıyor...");
        scanner.close();
        return;
    }

} // end class
