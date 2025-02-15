package com.hamitmizrak._2_week;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _16_1_Array {

    // Array
    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {
        // String dizisi
        String[] city = new String[6]; // Eleman sayısı:10
        city[0] = "Malatya";
        city[1] = "Elazığ";
        city[2] = "Bingöl";
        city[3] = "Muş";
        city[5] = "Van";
        //System.out.println(city);
        //System.out.println("Eleman sayısı: " + city.length);
        //System.out.println(city[0]);
        //System.out.println("Son Eleman: " + city[6 - 1]);
        System.out.println("Son Eleman: " + city[city.length - 1]);
        return city;
    }

    // Array
    public static String[] arrayMethod2() throws ArrayIndexOutOfBoundsException {
        // String dizisi
        //String[] city = {"Malatya", "Elazığ", "Bingöl", null, "Muş", "Van"}; // Eleman sayısı:10
        String[] city = {"Malatya", "Elazığ", "Bingöl", "Muş", "Van","İstanbul","Ankara","Sivas","Konya","Nevşehir"}; // Eleman sayısı:10
        return city;
    }

    // iterative for döngüsü
    public static void arrayMethod3() {
        String[] city = arrayMethod2();
        // for each
        for (int i = 0; i < city.length; i++) {
            System.out.println(_15_4_SpecialColor.BLUE + city[i] + _15_4_SpecialColor.RESET);
        }
    }

    // Foreach
    public static void arrayMethod4() {
        String[] city = arrayMethod2();
        // for each
        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW + temp + _15_4_SpecialColor.RESET);
        }
    }

    // Arrays.sort() Küçükten büyüğe doğru
    public static void arrayMethod5() {
        String[] city = arrayMethod2();

        // Dizilerde Sıralama (Küçükten Büyüğe Doğru sıralama)
        Arrays.sort(city);

        // for each
        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW + temp + _15_4_SpecialColor.RESET);
        }
    }

    // Arrays.sort() Büyükten küçüğe doğru
    public static void arrayMethod6() {
        String[] city = arrayMethod2();

        // Dizilerde Sıralama (Küçükten Büyüğe Doğru sıralama)
        Arrays.sort(city, Collections.reverseOrder());

        // for each
        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.BLUE + temp + _15_4_SpecialColor.RESET);
        }
    }

    /// ////////////////////////////////////////////////////////////////////
    // Clone, Sort, Binarysearch, forEach
    public static void arrayMethod7() {
        // Original
        String[] originalCity = arrayMethod2();

        // Clone
        String[] cloneCity= Arrays.copyOf(originalCity, originalCity.length);

        // Dizilerde Sıralama (Küçükten Büyüğe Doğru sıralama)
        Arrays.sort(cloneCity);
        //Arrays.sort(cloneCity, Collections.reverseOrder());

        // for each
        for (String temp : cloneCity) {
            System.out.println(_15_4_SpecialColor.BLUE + temp + _15_4_SpecialColor.RESET);
        }

        // Binary Search
        String searchCity="Sivas";
       int index= Arrays.binarySearch(cloneCity,searchCity);
       if(index>=0){
           System.out.println(searchCity+_15_4_SpecialColor.BLUE   +" ili bulunmaktadır"+_15_4_SpecialColor.RESET);
       }else{
           System.out.println(searchCity+_15_4_SpecialColor.RED +" ili yoktur"+_15_4_SpecialColor.RESET);
       }
    }
    /// //////////////////////////////////////////////////////////////
    // Random Number
    public static int randomNumber() {
        Random random = new Random();
        int rndInt = random.nextInt(9) + 1; // 1<=NUMBER<=9
        return rndInt;
    }

    // fill:
    public static void arrayMethod8() {
        int[] number = new int[7];

        //fill: metodu tek bir değeri dizinin tüm elemanlarına atamak için tasarlanmıştır
        Arrays.fill(number, randomNumber());

        // iterative for ile her defasında farklı bir sayı gelsin
        for (int i = 0; i <number.length ; i++) {
            //number[i]=randomNumber(); // (1.YOL)
            Arrays.setAll(number, data -> randomNumber()); // (2.YOL)
        }

        // for each
        for (int temp : number) {
            System.out.println(_15_4_SpecialColor.BLUE + temp + _15_4_SpecialColor.RESET);
        }
    }

    // binary Search, copy

    // PSVM
    public static void main(String[] args) {
        // arrayMethod1();
        // arrayMethod2();
        //arrayMethod3();
        //arrayMethod4();
        //arrayMethod5();
        //arrayMethod6();
        arrayMethod7();
        //arrayMethod8();
    }
} //end class
