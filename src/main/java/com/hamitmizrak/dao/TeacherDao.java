package com.hamitmizrak.dao;

import com.hamitmizrak.dto.EStudentType;
import com.hamitmizrak.dto.ETeacherSubject;
import com.hamitmizrak.dto.TeacherDto;
import com.hamitmizrak.exceptions.TeacherNotFoundException;
import com.hamitmizrak.utils.SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

// TeacherDto
public class TeacherDao implements IDaoGenerics<TeacherDto> {

    // Field
    private final Scanner scanner = new Scanner(System.in);
    private final List<TeacherDto> teacherList;
    private static final Random random = new Random();
    private static final String FILE_NAME = "teachers.txt";

    // Inner Class
    private final FileHandler fileHandler= new FileHandler();

    // Parametresiz Constructor
    public TeacherDao() {
        // Default
        teacherList = new ArrayList<>();
        fileHandler.createFileIfNotExists();
        fileHandler.loadTeachersFromFile();
    }

    /// /////////////////////////////////////////////////////////////
    // INNER CLASS
    private class FileHandler{
        // FileIO => Eğer teachers.txt oluşturulmamışsa oluştur
        private void createFileIfNotExists() {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.err.println("Dosya oluşturulurken hata oluştu: " + e.getMessage());
                }
            }
        }

        // 📌 Öğretmenleri dosyaya kaydetme (BufferedWriter)
        private void saveToFile() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
                for (TeacherDto teacher : teacherList) {
                    writer.write(teacherToCsv(teacher) + "\n");
                }
            } catch (IOException e) {
                System.err.println("Dosyaya yazma hatası: " + e.getMessage());
            }
        }

        // 📌 Öğretmenleri dosyadan yükleme (BufferedReader)
        private void loadTeachersFromFile() {
            teacherList.clear();
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    TeacherDto teacher = csvToTeacher(line);
                    if (teacher != null) {
                        teacherList.add(teacher);
                    }
                }
            } catch (IOException e) {
                System.err.println("Dosya okuma hatası: " + e.getMessage());
            }
        }
    }

    /// /////////////////////////////////////////////////////////////
    // 📌 Öğretmen nesnesini CSV formatına çevirme
    // Bu metod, bir StudentDto nesnesini virgülle ayrılmış bir metin (CSV) formatına çevirir.
    // Böylece Öğretmen verileri bir dosyada satır bazlı olarak saklanabilir.
    private String teacherToCsv(TeacherDto teacher) {
        return teacher.id() + "," + teacher.name() + "," + teacher.surname() + "," +
                teacher.birthDate() + "," + teacher.subject() + "," +
                teacher.yearsOfExperience() + "," + teacher.isTenured() + "," + teacher.salary();
    }

    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme
    // Bu metod, CSV formatındaki bir satırı parçalayarak bir StudentDto nesnesine dönüştürür.
    // Dosyadan okunan her satır için çağrılır ve veriyi uygun şekilde nesneye aktarır.
    // 📌 CSV formatındaki satırı StudentDto nesnesine çevirme (Dosyadan okurken)
    private TeacherDto csvToTeacher(String csvLine) {
        try {
            String[] parts = csvLine.split(",");
            if (parts.length != 8) {
                System.err.println("Hatalı CSV formatı: " + csvLine);
                return null;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = null;
            try {
                if (!parts[3].isBlank()) {
                    birthDate = LocalDate.parse(parts[3], formatter);
                }
            } catch (DateTimeParseException e) {
                System.err.println("Geçersiz tarih formatı: " + parts[3] + " (Beklenen format: yyyy-MM-dd)");
                return null;
            }
            return new TeacherDto(
                    Integer.parseInt(parts[0]),
                    parts[1],
                    parts[2],
                    birthDate,
                    //parts[4], //String
                    ETeacherSubject.valueOf(parts[4]) ,
                    Integer.parseInt(parts[5]),
                    Boolean.parseBoolean(parts[6]),
                    Double.parseDouble(parts[7])
            );

        } catch (Exception e) {
            System.err.println("CSV ayrıştırma hatası: " + e.getMessage());
            return null;
        }
    }

    /// /////////////////////////////////////////////////////////////
    // C-R-U-D
    // Öğretmen Ekle
    // 📌 Öğretmen Ekleme (Create)
    @Override
    public Optional<TeacherDto> create(TeacherDto teacher) {
        teacherList.add(teacher);
        fileHandler.saveToFile();
        return Optional.of(teacher);
    }


    // Öğretmen Listesi
    @Override
    public List<TeacherDto> list() {
        return new ArrayList<>(teacherList); // Liste dışarıdan değiştirilemesin diye kopya veriyoruz.
    }

    // FindByName
    @Override
    public Optional<TeacherDto> findByName(String name) {
        return teacherList.stream()
                .filter(t -> t.name().equalsIgnoreCase(name))
                .findFirst()
                .or(() -> Optional.empty());
    }

    // FindById
    @Override
    public Optional<TeacherDto> findById(int id) {
        return teacherList.stream()
                .filter(t -> t.id() == id)
                .findFirst()
                .or(() -> Optional.empty());
    }

    // Öğretmen Güncelle
    @Override
    public Optional<TeacherDto> update(int id, TeacherDto updatedTeacher) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).id() == id) {
                teacherList.set(i, updatedTeacher);
                fileHandler.saveToFile();
                return Optional.of(updatedTeacher);
            }
        }
        //return Optional.empty();
        throw new TeacherNotFoundException("Güncellenecek öğretmen bulunamadı.");
    }

    // Öğretmen Sil
    @Override
    public Optional<TeacherDto> delete(int id) {
        Optional<TeacherDto> teacher = findById(id);
        teacher.ifPresentOrElse(
                teacherList::remove,
                () -> { throw new TeacherNotFoundException(id + " ID'li öğretmen bulunamadı."); }
        );
        fileHandler.saveToFile();
        return teacher;
    }



    /// //////////////////////////////////////////////////////////////////////
    // Enum Öğretmen Türü Method
    public ETeacherSubject teacherTypeMethod() {
        System.out.println("\n"+ SpecialColor.GREEN+"Öğretmen türünü seçiniz.\n1-)Tarih\n2-)Bioloji\n3-)Kimya\n4-)Bilgisayar Bilimleri\n5-)Diğer"+SpecialColor.RESET);
        int typeChooise = scanner.nextInt();
        ETeacherSubject swichcaseTeacher = switch (typeChooise) {
            case 1 -> ETeacherSubject.HISTORY;
            case 2 -> ETeacherSubject.BIOLOGY;
            case 3 -> ETeacherSubject.CHEMISTRY;
            case 4 -> ETeacherSubject.COMPUTER_SCIENCE;
            case 5 -> ETeacherSubject.MATHEMATICS;
            default -> ETeacherSubject.OTHER;
        };
        return swichcaseTeacher;
    }

    /// ///////////////////////////////////////////////////////////////////////
    // Console Seçim (Öğretmen)
    @Override
    public void chooise() {
        while (true) {
            try {
                System.out.println("\n===== ÖĞRETMEN YÖNETİM SİSTEMİ =====");
                System.out.println("1. Öğretmen Ekle");
                System.out.println("2. Öğretmen Listele");
                System.out.println("3. Öğretmen Ara");
                System.out.println("4. Öğretmen Güncelle");
                System.out.println("5. Öğretmen Sil");
                System.out.println("6. Rastgele Öğretmen Seç");
                System.out.println("7. Öğretmenleri Yaşa Göre Sırala");
                System.out.println("8. Çıkış");
                System.out.print("\nSeçiminizi yapınız: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Boşluğu temizleme

                switch (choice) {
                    case 1 -> addTeacher();
                    case 2 -> listTeachers();
                    case 3 -> searchTeacher();
                    case 4 -> updateTeacher();
                    case 5 -> deleteTeacher();
                    case 6 -> chooseRandomTeacher();
                    case 7 -> sortTeachersByAge();
                    case 8 -> {
                        System.out.println("Çıkış yapılıyor...");
                        return;
                    }
                    default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                }
            } catch (Exception e) {
                System.out.println("⛔ Beklenmeyen bir hata oluştu: " + e.getMessage());
                scanner.nextLine(); // Scanner'ı temizle
            }
        }
    }

    private void addTeacher() {
        System.out.print("Öğretmen ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Adı: ");
        String name = scanner.nextLine();

        System.out.print("Soyadı: ");
        String surname = scanner.nextLine();

        System.out.print("Doğum Tarihi (yyyy-MM-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Uzmanlık Alanı: ");
        // 📌 Öğrenci türünü seçme
        ETeacherSubject subject = teacherTypeMethod();

        System.out.print("Deneyim Yılı: ");
        int yearsOfExperience = scanner.nextInt();

        System.out.print("Kadrolu mu? (true/false): ");
        boolean isTenured = scanner.nextBoolean();

        System.out.print("Maaş: ");
        double salary = scanner.nextDouble();

        TeacherDto teacher = new TeacherDto(id, name, surname, birthDate, subject, yearsOfExperience, isTenured, salary);
        teacherList.add(teacher);
        fileHandler.saveToFile();
        System.out.println("Öğretmen başarıyla eklendi.");
    }

    private void listTeachers() {
        if (teacherList.isEmpty()) {
            System.out.println("Kayıtlı öğretmen bulunmamaktadır.");
            return;
        }
        System.out.println("\n=== Öğretmen Listesi ===");
        teacherList.forEach(t -> System.out.println( t.fullName() + " - " + t.subject()));
    }

    private void searchTeacher() {
        System.out.print("Aranacak öğretmenin adı: ");
        String name = scanner.nextLine();

        findByName(name).ifPresentOrElse(
                teacher -> System.out.println("Bulunan Öğretmen: " + teacher.fullName() + " - " + teacher.subject()),
                () -> System.out.println("Öğretmen bulunamadı.")
        );
    }


    private void updateTeacher() {
        System.out.print("Güncellenecek öğretmenin ID'si: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            TeacherDto existingTeacher = findById(id).orElseThrow(() -> new TeacherNotFoundException(id + " ID'li öğretmen bulunamadı."));

            System.out.print("Yeni Adı (Mevcut: " + existingTeacher.name() + "): ");
            String name = scanner.nextLine();
            System.out.print("Yeni Soyadı (Mevcut: " + existingTeacher.surname() + "): ");
            String surname = scanner.nextLine();
            System.out.print("Yeni Maaş (Mevcut: " + existingTeacher.salary() + "): ");
            double salary = scanner.nextDouble();

            TeacherDto updatedTeacher = new TeacherDto(
                    existingTeacher.id(),
                    name.isBlank() ? existingTeacher.name() : name,
                    surname.isBlank() ? existingTeacher.surname() : surname,
                    existingTeacher.birthDate(),
                    existingTeacher.subject(),
                    existingTeacher.yearsOfExperience(),
                    existingTeacher.isTenured(),
                    salary > 0 ? salary : existingTeacher.salary()
            );

            update(id, updatedTeacher);
            System.out.println("Öğretmen başarıyla güncellendi.");
        } catch (TeacherNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteTeacher() {
        System.out.print("Silinecek öğretmenin ID'si: ");
        int id = scanner.nextInt();
        try {
            delete(id);
            System.out.println("Öğretmen başarıyla silindi.");
        } catch (TeacherNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void chooseRandomTeacher() {
        if (teacherList.isEmpty()) {
            System.out.println("Kayıtlı öğretmen yok.");
            return;
        }
        TeacherDto teacher = teacherList.get(random.nextInt(teacherList.size()));
        System.out.println("Seçilen Rastgele Öğretmen: " + teacher.fullName());
    }

    private void sortTeachersByAge() {
        teacherList.sort(Comparator.comparing(TeacherDto::birthDate));
        System.out.println("Öğretmenler yaşa göre sıralandı.");
        listTeachers();
    }

}
