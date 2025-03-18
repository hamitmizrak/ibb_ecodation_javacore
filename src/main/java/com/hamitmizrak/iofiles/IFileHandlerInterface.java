package com.hamitmizrak.iofiles;

/**
 * 📌 Dosya işlemleri için temel arayüz
 * Her dosya yönetim sınıfının bu arayüzü uygulaması beklenir.
 */
public interface IFileHandlerInterface {

    /**
     * 📌 Dosya yoksa oluştur, varsa aç.
     */
    void createFileIfNotExists();

    /**
     * 📌 Dosyaya veri yazma metodu.
     * @param data Yazılacak veri.
     */
    void writeFile(String data);

    /**
     * 📌 Dosyadan veri okuma metodu.
     */
    void readFile();

    /**
     * 📌 Loglama işlemi için varsayılan metot.
     */
    default void logInfo(String message) {
        System.out.println("ℹ️ " + message);
    }
}
