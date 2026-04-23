package com.hamitmizrak.tutorials.common;

// Recursive Method
public class _25_2_Arrays {
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

    private static void arrayHandling(){
        String[] arr=arrayData();
        // iterative Loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i)+". index "+ (i+1)+" eleman "+arr[i]);
        }
        System.out.println("**********************");
        // For Each
        for(String temp:arr){
            System.out.println(temp);
        }
    }

    // Validation
    // PSVM
    public static void main(String[] args) {
        //arrayData();
        arrayHandling();
    }
}
