package com.hamitmizrak;

import com.hamitmizrak.controller.LoginRegisterController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 📌 Ana Program Çalıştırıcı (Main Class)
 * Kullanıcı giriş ve kayıt işlemlerini başlatır.
 */
public class Project {

    private static final Logger logger = Logger.getLogger(Project.class.getName());

    public static void main(String[] args) {
        logger.info("🚀 Proje başlatılıyor...");
        LoginRegisterController controller = new LoginRegisterController();
        controller.login();

        /*
        try {
            LoginRegisterController controller = new LoginRegisterController();
            controller.login();
            logger.info("✅ Uygulama başarıyla çalıştırıldı.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "❌ Uygulama çalıştırılırken hata oluştu: " + e.getMessage(), e);
        }*/
    }


}
