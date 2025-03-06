package com.hamitmizrak.tutorials._4_week;

import java.io.File;
import java.io.IOException;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

    public class Week4_03_FileWriteReaderScanner {
        // Const
        public static final String MY_PATH = "C:\\io\\techcareer\\offline\\file.txt";

        // File Create
        private static void myFileICreate() throws IOException {
            File file = new File(MY_PATH);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println(MY_PATH + " dosya oluşturuldu");
            } else {
                System.out.println(MY_PATH + " zaten böyle bir dosya var");
            }
        }

        // Date
        private static String logDate(){
            Locale locale=new Locale("tr","TR");
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz",locale);
            Date date=new Date();
            String changeToDate=simpleDateFormat.format(date).toString();
            return changeToDate;
        }

        // Writer
        private static void logToWriter() {
            try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(MY_PATH,true))){
                // Date
                String nowDate="["+logDate()+"]";
                String value=nowDate+" Merhabalar"+"\n";
                bufferedWriter.write(value);
                bufferedWriter.flush();
            }catch (Exception exception){
                exception.printStackTrace();
            }
        } //end writer

        // Writer
        private static void logReader() {
            String rows;// okunan satır
            StringBuilder stringBuilder=new StringBuilder();
            String builderToString;
            try(BufferedReader bufferedReader=new BufferedReader(new FileReader(MY_PATH))){
                while((rows=bufferedReader.readLine()) !=null){
                    stringBuilder.append(rows).append("\n");
                }
                builderToString=stringBuilder.toString();
                System.out.println(builderToString);
            }catch (Exception exception){
                exception.printStackTrace();
            }
        } //end reader


        // All Data
        private static void validationAllData() throws IOException {
            Scanner scanner=new Scanner(System.in);
            String allUserChooise=
                    "\nLütfen Seçim yapınız"
                            .concat("\n1-)Dosyaya Oluştur")
                            .concat("\n2-)Dosyaya Yaz")
                            .concat("\n3-)Dosya Oku")
                            .concat("\n4-)Exit");
            System.out.println(allUserChooise);
            int chooise=scanner.nextInt();

            switch (chooise){
                case 1:
                    myFileICreate();
                    break;
                case 2:
                    logToWriter();
                    break;
                case 3:
                    logReader();
                    break;
                case 4:
                    System.out.println("Sistemden Çıkış yapılıyor");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lütfen size belirtilen aralıkta seçim yapınız.");
            }
        }

        private static void allResultData() throws IOException {
            // sonsuz döngü while(true){}
            // sonsuz döngü for(;;){}
            while(true){
                validationAllData();
            }
        }

        // Validation
        // PSVM
        public static void main(String[] args) throws IOException {
            allResultData();
        }
    }
