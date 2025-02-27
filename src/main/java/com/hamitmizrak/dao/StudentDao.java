package com.hamitmizrak.dao;

import com.hamitmizrak.dto.EStudentType;
import com.hamitmizrak.dto.StudentDto;
import com.hamitmizrak.exceptions.StudentNotFoundException;
import com.hamitmizrak.utils.SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


// Öğrenci Yönetim Sistemi
public class StudentDao implements IDaoGenerics<StudentDto> {

    // Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

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

    ////////////////////////////////////////////////////////////////
    // Login
    // Register

    /// /////////////////////////////////////////////////////////////
    // FileIO

    // File If Not Exists (Eğer students.txt yoksa, oluştur)
    private void createFileIfNotExists() {
        //students.txt
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(SpecialColor.YELLOW + FILE_NAME + " adında dosya oluşturuldu " + SpecialColor.RESET);
            } catch (IOException ioException) {
                System.out.println(SpecialColor.CYAN + " Dosya oluşturulurken hata oluştu" + SpecialColor.RESET);
                ioException.printStackTrace();
            }
        }
    }

    // File Create
    private void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(studentDtoList);
        } catch (IOException io) {
            System.out.println(SpecialColor.RED + " Dosya Ekleme Hatası" + SpecialColor.RESET);
            io.printStackTrace();
        }
    }

    // File Read
    // Öğrenci Listesini Yükle (Dosya)
    private void loadStudentsListFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            studentCounter = studentDtoList.size();
            System.out.println(SpecialColor.BLUE + " Dosyadan Yüklenen Öğrenci sayısı: " + studentCounter);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(SpecialColor.RED + " Dosyadan yüklenen Öğren Kayıdı bulunamadı " + SpecialColor.RESET);
            fileNotFoundException.printStackTrace();
        } catch (IOException io) {
            System.out.println(SpecialColor.RED + " Dosya Okuma Hatası" + SpecialColor.RESET);
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /// /////////////////////////////////////////////////////////////
    // C-R-U-D
    // Öğrenci Ekle
    @Override
    public StudentDto create(StudentDto studentDto) {
        studentDtoList.add(
                new StudentDto(++studentCounter, studentDto.getName(), studentDto.getSurname(), studentDto.getMidTerm(), studentDto.getFinalTerm(), studentDto.getBirthDate(), studentDto.geteStudentType())
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
        /* studentDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println); */
        // Eğer Öğrenci varsa true dönder
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
            }
        }
        System.out.println(SpecialColor.RED + " Öğrenci Bulunamadı" + SpecialColor.RESET);
        return studentDto;
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
        } else {
            System.out.println(SpecialColor.RED + "Öğrenci Silinmedi" + SpecialColor.RESET);
        }
        return null;
    }

    ////////////////////////////////////////////////////////////////
    // Toplam Öğrenci Sayısı
    // Rastgele Öğrenci
    // Öğrenci Not Ortalaması Hesapla
    // En Yüksek veya En Düşük Not Alan Öğrenci
    // Öğrenci Sıralaması (Doğum günü)

    /// /////////////////////////////////////////////////////////////
    // Enum Öğrenci Türü Method
    public EStudentType studentTypeMethod() {
        Scanner scanner = new Scanner(System.in);
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

    /// /////////////////////////////////////////////////////////////
    // Console Seçim (Öğrenci)
    @Override
    public void chooise() {
        Scanner scanner = new Scanner(System.in);
        StudentDao studentManagementSystem = new StudentDao();

        // Sonsuz while
        while (true) {
            System.out.println(SpecialColor.YELLOW + "\n1.Öğrenci Ekle");
            System.out.println("2.Öğrenci Listele");
            System.out.println("3.Öğrenci Ara");
            System.out.println("4.Öğrenci Güncelle");
            System.out.println("5.Öğrenci Sil");
            System.out.println("6.Öğrenci toplam öğrenci sayısı");
            System.out.println("7.Öğrenci rastgele gelsin");
            System.out.println("8.Öğrenci Not Hesapla");
            System.out.println("9.Öğrenci En Yüksek, En düşük Notları Göster");
            System.out.println("10.Öğrenci Öğrenci Sıralaması Doğum gününe göre göster");
            System.out.println("11.Çıkış" + SpecialColor.RESET);
            System.out.println(SpecialColor.CYAN + "Lütfen Seçiminizi Yapınız" + SpecialColor.RESET);

            // Seçim yap
            int chooise = scanner.nextInt();
            scanner.nextLine(); // durma yerimiz

            // Karar
            switch (chooise) {
                case 1: // Öğrenci Ekle
                    System.out.println("Öğrenci Adı");
                    String name = scanner.nextLine();

                    System.out.println("Öğrenci Soyadı");
                    String surname = scanner.nextLine();

                    System.out.println("Öğrenci Doğum tarihi YYYY-MM-DD");
                    LocalDate birthDate = LocalDate.parse(scanner.nextLine());

                    System.out.println("Vize Puanı");
                    double midTerm = scanner.nextDouble();

                    System.out.println("Final Puanı");
                    double finalTerm = scanner.nextDouble();

                    // Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate
                    studentManagementSystem.create(new StudentDto(++studentCounter, name, surname, midTerm, finalTerm, birthDate, studentTypeMethod()));
                    break;
                case 2: // Öğrenci Listelemek
                    studentManagementSystem.list();
                    break;

                case 3: // Öğrenci Ara
                    studentManagementSystem.list();
                    System.out.println(SpecialColor.BLUE + " Aranacak Öğrenci ismi yazınız " + SpecialColor.RESET);
                    String searchName = scanner.nextLine();
                    studentManagementSystem.findByName(searchName);
                    break;

                case 4: // Öğrenci Güncelle
                    studentManagementSystem.list();
                    System.out.println("Güncelleme yapılacak Öğrenci ID'si giriniz");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Eğer int sonrası String gelecekse bunu yazmalıyız.

                    System.out.println("Yeni Öğrenci Adı");
                    String nameUpdate = scanner.nextLine();

                    System.out.println("Yeni Öğrenci Soyadı");
                    String surnameUpdate = scanner.nextLine();

                    System.out.println("Öğrenci Doğum tarihi YYYY-MM-DD");
                    LocalDate birthDateUpdate = LocalDate.parse(scanner.nextLine());

                    System.out.println("Vize Puanı");
                    double midTermUpdate = scanner.nextDouble();

                    System.out.println("Final Puanı");
                    double finalTermUpdate = scanner.nextDouble();

                    // Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate
                    StudentDto studentDtoUpdate = StudentDto.builder()
                            .name(nameUpdate)
                            .surname(surnameUpdate)
                            .midTerm(midTermUpdate)
                            .finalTerm(finalTermUpdate)
                            .birthDate(birthDateUpdate)
                            .eStudentType(studentTypeMethod())
                            .build();
                    try {
                        studentManagementSystem.update(id, studentDtoUpdate);
                    } catch (StudentNotFoundException e) {
                        System.out.println(SpecialColor.RED + e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 5: // Öğrenci Sil
                    studentManagementSystem.list();
                    System.out.println(SpecialColor.BLUE + " Silinecek Öğrenci ID");
                    int deleteID = scanner.nextInt();
                    studentManagementSystem.delete(deleteID);
                    break;

                case 6:
                    System.out.println("case 6");
                    break;
                case 7:
                    System.out.println("case 7");
                    break;
                case 8:
                    System.out.println("case 8");
                    break;
                case 9:
                    System.out.println("case 9");
                    break;
                case 10:
                    System.out.println("case 10");
                    break;
                case 11:
                    System.out.println("Sistemden çıkış yapılıyor");
                    System.exit(0);
                    //return;  //bunu yazarsak break gerek yoktur
                    break;
                default:
                    System.out.println("Geçersiz seçim yaptınız! Lütfen tekrar deneyiniz ");
                    break;
            }
        }
    }

}
