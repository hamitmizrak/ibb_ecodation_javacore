package com.hamitmizrak.tutorials.common;

import java.util.Arrays;
import java.util.Random;

// Recursive Method
public class _25_3_Arrays {
    private static int[] randomArrayData() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int number = random.nextInt(9) + 1;
            arr[i] = number;
        }
        return arr;
    }

    private static void arrayHandling() {
        int[] arr = randomArrayData();

        for (int temp : arr) {
            System.out.print(temp+" ");
        }
        System.out.println("\n**********************");
        //Sıralamak
        Arrays.sort(arr);
        for (int temp : arr) {
            System.out.print(temp+" ");
        }

        int numberData=5;
        int result=Arrays.binarySearch(arr,numberData);
        if(result>0){
            System.out.println("\n"+numberData+" Aradığınız sayı değeri vardır. "+ result+" sırada bulunmaktadır");
        }else{
            System.out.println("Aradığınız "+numberData+ " dizide bulunmamaktadır.");
        }
    }

    private static void cloneArray(){
        int[] originalData= randomArrayData();
        int[] cloneData=originalData.clone();
        for (int temp : cloneData) {
            System.out.print(temp+" ");
        }
    }

    private static void objectArray(){
        Object[] objectArray=new Object[5];
        objectArray[0]=44;
        objectArray[1]="Malatya";
        objectArray[2]=true;
        objectArray[3]=55;
        objectArray[4]="İstanbul";
        for (Object temp : objectArray) {
            System.out.print(temp+" ");
        }
    }

    // Validation
    // PSVM
    public static void main(String[] args) {
        //arrayHandling();
        //cloneArray();
        objectArray();
    }
}
