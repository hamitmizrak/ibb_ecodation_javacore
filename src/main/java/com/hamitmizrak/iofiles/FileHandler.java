package com.hamitmizrak.iofiles;

import com.hamitmizrak.utils.SpecialColor;

import java.io.*;

public class FileHandler implements IFileHandlerInterface {

    // Field
    private  String filePath="";

    // Constructor
    public FileHandler() {
        filePath="isnotfilename.txt";
    }

    // Method
    // Dosya yoksa oluştur varsa onu kullan.
    @Override
    public synchronized void createFileIfNotExists(){
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println(SpecialColor.YELLOW + filePath + " oluşturuldu." + SpecialColor.RESET);
                }
            } catch (IOException e) {
                System.out.println(SpecialColor.RED + "Dosya oluşturulurken hata oluştu!" + SpecialColor.RESET);
                e.printStackTrace();
            }
        }
    }

    // Dosya Yaz
    //📌 Öğrencileri dosyaya yazma (BufferedWriter)
    @Override
    public synchronized void writeFile(String data){
        // Java 1.7 try-with-resources
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(filePath,true))){
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    // Dosya Oku
    //📌 Öğrencileri dosyadan yükleme (BufferedReader)
    @Override
    public synchronized void readFile(String data){
        // Java 1.7 try-with-resources
        try(BufferedReader bufferedReader= new BufferedReader(new FileReader(filePath))){
            String line="";
            while((line= bufferedReader.readLine())!=null){
                //System.out.println("Dosyadan Okundu"+line);
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    // Getter And Setter
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        if(filePath==null || filePath.isEmpty() || filePath.isBlank()){
            this.filePath="isnotfilename.txt";
        }
        this.filePath = filePath;
    }

} // end
