package com.hamitmizrak.tutorials._7_common;

import java.util.Random;

// Recursive Method
public class _25_4_MultipleArrays {

    private static int[] randomArrayData() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int number = random.nextInt(9) + 1;
            arr[i] = number;
        }
        return arr;
    }

    //private static void randomArrayHandling(int[] dizi){}
    // ... Java Ellipsis
    private static void randomArrayHandling(int... dizi){}

    public static void main(String[] args) {
        int[][] matrix= new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;

        for (int i = 0; i <matrix.length ; i++) {// satır
            for (int j = 0; j <matrix[i].length ; j++) {//sutun
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // resim, video
        byte[] video={1,23,4};

        // java 10
        var deneme=5;
        System.out.println(deneme);
        
    }
}
