package com.hamitmizrak.iofiles;

import com.hamitmizrak.utils.SpecialColor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpecialFileHandler {

    private static final Logger logger = Logger.getLogger(SpecialFileHandler.class.getName());
    private String filePath;

    public SpecialFileHandler() {
        this.filePath = "default.txt";  // Varsayılan dosya adı
    }

    public void createFileIfNotExists() {
        File file = new File(filePath);
        try {
            if (file.exists()) {
                //logger.info("✅ Dosya zaten mevcut: " + filePath);
                System.out.println(SpecialColor.YELLOW+"✅ Dosya zaten mevcut: " + filePath+SpecialColor.RESET);
            } else {
                if (file.createNewFile()) {
                    //logger.info("📄 Yeni dosya oluşturuldu: " + filePath);
                    System.out.println(SpecialColor.BLUE+"📄 Yeni dosya oluşturuldu: " + filePath+SpecialColor.RESET);
                } else {
                    //logger.warning("⚠️ Dosya oluşturulamadı: " + filePath);
                    System.out.println(SpecialColor.RED+"⚠️ Dosya oluşturulamadı: " + filePath+SpecialColor.RESET);
                }
            }
        } catch (IOException e) {
            //logger.log(Level.SEVERE, "❌ Dosya oluşturma hatası: " + e.getMessage(), e);
            //
            System.out.println(SpecialColor.RED+"⚠️ Dosya oluşturma hatası: " + filePath+SpecialColor.RESET);
        }
    }

    public void writeFile(String data) {
        if (data == null || data.trim().isEmpty()) {
            logger.warning("⚠️ Boş veri yazılamaz!");
            System.out.println(SpecialColor.RED+"⚠️ Boş veri yazılamaz! " + filePath+SpecialColor.RESET);
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
            writer.newLine();
            //logger.info("✅ Veri başarıyla dosyaya yazıldı: " + filePath);
            System.out.println(SpecialColor.BLUE+"✅ Veri başarıyla dosyaya yazıldı: " + filePath+SpecialColor.RESET);
        } catch (IOException e) {
            //logger.log(Level.SEVERE, "❌ Dosyaya yazma hatası: " + e.getMessage(), e);
            System.out.println(SpecialColor.RED+"❌Dosyaya yazma hatası: " + filePath+SpecialColor.RESET);
        }
    }

    public List<String> readFile() {
        File file = new File(filePath);
        List<String> fileLines = new ArrayList<>();

        if (!file.exists()) {
            //logger.warning("⚠️ Okunacak dosya bulunamadı: " + filePath);
            System.out.println(SpecialColor.RED+"⚠️ Okunacak dosya bulunamadı: " + filePath+SpecialColor.RESET);
            return fileLines;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            //logger.info("📖 Dosya içeriği okunuyor...");
            System.out.println(SpecialColor.BLUE+"📖 Dosya içeriği okunuyor... " +SpecialColor.RESET);
            while ((line = reader.readLine()) != null) {
                fileLines.add(line);
            }
        } catch (IOException e) {
            //logger.log(Level.SEVERE, "❌ Dosya okuma hatası: " + e.getMessage(), e);
            System.out.println(SpecialColor.RED+"❌ Dosya okuma hatası " + filePath+SpecialColor.RESET);
        }

        if (fileLines.isEmpty()) {
            //logger.warning("⚠️ Dosya okunmasına rağmen içerik boş.");
            System.out.println(SpecialColor.RED+"⚠️ Dosya okunmasına rağmen içerik boş." +SpecialColor.RESET);
        } else {
            //logger.info("✅ Dosyadan " + fileLines.size() + " satır başarıyla okundu.");
            System.out.println(SpecialColor.BLUE+"✅ Dosyadan " + fileLines.size() + " satır başarıyla okundu."+SpecialColor.RESET);
        }

        return fileLines;
    }


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            //logger.warning("⚠️ Geçersiz dosya yolu! Varsayılan dosya adı atanıyor: default.txt");
            System.out.println(SpecialColor.RED+"️ Geçersiz dosya yolu! Varsayılan dosya adı atanıyor: default.txt"+SpecialColor.RESET);
            this.filePath = "default.txt";
        } else {
            this.filePath = filePath;
        }
    }
}
