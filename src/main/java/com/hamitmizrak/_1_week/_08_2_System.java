package com.hamitmizrak._1_week;


public class _08_2_System {

    // Eğer System.exit(0) kullanırsam;
    // 1-) JVM duruyor.
    // 2-) Çalışan Tüm Threadler Sonlanıyor.
    // 3-) Programın işletim sistemindeki processlerde kapanıyor
    public static void processCloseJvmStop(){
        System.out.println("Program başladı. System.exit(0)");
        System.exit(0);
        System.out.println("Bu satır çalışmayacaktır ?");
    }


    public static void processContinueJvmContinue(){
        for (int i = 0; i <=10 ; i++) {
            if(i==5){
                System.out.println("Program başladı. Break;");
                System.out.println("Sadece Döngüden çıkılıyor");
                break;
            }
            System.out.println(i+". sıra");
        }
        System.out.println("Bu satır çalışacak");
    }

    public static void main(String[] args) {
        // System
        processContinueJvmContinue();
        processCloseJvmStop();
    
    }
}
