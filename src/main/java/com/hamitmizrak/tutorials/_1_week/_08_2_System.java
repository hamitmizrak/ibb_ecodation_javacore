package com.hamitmizrak.tutorials._1_week;


import java.util.Scanner;

public class _08_2_System {

    // System.in
    public static void systemMethod1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir şey yazın: ");
        String input = scanner.nextLine();
        System.out.println("Girdiğiniz: " + input);
        scanner.close();
    }

    // System.out
    public static void systemMethod2() {
        System.out.println("Merhaba, Dünya!");
        System.out.print("Yan yana yazılır.");
        System.out.printf("\nFormatlı yazdırma: %d + %d = %d", 5, 3, 5 + 3);
    }

    // 3-) System.err
    public static void systemMethod3() {
        System.err.println("Bu bir hata mesajıdır!");
    }

    // 4-) Java Properties
    public static void systemMethod4() {
        System.out.println("Java Versiyonu: " + System.getProperty("java.version"));
        System.out.println("OS Adı: " + System.getProperty("os.name"));
        System.out.println("Kullanıcı Adı: " + System.getProperty("user.name"));
        System.out.println("Çalışma Dizini: " + System.getProperty("user.dir"));
    }

    // 5-) Ortam değişkenleri
    public static void systemMethod5() {
        System.out.println("PATH: " + System.getenv("PATH"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));
    }

    // 6-) GC
    public static void systemMethod6() {
        System.out.println("Çöp toplama çağrısı yapılıyor...");
        System.gc();
    }

    // 7-) Zaman Ölçme
    public static void systemMethod7() {
        long start = System.currentTimeMillis();

        // 1 milyon döngü çalıştır
        for (int i = 0; i < 1_000_000; i++) {
        }

        long end = System.currentTimeMillis();
        System.out.println("Geçen süre: " + (end - start) + " ms");
    }

    // 8-) Nano zaman hesaplama
    public static void systemMethod8() {
        long start = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
        }

        long end = System.nanoTime();
        System.out.println("Geçen süre: " + (end - start) + " ns");
    }

    public static void systemMethod9() {
    }

    public static void systemMethod10() {
    }


    /// ///////////////////////////////////////////////
    // Eğer System.exit(0) kullanırsam;
    // 1-) JVM duruyor.
    // 2-) Çalışan Tüm Threadler Sonlanıyor.
    // 3-) Programın işletim sistemindeki processlerde kapanıyor
    public static void processCloseJvmStop() {
        System.out.println("Program başladı. System.exit(0)");
        System.exit(0);
        System.out.println("Bu satır çalışmayacaktır ?");
    }

    public static void processContinueJvmContinue() {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Program başladı. Break;");
                System.out.println("Sadece Döngüden çıkılıyor");
                break;
            }
            System.out.println(i + ". sıra");
        }
        System.out.println("Bu satır çalışacak");
    }

    public static void main(String[] args) {
//        systemMethod4();
//        systemMethod5();
//        systemMethod6();
//        systemMethod7();
        systemMethod8();
        // System
        //processContinueJvmContinue();
        //processCloseJvmStop();
    }
}
