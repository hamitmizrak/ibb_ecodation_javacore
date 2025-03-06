package com.hamitmizrak.tutorials._7_common;

// Recursive Method
public class _25_1_Arrays {
    private static String[] arrayData() {
        // 1.YOL
        /*
        String[] data = new String[5];
        data[0] = "Malatya";
        data[1] = "Elazığ";
        data[2] = "Bingöl";
        data[3] = "Bitlis";
        data[4] = "Van";
        */
        String[] data = {"Malatya","Elazığ","Bingöl","Bitlis","Van"};
        System.out.println("Eleman sayısı: "+data.length);
        System.out.println("İlk Eleman : "+data[0]);
        System.out.println("Son Eleman : "+data[3]);
        System.out.println("Son Eleman : "+data[data.length-1]);
        return data;
    }

    // Validation
    // PSVM
    public static void main(String[] args) {
        arrayData();
    }
}
