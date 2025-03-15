package com.hamitmizrak.dao;

import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.exceptions.StudentNotFoundException;
import com.hamitmizrak.iofiles.FileHandler;
import com.hamitmizrak.dto.ERole;
import com.hamitmizrak.dto.EStudentType;
import com.hamitmizrak.utils.SpecialColor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

// Öğrenci Yönetim Sistemi
public class StudentDao implements IDaoGenerics<StudentDto> {

    // Field
    // Student List
    private final List<StudentDto> studentDtoList ;
    // File dosyasına eklenen en büyük ID alıp yeni eklenecek file için 1 artır
    int maxId=0;

    // Eklenen dosya adı
    //private static final String FILE_NAME = "students.txt";

    // **📌 Scanner Nesnesini En Üste Tanımladık**
    private final Scanner scanner = new Scanner(System.in);

    // FileHandler
    private FileHandler fileHandler;
    private String filePath;

    ///////////////////////////////////////////////////////////////////////
    // static
    static {
        System.out.println(SpecialColor.RED+" Static: StudentDao"+ SpecialColor.RESET);
    }

    // Parametresiz Constructor
    public StudentDao() {
        // FileHandler
        this.fileHandler= new FileHandler();
        this.fileHandler.setFilePath("students.txt");

        // null pointer almamak için
        studentDtoList = new ArrayList<>();

        // Eğer students.txt yoksa otomatik oluştur
        this.fileHandler.createFileIfNotExists();

        // Program başlarken Öğrenci Listesini hemen yüklesin
        this.fileHandler.readFile(this.fileHandler.getFilePath());
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
                        student.getStatus() + "," +      // Öğrenci geçti/kaldı notunu ekler
                        student.getBirthDate() ;   // Öğrenci doğum tarihini ekler
                        //student.geteStudentType();       // Öğrencinin eğitim türünü (Lisans, Yüksek Lisans vb.) ekler
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
                    EStudentType.valueOf(parts[8]),
                    ERole.valueOf(parts[9]) // Öğrencinin eğitim türünü (Enum) çevirir
            );
//  0           1               2             3                    4                  5                  8                        9
// Integer id, String name, String surname, LocalDate birthDate, Double midTerm, Double finalTerm, EStudentType eStudentType, ERole eRole
            // **Geçti/Kaldı durumu CSV'den okunduğu gibi öğrenci nesnesine eklenir**
            //student.setResultTerm(Double.parseDouble(parts[6])); // **Sonuç notunu ayarla**
            //student.setStatus(parts[7]); // **Geçti/Kaldı durumunu CSV'den al**

            return student;
        } catch (Exception e) {
            System.out.println(SpecialColor.RED + "CSV'den öğrenci yükleme hatası!" + SpecialColor.RESET);
            return null; // Hata durumunda null döndürerek programın çökmesini engeller
        }
    }

    ///////////////////////////////////////////////////////////////

    // C-R-U-D
    // Öğrenci Ekle
    // 📌 Öğrenci Ekleme (Create)
    @Override // Bun metotu ezmelisin.
    @Deprecated // Eski bir metot yenisini kullanın
    public Optional<StudentDto> create(StudentDto studentDto) {
        try {
            // 📌 Verilerin doğrulanmasını sağlıyoruz
            validateStudent(studentDto);

            // Öğrenci Listesindeki En büyük ID Al
             maxId = studentDtoList
                    .stream()
                    .mapToInt(StudentDto::getId)
                    .max()
                    .orElse(0); // ;eğer öğrenci yoksa Sıfırdan başlat

            // Yeni Öğrenciyi ID'si En büyük olan ID'nin 1 fazlası
            studentDto.setId(maxId+1);

            // ID'yi artırıp nesneye atıyoruz
            // 📌 **ID artık public static olduğu için her sınıftan erişilebilir!**
            studentDtoList.add(studentDto);
            this.fileHandler.writeFile(studentToCsv(studentDto));

            System.out.println(studentDto+ SpecialColor.GREEN + "✅ Öğrenci başarıyla eklendi!" + SpecialColor.RESET);
            return Optional.of(studentDto);

        } catch (IllegalArgumentException e) {
            System.out.println(SpecialColor.RED + "⛔ Hata: " + e.getMessage() + SpecialColor.RESET);
            return null; // Hata durumunda nesne oluşturulmaz
        }
    }

    // 📌 Öğrenci Validasyonu (Geçerli Veri Kontrolü)
    private void validateStudent(StudentDto studentDto) {
        /*if (studentDto.getId() != null && studentDto.getId() < 1) {
            throw new IllegalArgumentException("ID 1 veya daha büyük olmalıdır.");
        }*/

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

      /*  if (studentDto.geteStudentType() == null) {
            throw new IllegalArgumentException("Öğrenci türü boş olamaz.");
        }*/
    }

    ///////// LIST //////////
    // Öğrenci Listesi
    @Override
    @SuppressWarnings("unchecked") // Derleyici uyarılarını bastırmak için kullanılır.
    //@Cacheable
    public List<StudentDto> list() {
        // Öğrenci Yoksa
        if (studentDtoList.isEmpty()) {
            throw new StudentNotFoundException("\uD83D\uDCCC Öğrenci Yoktur");
        } else {
            System.out.println(SpecialColor.BLUE + "Öğrenci Listesi" + SpecialColor.RESET);
            // Listeyi Göster (1.YOL)
            studentDtoList.forEach(System.out::println);
            // Listeyi Göster (2.YOL)
            /*
            for (StudentDto student : studentDtoList) {
                Double result = student.getResultTerm()!=null ? student.getResultTerm() :0.0;
                        System.out.println("ID: " + student.getId() +
                        " | Ad: " + student.getName() +
                        " | Sonuç: " + student.getResultTerm() +
                        " | Durum: " + student.getStatus());
            }
            */
        }
        return studentDtoList;
    }

    ///////// SEARCH //////////
    // Öğrenci Ara
    @Override
    public Optional<StudentDto> findByName(String name) {
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
        /*Optional<StudentDto> student = studentDtoList.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
        return student.orElseThrow(() -> new StudentNotFoundException(name + " isimli öğrenci bulunamadı."));*/

        // 4.YOL
        return studentDtoList
                .stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    // FIND BY ID
    @Override
    public Optional<StudentDto> findById(int id) {
        return studentDtoList
                .stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();
    }

    ///////// UPDATE //////////
    // Öğrenci Güncelle
    @Override
    public Optional<StudentDto> update(int id, StudentDto studentDto) {
        try{
        for (StudentDto temp : studentDtoList) {
            //if (temp.getId() == id) {
            if (temp.getId() .equals(id)) {
                temp.setName(studentDto.getName());
                temp.setSurname(studentDto.getSurname());
                temp.setBirthDate(studentDto.getBirthDate());
                temp.setMidTerm(studentDto.getMidTerm());
                temp.setFinalTerm(studentDto.getFinalTerm());
                //temp.setResultTerm(temp.getMidTerm() * 0.4 + temp.getFinalTerm() * 0.6);
                //temp.seteStudentType(studentDto.geteStudentType());
                // Güncellenmiş Öğrenci Bilgileri
                System.out.println(SpecialColor.BLUE + temp + " Öğrenci Bilgileri Güncellendi" + SpecialColor.RESET);
                // Dosyaya kaydet
                this.fileHandler.writeFile(studentToCsv(studentDto));
                return Optional.of(temp); // Bir veri olabilir 😊
            }
        }} catch (Exception e){
            e.printStackTrace();
            throw new StudentNotFoundException("Öğrenci bulunamadı.");
        }
        return Optional.empty(); // Boş eleman olabilir 😒
    }

    ///////// DELETE //////////
    // Öğrenci Sil
    @Override
    public Optional<StudentDto> delete(int id) {
        // 1.YOL (Eğer Optional veri kullanılmazsa)
        //studentDtoList.removeIf(temp -> temp.getId() == id);
        /*
        boolean removed = studentDtoList.removeIf(temp -> temp.getId() == id);
        if (removed) {
            System.out.println(SpecialColor.BLUE + "Öğrenci Silindi" + SpecialColor.RESET);
            // Silinen Öğrenciyi dosyaya kaydet
            this.fileHandler.writeFile(this.fileHandler.getFilePath());
            return Optional.empty();
        } else {
            System.out.println(SpecialColor.RED + "Öğrenci Silinmedi" + SpecialColor.RESET);
            throw new StudentNotFoundException("Öğrenci silinemedi, ID bulunamadı.");
        }
        */

        // 2.YOL
        Optional<StudentDto> studentToDelete= findById(id);
        if(studentToDelete.isPresent()) {
            studentDtoList.remove(studentToDelete.get());
            System.out.println(SpecialColor.BLUE + "Öğrenci Silindi" + SpecialColor.RESET);
            // Silinen Öğrenciyi dosyaya kaydet
            this.fileHandler.writeFile(this.fileHandler.getFilePath());
            return studentToDelete;
        }else{
            System.out.println(SpecialColor.RED + "Öğrenci Silinmedi" + SpecialColor.RESET);
            throw new StudentNotFoundException("Öğrenci silinemedi, ID bulunamadı.");
        }
    }

    ///////////////////////////////////////////////////////////////////////
    ///////// STUDENT TYPE //////////
    // Enum Öğrenci Türü Method
    public EStudentType studentTypeMethod() {
        System.out.println("\n"+SpecialColor.GREEN+"Öğrenci türünü seçiniz.\n1-)Lisans\n2-)Yüksek Lisans\n3-)Doktora"+SpecialColor.RESET);
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
                System.out.println("\n"+SpecialColor.BLUE+"===== ÖĞRENCİ YÖNETİM SİSTEMİ ====="+SpecialColor.RESET);
                System.out.println(SpecialColor.YELLOW+"1. Öğrenci Ekle");
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
                System.out.println("12. Çıkış"+SpecialColor.RESET);
                System.out.print("\n"+SpecialColor.PURPLE+"Seçiminizi yapınız: "+SpecialColor.RESET);

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
                // Integer id, String name, String surname, LocalDate birthDate,Double midTerm, Double finalTerm,EStudentType eStudentType
                StudentDto newStudent = new StudentDto(maxId, name, surname,birthDate, midTerm, finalTerm, studentType,ERole.STUDENT);
                Optional<StudentDto> createdStudent = create(newStudent);

                if (createdStudent != null) {
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

        //  // Integer id, String name, String surname, LocalDate birthDate,Double midTerm, Double finalTerm,EStudentType eStudentType
        StudentDto studentUpdate = new StudentDto(id, nameUpdate, surnameUpdate,birthDateUpdate, midTermUpdate, finalTermUpdate, studentTypeMethod(), ERole.STUDENT);
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

    // TEST
    public static void main(String[] args) {
        StudentDao studentDao= new StudentDao();
        studentDao.chooise();
    }

} // end class
