package com.hamitmizrak.dao;

import com.hamitmizrak.dto.ETeacherSubject;
import com.hamitmizrak.dto.TeacherDto;
import com.hamitmizrak.exceptions.TeacherNotFoundException;
import com.hamitmizrak.iofiles.SpecialFileHandler;
import com.hamitmizrak.utils.SpecialColor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.logging.Logger;

/**
 * 📌 Öğretmen Yönetim DAO (Data Access Object)
 * Öğretmenlerin veritabanı işlemlerini yöneten sınıftır.
 */
public class TeacherDao implements IDaoGenerics<TeacherDto> {

    // Logger
    private static final Logger logger = Logger.getLogger(TeacherDao.class.getName());

    // Field
    private final Scanner scanner = new Scanner(System.in);
    private final List<TeacherDto> teacherDtoList;
    private static final Random random = new Random();
    private int maxId = 0; // En büyük ID'yi tutan değişken

    // Inner Class
    private final InnerFileHandler innerClass;

    // static
    static {
        System.out.println(SpecialColor.RED + " Static: TeacherDao" + SpecialColor.RESET);
    }

    // Parametresiz Constructor
    public TeacherDao() {
        this.teacherDtoList = new ArrayList<>();
        innerClass = new InnerFileHandler();
    }

    /// /////////////////////////////////////////////////////////////
    // INNER CLASS
    private class InnerFileHandler {
        private final SpecialFileHandler fileHandler;

        // Constructor
        private InnerFileHandler() {
            this.fileHandler = new SpecialFileHandler();
            fileHandler.setFilePath("teachers.txt");
        }

        // FileIO => Eğer teachers.txt oluşturulmamışsa oluştur
        private void createFileIfNotExists() {
            fileHandler.createFileIfNotExists();
        }

        // 📌 Öğretmenleri dosyaya kaydetme
        private void writeFile() {
            StringBuilder data = new StringBuilder();
            for (TeacherDto teacher : teacherDtoList) {
                data.append(teacherToCsv(teacher)).append("\n");
            }
            fileHandler.writeFile(data.toString());
        }

        // 📌 Öğretmenleri dosyadan yükleme
        private void readFile() {
            teacherDtoList.clear();
            fileHandler.readFile();
        }
    }

    /// /////////////////////////////////////////////////////////////
    // 📌 maxId'yi güncelleyen metod
    private void updateMaxId() {
        maxId = teacherDtoList.stream()
                .mapToInt(TeacherDto::id)
                .max()
                .orElse(0); // Eğer öğretmen yoksa ID'yi 0 olarak başlat
    }

    /// /////////////////////////////////////////////////////////////
    // 📌 Öğretmen nesnesini CSV formatına çevirme
    private String teacherToCsv(TeacherDto teacher) {
        return teacher.id() + "," + teacher.name() + "," + teacher.surname() + "," +
                teacher.birthDate() + "," + teacher.subject() + "," +
                teacher.yearsOfExperience() + "," + teacher.isTenured() + "," + teacher.salary();
    }

    // 📌 CSV formatındaki satırı TeacherDto nesnesine çevirme
    private TeacherDto csvToTeacher(String csvLine) {
        try {
            if (csvLine.trim().isEmpty()) {
                System.out.println(SpecialColor.YELLOW + "⚠️ Boş satır atlandı!" + SpecialColor.RESET);
                return null;
            }

            String[] parts = csvLine.split(",");

            if (parts.length != 8) {
                System.err.println(SpecialColor.RED + "⚠️ Hatalı CSV formatı! Beklenen 8 sütun, ama " + parts.length + " sütun bulundu." + SpecialColor.RESET);
                System.err.println("⚠️ Hatalı satır: " + csvLine);
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
                    ETeacherSubject.valueOf(parts[4]),
                    Integer.parseInt(parts[5]),
                    Boolean.parseBoolean(parts[6]),
                    Double.parseDouble(parts[7])
            );

        } catch (Exception e) {
            System.out.println(SpecialColor.RED + "⚠️ CSV'den öğretmen yükleme hatası: " + e.getMessage() + SpecialColor.RESET);
            return null;
        }
    }

    /// /////////////////////////////////////////////////////////////
    // C-R-U-D
    // Öğretmen Ekle

    /**
     * 📌 Öğretmen Ekleme (CREATE)
     */
    @Override
    public Optional<TeacherDto> create(TeacherDto teacherDto) {
        if (teacherDto == null || findByName(teacherDto.name()).isPresent()) {
            logger.warning("❌ Geçersiz veya mevcut olan öğretmen eklenemez.");
            return Optional.empty();
        }
        teacherDtoList.add(teacherDto);
        logger.info("✅ Yeni öğretmen eklendi: " + teacherDto.name());
        innerClass.writeFile();
        return Optional.of(teacherDto);
    }

    // Öğretmen Listesi

    /**
     * 📌 Tüm Öğretmenleri Listeleme (LIST)
     */
    @Override
    public List<TeacherDto> list() {
        if (teacherDtoList.isEmpty()) {
            logger.warning("⚠️ Kayıtlı öğretmen bulunamadı!");
            //throw new RegisterNotFoundException("Öğretmen listesi boş.");
            System.out.println(SpecialColor.RED + "Öğretmen listesi boş" + SpecialColor.RESET);
        }
        return new ArrayList<>(teacherDtoList);
    }

    /**
     * 📌 Öğretmen Adına Göre Bulma (FIND BY NAME)
     */
    @Override
    public Optional<TeacherDto> findByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Geçersiz isim girdiniz.");
        }
        return teacherDtoList.stream()
                .filter(t -> t.name().equalsIgnoreCase(name))
                .findFirst();
    }

    /**
     * 📌 Öğretmen ID'ye Göre Bulma (FIND BY ID)
     */
    @Override
    public Optional<TeacherDto> findById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("❌ Geçersiz ID girdiniz.");
        }
        return teacherDtoList.stream()
                .filter(t -> t.id().equals(id))
                .findFirst()
                .or(() -> {
                    logger.warning("⚠️ Öğretmen bulunamadı, ID: " + id);
                    return Optional.empty();
                });
    }

    /**
     * 📌 Öğretmen Güncelleme (UPDATE)
     */
    @Override
    public Optional<TeacherDto> update(int id, TeacherDto teacherDto) {
        if (id <= 0 || teacherDto == null) {
            throw new IllegalArgumentException("❌ Güncelleme için geçerli bir öğretmen bilgisi giriniz.");
        }
        for (int i = 0; i < teacherDtoList.size(); i++) {
            if (teacherDtoList.get(i).id().equals(id)) {
                teacherDtoList.set(i, teacherDto);
                logger.info("✅ Öğretmen güncellendi: " + teacherDto.name());
                return Optional.of(teacherDto);
            }
        }
        //throw new RegisterNotFoundException("⚠️ Güncellenecek öğretmen bulunamadı, ID: " + id);
        System.out.println(SpecialColor.RED + "⚠️ Güncellenecek öğretmen bulunamadı, ID: " + id + SpecialColor.RESET);
        return null;
    }

    /**
     * 📌 Öğretmen Silme (DELETE)
     */
    @Override
    public Optional<TeacherDto> delete(int id) {
        Optional<TeacherDto> teacherToDelete = findById(id);
        if (teacherToDelete.isPresent()) {
            teacherDtoList.remove(teacherToDelete.get());
            logger.info("✅ Öğretmen silindi, ID: " + id);
            return teacherToDelete;
        } else {
            logger.warning("⚠️ Silinecek öğretmen bulunamadı, ID: " + id);
            return Optional.empty();
        }
    }


    /// /////////////////////////////////////////////////////////////////////
    /// /////////////////////////////////////////////////////////////////////
    // Enum Öğretmen Türü Method
    public ETeacherSubject teacherTypeMethod() {
        System.out.println("\n" + SpecialColor.GREEN + "Öğretmen türünü seçiniz.\n1-)Tarih\n2-)Bioloji\n3-)Kimya\n4-)Bilgisayar Bilimleri\n5-)Diğer" + SpecialColor.RESET);
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
    /**
     * 📌 Kullanıcı işlemlerini yönlendirme metodu (CHOOSE)
     */
// Console Seçim (Öğretmen)
    @Override
    public void choose() {
        logger.info("ℹ️ Öğretmen işlemleri ekranına yönlendirildi.");
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
        // ID artık manuel girilmiyor, otomatik artıyor
        int id = ++maxId;

        System.out.print("Adı: ");
        String name = scanner.nextLine();

        System.out.print("Soyadı: ");
        String surname = scanner.nextLine();

        System.out.print("Doğum Tarihi (yyyy-MM-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Uzmanlık Alanı: ");
        ETeacherSubject subject = teacherTypeMethod();

        System.out.print("Deneyim Yılı: ");
        int yearsOfExperience = scanner.nextInt();

        System.out.print("Kadrolu mu? (true/false): ");
        boolean isTenured = scanner.nextBoolean();

        System.out.print("Maaş: ");
        double salary = scanner.nextDouble();

        TeacherDto teacher = new TeacherDto(id, name, surname, birthDate, subject, yearsOfExperience, isTenured, salary);
        teacherDtoList.add(teacher);
        innerClass.writeFile();

        System.out.println("Öğretmen başarıyla eklendi. Atanan ID: " + id);
    }

    private void listTeachers() {
        // 📌 Eğer liste boşsa dosyadan tekrar yükle
        if (teacherDtoList.isEmpty()) {
            System.out.println(SpecialColor.YELLOW + "⚠️ Öğretmen listesi boş, dosyadan yükleniyor..." + SpecialColor.RESET);

            List<String> fileLines = innerClass.fileHandler.readFile();
            for (String line : fileLines) {
                TeacherDto teacher = csvToTeacher(line);
                if (teacher != null) {
                    teacherDtoList.add(teacher);
                } else {
                    System.out.println(SpecialColor.RED + "⚠️ Hatalı satır atlandı: " + line + SpecialColor.RESET);
                }
            }

            // 📌 Eğer hala liste boşsa uyarı ver
            if (teacherDtoList.isEmpty()) {
                System.out.println(SpecialColor.RED + "⚠️ Dosyada öğretmen verisi bulunamadı!" + SpecialColor.RESET);
            } else {
                System.out.println(SpecialColor.GREEN + "✅ " + teacherDtoList.size() + " öğretmen başarıyla yüklendi!" + SpecialColor.RESET);
            }
        }

        // 📌 Öğretmenleri listele
        if (!teacherDtoList.isEmpty()) {
            System.out.println("\n=== 📜 Öğretmen Listesi ===");
            for (TeacherDto teacher : teacherDtoList) {
                System.out.println(teacher.fullName() + " - " + teacher.subject());
            }
        }
    }


    private void searchTeacher() {
        // Öncelikle Listele
        listTeachers();
        System.out.print("Aranacak öğretmenin adı: ");
        String name = scanner.nextLine();

        findByName(name).ifPresentOrElse(
                teacher -> System.out.println("Bulunan Öğretmen: " + teacher.fullName() + " - " + teacher.subject()),
                () -> System.out.println("Öğretmen bulunamadı.")
        );
    }

    private void updateTeacher() {
        // Öncelikle Listele
        listTeachers();
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
        // Öncelikle Listele
        listTeachers();
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
        if (teacherDtoList.isEmpty()) {
            System.out.println("Kayıtlı öğretmen yok.");
            return;
        }
        TeacherDto teacher = teacherDtoList.get(random.nextInt(teacherDtoList.size()));
        System.out.println("Seçilen Rastgele Öğretmen: " + teacher.fullName());
    }

    private void sortTeachersByAge() {
        teacherDtoList.sort(Comparator.comparing(TeacherDto::birthDate));
        System.out.println("Öğretmenler yaşa göre sıralandı.");
        listTeachers();
    }


    public static void main(String[] args) {
        //TeacherDao teacherDao= new TeacherDao();
        //teacherDao.choose();
    }

}
