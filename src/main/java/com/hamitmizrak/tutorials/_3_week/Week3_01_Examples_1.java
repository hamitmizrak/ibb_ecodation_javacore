package com.hamitmizrak.tutorials._3_week;


import com.hamitmizrak.utils.SpecialColor;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
/*
İşte kodunuz için bazı sorular:  

 Genel Sorular
1. Programın temel amacı nedir ve hangi yöntemleri kullanarak bu amacı gerçekleştiriyor?  
2. Kodda kullanılan `SpecialColor` sınıfının amacı nedir? Bu sınıf olmadan program nasıl çalışır?  
3. Kodda kullanılan `Logger` nesnesinin amacı nedir ve hangi seviyelerde loglama yapıyor?  
4. Programın çalışmasını durduran (terminate eden) durumlar nelerdir?  
5. Kodda hangi erişim belirleyicileri (access modifiers) kullanılmıştır ve neden bu şekilde seçilmiştir?  

 Faktöriyel Hesaplama İle İlgili Sorular
6. Program hangi iki farklı yöntemi kullanarak faktöriyel hesaplamaktadır? Bu yöntemlerin farkları nelerdir?  
7. İteratif faktöriyel hesaplama yöntemi nasıl çalışır ve zaman karmaşıklığı nedir?  
8. Recursive faktöriyel hesaplama yöntemi neden daha fazla bellek kullanır?  
9. Recursive faktöriyel hesaplama için bir sınır belirlenmiş. Bunun sebebi nedir?  
10. Eğer recursive fonksiyon sınırı kaldırılırsa ne gibi bir problem yaşanabilir?  

 Giriş ve Doğrulama Mekanizması İle İlgili Sorular
11. Kullanıcının negatif sayı girmesi durumunda program nasıl bir tepki veriyor?  
12. Program, ondalıklı (decimal) sayı girilmesini nasıl engelliyor ve kaç hata sonrası program kapanıyor?  
13. Kullanıcıdan alınan girişleri loglamak neden önemlidir?  
14. Kodun `getValidPositiveNumber()` metodunda hangi doğrulama kontrolleri yer alıyor?  
15. Programın giriş alma metodunda hatalı girişlerin önlenmesi için nasıl bir mantık kullanılmıştır?  

 Kod İyileştirme ve Geliştirme İle İlgili Sorular
16. Programın geliştirilmesi için hangi ek özellikler eklenebilir?  
17. Kodda exception handling (istisna yönetimi) yeterince sağlanmış mı? Hangi durumlarda iyileştirme yapılabilir?  
18. Kodun test edilebilirliğini artırmak için hangi değişiklikler yapılabilir?  
19. Programın daha kullanıcı dostu hale getirilmesi için ne gibi geliştirmeler önerirsiniz?  
20. Log mekanizması ile ilgili iyileştirme önerileriniz nelerdir?  

Bu sorular programın mantığını daha iyi anlamanıza ve geliştirilmesi gereken noktaları fark etmenize yardımcı olabilir. Eğer daha teknik sorular isterseniz, ona göre eklemeler yapabilirim! 🚀
*/

/*
Yöntem   | Zaman karmaşıklığı | Uzay Karmaşıklığı | Avantaj             | Dezavantaj
---------| ------------------ | ------------------| ------------------- | ----------
iterative| O(n)               | O(1)              | Hızlı, hafıza dostu | Kodu daha uzundur
Recursive| O(n)               | O(n)              | Daha okunaklı,      | Yavaştır
                                                    Matematiksel gösterim
 */

// System

// Access Modifier
public class Week3_01_Examples_1 {

    private static final int MAX_DECIMAL_ATTEMPTS = 3; // Virgüllü sayı girme hakkı
    private static final int MAX_RECURSIVE_LIMIT = 20; // Faktöriyel hesaplanması sınırsız sayı olmadığı için sınırlama
    // Scanner
    private static final Scanner scanner = new Scanner(System.in);

    /// //////////////////////////////////////////////////////////////////////////////////
    // Loglama
    private static final Logger logger = Logger.getLogger(Week3_01_Examples_1.class.getName());

    // Loglama dosyası için
    static {
        try {
            LogManager.getLogManager().reset(); // Önceki log ayarlarını sıfırla
            FileHandler fileHandler = new FileHandler("factorial_log.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            System.err.println("Log dosyası oluşturulamadı: " + e.getMessage());
        }
    }

    // Faktöriyel Programını Çalıştırma
    private static void runFactorialProgram() {
        while (true) {
            System.out.println("\n" + SpecialColor.YELLOW + "Lütfen bir seçim yapınız:\n1) İteratif Faktöriyel\n2) Özyinelemeli Faktöriyel\n3) Sistem Özellikler\n4) Çıkış\n" + SpecialColor.RESET);
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    long iterativeNumber = getValidPositiveNumber();
                    measureIterativeFactorial(iterativeNumber);
                    break;
                case 2:
                    long recursiveNumber = getValidPositiveNumber();
                    if (recursiveNumber > MAX_RECURSIVE_LIMIT) {
                        System.out.println("UYARI: Girilen sayı recursive fonksiyon için çok büyük! Maksimum: " + MAX_RECURSIVE_LIMIT);
                        logger.warning("Recursive fonksiyon sınırı aşıldı: " + recursiveNumber);
                    } else {
                        measureRecursiveFactorial(recursiveNumber);
                    }
                    break;
                case 3:
                    systemInfo();
                    break;
                case 4:
                    System.out.println("Program sonlandırılıyor...");
                    logger.info("Program sonlandırıldı.");
                    return;
                    // break;
                    // System.exit(0);
                default:
                    System.out.println("Lütfen geçerli bir seçenek girin.");
            }
        }
    }

    // Kullanıcı Seçimini Alma
    private static int getUserChoice() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Geçersiz giriş! Lütfen bir tam sayı giriniz.");
                logger.warning("Geçersiz giriş yapıldı.");
                scanner.next();
            }
        }
    }

    // Kullanıcıdan Geçerli Pozitif Sayı Alma
    private static long getValidPositiveNumber() {
        int decimalAttemptCount = 0;

        while (true) {
            System.out.println("\nLütfen pozitif bir tam sayı giriniz:");

            if (scanner.hasNextLong()) {
                long number = scanner.nextLong();
                if (number < 0) {
                    System.out.println("Negatif sayı girdiniz! Program sonlandırılıyor...");
                    logger.severe("Negatif sayı girildi: " + number);
                    return 0;
                } else if (number == 0) {
                    System.out.println("0! = 1");
                    return 1;
                }
                return number;
              // Ondalıklı sayı girişini engelleme
            } else if (scanner.hasNextDouble()) {
                decimalAttemptCount++;
                System.out.println("Ondalıklı sayı girdiniz! Kalan deneme hakkınız: " + (MAX_DECIMAL_ATTEMPTS - decimalAttemptCount));
                logger.warning("Ondalıklı sayı girildi.");
                scanner.next();

                if (decimalAttemptCount >= MAX_DECIMAL_ATTEMPTS) {
                    System.out.println("Üç defa ondalıklı sayı girdiniz! Program sonlandırılıyor...");
                    logger.severe("Kullanıcı üç kez hatalı giriş yaptı ve sistemden atıldı.");
                    System.exit(0);
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Lütfen bir tam sayı giriniz.");
                logger.warning("Hatalı giriş yapıldı.");
                scanner.next();
            }
        }
    }

    // İteratif Faktöriyel Hesaplama ve Süre Ölçme
    private static void measureIterativeFactorial(long number) {
        long startTime = System.nanoTime();
        long result = calculateFactorialIterative(number);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(number + "! = " + result);
        System.out.println("İteratif faktöriyel hesaplama süresi: " + duration + " nanosecond");
        logger.info("İteratif faktöriyel hesaplandı: " + number + "! = " + result);
    }

    // Recursive Faktöriyel Hesaplama ve Süre Ölçme
    private static void measureRecursiveFactorial(long number) {
        long startTime = System.nanoTime();
        long result = calculateFactorialRecursive(number);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(number + "! = " + result);
        System.out.println("Recursive faktöriyel hesaplama süresi: " + duration + " nanosecond");
        logger.info("Recursive faktöriyel hesaplandı: " + number + "! = " + result);
    }

    // İteratif Faktöriyel Hesaplama
    private static long calculateFactorialIterative(long number) {
        long result = 1;
        //for (int i = number; i >=1; i--) {
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive Faktöriyel Hesaplama
    private static long calculateFactorialRecursive(long number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorialRecursive(number - 1);
    }

    // Sistem Bilgilerini Gösterme
    private static void systemInfo() {
        System.out.println("===== Sistem Bilgileri =====");

        // İşletim Sistemi ve Kullanıcı Bilgileri
        System.out.println("OS Adı                 : " + System.getProperty("os.name"));
        System.out.println("OS Versiyonu           : " + System.getProperty("os.version"));
        System.out.println("OS Mimarisi            : " + System.getProperty("os.arch"));
        System.out.println("Kullanıcı Adı          : " + System.getProperty("user.name"));
        System.out.println("Kullanıcı Ana Dizini   : " + System.getProperty("user.home"));
        System.out.println("Çalışma Dizini         : " + System.getProperty("user.dir"));

        System.out.println("\n===== Java Bilgileri =====");
        System.out.println("Java Versiyonu         : " + System.getProperty("java.version"));
        System.out.println("Java Vendor            : " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL        : " + System.getProperty("java.vendor.url"));
        System.out.println("Java Runtime Versiyonu : " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home              : " + System.getProperty("java.home"));
        System.out.println("JVM Versiyonu          : " + System.getProperty("java.vm.version"));
        System.out.println("JVM Adı                : " + System.getProperty("java.vm.name"));
        System.out.println("JVM Mimari             : " + System.getProperty("sun.arch.data.model") + "-bit");

        System.out.println("\n===== Bellek Kullanımı =====");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Toplam Bellek          : " + runtime.totalMemory() / (1024*  1024) + " MB");
        System.out.println("Kullanılabilir Bellek  : " + runtime.freeMemory() / (1024*  1024) + " MB");
        System.out.println("Maksimum Bellek        : " + runtime.maxMemory() / (1024*  1024) + " MB");

        System.out.println("\n===== Ortam Değişkenleri =====");
        System.out.println("PATH                  : " + System.getenv("PATH"));
        System.out.println("JAVA_HOME             : " + System.getenv("JAVA_HOME"));
        System.out.println("TEMP Dizin            : " + System.getenv("TEMP"));
        System.out.println("USER DOMAIN           : " + System.getenv("USERDOMAIN"));
        System.out.println("Shell (Linux/Mac)     : " + System.getenv("SHELL"));
        System.out.println("Processor Sayısı      : " + System.getenv("NUMBER_OF_PROCESSORS"));
        System.out.println("Processor Mimari      : " + System.getenv("PROCESSOR_ARCHITECTURE"));
        System.out.println("Kullanıcı Profili     : " + System.getenv("USERPROFILE"));
    }

    // PSVM
    public static void main(String[] args) {
        runFactorialProgram();
        scanner.close();
    }
}//end