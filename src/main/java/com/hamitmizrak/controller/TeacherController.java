package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoGenerics;
import com.hamitmizrak.dao.TeacherDao;
import com.hamitmizrak.dto.ETeacherSubject;
import com.hamitmizrak.dto.TeacherDto;
import com.hamitmizrak.log.LogExecutionTime;
import com.hamitmizrak.utils.SpecialColor;

import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;

public class TeacherController implements IDaoGenerics<TeacherDto> {

    private static final Logger logger = Logger.getLogger(TeacherController.class.getName());
    private final TeacherDao teacherDao;

    public TeacherController() {
        this.teacherDao = new TeacherDao();
    }

    @Override
    @LogExecutionTime
    public Optional<TeacherDto> create(TeacherDto teacherDto) {
        if (teacherDto == null || teacherDao.findByName(teacherDto.name()).isPresent()) {
            logger.warning("❌ Geçersiz veya mevcut olan öğretmen eklenemez");
            return Optional.empty();
        }
        return teacherDao.create(teacherDto);
    }

    @Override
    @LogExecutionTime
    public Optional<TeacherDto> findByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Geçersiz isim girdiniz");
        }
        return teacherDao.findByName(name).or(() -> {
            logger.warning("❌ Öğretmen bulunamadı");
            return Optional.empty();
        });
    }

    @Override
    @LogExecutionTime
    public Optional<TeacherDto> findById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("❌ Geçersiz ID girdiniz");
        }
        return teacherDao.findById(id).or(() -> {
            logger.warning("❌ Öğretmen bulunamadı");
            return Optional.empty();
        });
    }

    @Override
    @LogExecutionTime
    public List<TeacherDto> list() {
        List<TeacherDto> teacherDtoList = Optional.ofNullable(teacherDao.list()).orElse(Collections.emptyList());
        if (teacherDtoList.isEmpty()) {
            logger.info("Henüz kayıtlı bir öğretmen bulunmamaktadır.");
        }
        return teacherDtoList;
    }

    @Override
    @LogExecutionTime
    public Optional<TeacherDto> update(int id, TeacherDto teacherDto) {
        if (id <= 0 || teacherDto == null) {
            throw new IllegalArgumentException("❌ Güncelleme için geçerli bir öğretmen bilgisi giriniz");
        }
        return teacherDao.update(id, teacherDto);
    }

    @Override
    @LogExecutionTime
    public Optional<TeacherDto> delete(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("❌ Silmek için geçerli bir öğretmen ID giriniz");
        }
        return teacherDao.delete(id).or(() -> {
            logger.warning("❌ Silme işlemi başarısız: Öğretmen bulunamadı");
            return Optional.empty();
        });
    }


    //@LogExecutionTime
    @Override
    public void choose() {
        Scanner scanner = new Scanner(System.in);

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
                    default -> System.out.println("❌ Geçersiz seçim! Lütfen tekrar deneyin.");
                }
            } catch (Exception e) {
                System.out.println("⛔ Beklenmeyen bir hata oluştu: " + e.getMessage());
                scanner.nextLine(); // Scanner'ı temizle
            }
        }
    }

    /**
     * 📌 Yeni öğretmen için benzersiz ID üretir.
     */
    public int generateNewId() {
        return teacherDao.list().isEmpty() ? 1 :
                teacherDao.list().stream().mapToInt(TeacherDto::id).max().orElse(0) + 1;
    }


    public void addTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Öğretmen Adı: ");
        String name = scanner.nextLine().trim();

        System.out.print("Öğretmen Soyadı: ");
        String surname = scanner.nextLine().trim();

        System.out.print("Doğum Yılı: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Branşınızı seçiniz (MATHEMATICS, CHEMISTRY, BIOLOGY, HISTORY, COMPUTER_SCIENCE, OTHER): ");
        String subjectStr = scanner.nextLine().trim().toUpperCase();

        ETeacherSubject subject;
        try {
            subject = ETeacherSubject.valueOf(subjectStr);
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Geçersiz branş! Varsayılan olarak OTHER atanıyor.");
            subject = ETeacherSubject.OTHER;
        }

        TeacherDto newTeacher = new TeacherDto(generateNewId(), name, surname, LocalDate.of(birthYear, 1, 1), subject, 0, false, 0.0);
        create(newTeacher);
        System.out.println("✅ Yeni öğretmen eklendi: " + newTeacher.name());
    }

    public void listTeachers() {
        List<TeacherDto> teachers = list();
        if (teachers.isEmpty()) {
            System.out.println("⚠️ Öğretmen bulunamadı.");
        } else {
            teachers.forEach(System.out::println);
        }
    }

    public void searchTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak öğretmen adı: ");
        String name = scanner.nextLine().trim();

        Optional<TeacherDto> teacher = findByName(name);
        teacher.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("⚠️ Öğretmen bulunamadı.")
        );
    }

    public void updateTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Güncellenecek öğretmen ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Optional<TeacherDto> existingTeacher = findById(id);
        if (existingTeacher.isPresent()) {
            System.out.print("Yeni isim: ");
            String newName = scanner.nextLine().trim();

            System.out.print("Yeni soyisim: ");
            String newSurname = scanner.nextLine().trim();

            System.out.print("Yeni branş: ");
            String newSubjectStr = scanner.nextLine().trim().toUpperCase();
            ETeacherSubject newSubject = ETeacherSubject.valueOf(newSubjectStr);

            TeacherDto updatedTeacher = new TeacherDto(id, newName, newSurname, existingTeacher.get().birthDate(), newSubject, existingTeacher.get().yearsOfExperience(), existingTeacher.get().isTenured(), existingTeacher.get().salary());
            update(id, updatedTeacher);
            System.out.println("✅ Öğretmen güncellendi: " + updatedTeacher.name());
        } else {
            System.out.println("⚠️ Öğretmen bulunamadı.");
        }
    }
    public void deleteTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek öğretmen ID: ");
        int id = scanner.nextInt();

        Optional<TeacherDto> deletedTeacher = delete(id);
        deletedTeacher.ifPresentOrElse(
                teacher -> System.out.println("✅ Öğretmen silindi: " + teacher.name()),
                () -> System.out.println("⚠️ Öğretmen bulunamadı.")
        );
    }
    public void chooseRandomTeacher() {
        List<TeacherDto> teachers = list();
        if (teachers.isEmpty()) {
            System.out.println("⚠️ Öğretmen bulunamadı.");
            return;
        }
        Random random = new Random();
        TeacherDto randomTeacher = teachers.get(random.nextInt(teachers.size()));
        System.out.println("🎉 Seçilen öğretmen: " + randomTeacher.name());
    }

    public void sortTeachersByAge() {
        List<TeacherDto> teachers = list();
        if (teachers.isEmpty()) {
            System.out.println("⚠️ Öğretmen bulunamadı.");
            return;
        }
        teachers.sort(Comparator.comparing(TeacherDto::birthDate));
        teachers.forEach(System.out::println);
    }

}