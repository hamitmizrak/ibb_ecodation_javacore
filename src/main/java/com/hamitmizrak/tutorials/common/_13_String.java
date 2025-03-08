package com.hamitmizrak.tutorials.common;

public class _13_String {

    public static void main(String[] args) {
       // String
        String vocabulary="java ogRENiyorum java ";
        System.out.println(vocabulary);
        System.out.println("Harf Sayısı: "+vocabulary.length());
        System.out.println("Traşlanmış: "+vocabulary.trim().length());

        System.out.println("Büyük karakter: "+vocabulary.toUpperCase());
        System.out.println("Küçük karakter: "+vocabulary.toLowerCase());

        System.out.println("soldan arama: "+vocabulary.indexOf("java"));
        System.out.println("sağdan arama: "+vocabulary.lastIndexOf("java"));

        System.out.println(vocabulary);
        System.out.println(vocabulary.concat("deneme"));
        // Manipülasyon
        vocabulary=vocabulary.concat("deneme");
        System.out.println(vocabulary);

        System.out.println(vocabulary.charAt(1));
        System.out.println(vocabulary.substring(1));
        System.out.println(vocabulary.substring(0,3)); // 0<=X<=3-1

        System.out.println("içerik "+vocabulary.contains("ogRENiyorum"));
        System.out.println("ile mi başladı:" +vocabulary.startsWith("java"));
        System.out.println("ile mi bitti:" +vocabulary.endsWith("deneme"));
        System.out.println("Eşit mi: "+vocabulary.equals("java ogRENiyorum java deneme"));

        System.out.println(vocabulary.replace(vocabulary,"değişti"));

        String[] allData=vocabulary.split(" ");

    }
}
