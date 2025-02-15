package com.hamitmizrak._2_week;

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

    public static void arrayMethod2() {
        String[] city = arrayMethod1();
        // for each
        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW+temp+_15_4_SpecialColor.RESET);
        }
    }

    // PSVM
    public static void main(String[] args) {
        //arrayMethod1();
        arrayMethod2();
    }
} //end class
