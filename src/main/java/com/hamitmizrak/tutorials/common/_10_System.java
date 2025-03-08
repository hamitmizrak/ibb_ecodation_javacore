package com.hamitmizrak.tutorials.common;

import java.util.Scanner;

public class _10_System {

    public static void main(String[] args) {
       // System
        System.out.println("Çıktı");
        Scanner scanner=new Scanner(System.in);
        System.out.println(System.currentTimeMillis());
        System.err.println("Hata");
        //System.exit(0);
        //System.gc()

        String javaVersion=System.getProperty("java.version");
        System.out.println("Java Sürümü: "+javaVersion);

    }
}
