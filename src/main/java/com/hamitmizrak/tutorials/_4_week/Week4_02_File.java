package com.hamitmizrak.tutorials._4_week;

import java.io.File;
import java.io.IOException;

public class Week4_02_File {
    // Const
    public static final String MY_PATH = "C:\\io\\techcareer\\offline\\file.txt";

    // Create
    private static void myFileICreate() throws IOException {
        File file = new File(MY_PATH);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println(MY_PATH + " dosya oluşturuldu");
        } else {
            System.out.println(MY_PATH + " zaten böyle bir dosya var");
        }
    }


    // File Information
    private static void myFileInformation() {
        try {
            myFileICreate();
            ////////////////////////////////
            File file = new File(MY_PATH);
            if (file.isFile()) {// Dosya Bilgileri
                // CAN
                System.out.println("+++ CAN +++");
                System.out.println("Okunabilinir mi? " + file.canRead());
                System.out.println("Yazılabilinir mi? " + file.canWrite());
                System.out.println("Çalışabilinir mi ? " + file.canExecute());

                System.out.println("+++ IS +++");
                System.out.println("Dizin mi? " + file.isDirectory());
                System.out.println("Dosya mi? " + file.isFile());
                System.out.println("Gizli Dosya mi? " + file.isHidden());

                System.out.println("+++ GET +++");
                System.out.println("Boş  HDD kalan alan? " + file.getFreeSpace());
                System.out.println("Name " + file.getName());
                System.out.println("getParent " + file.getParent());
                System.out.println("getAbsoluteFile " + file.getAbsoluteFile());
                System.out.println("Toplam HDD " + file.getTotalSpace());

                System.out.println("+++ SET +++");
                System.out.println("setExecutable " + file.setExecutable(false));
                System.out.println("setReadable " + file.setReadable(false));
                System.out.println("setWritable " + file.setWritable(false));

                System.out.println("+++ CAN +++");
                System.out.println("Okunabilinir mi? " + file.canRead());
                System.out.println("Yazılabilinir mi? " + file.canWrite());
                System.out.println("Çalışabilinir mi ? " + file.canExecute());

                System.out.println("+++ INFO +++");
                System.out.println("length ? " + file.length());
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    } //end myFileInformation

    public static void main(String[] args) {
        myFileInformation();
    }
}

