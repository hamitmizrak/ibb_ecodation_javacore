package com.hamitmizrak.tutorials._7_common;


import java.util.Random;
import java.util.UUID;

public class _12_Random {

    public static void main(String[] args) {
       // Random
        System.out.println(Math.random()*3+1);
        System.out.println(Math.floor(Math.random()*3+1) );

        Random random=new Random();
        int rnd= random.nextInt(3)+1;
        System.out.println(rnd);

        // UUID
        System.out.println(UUID.randomUUID().toString());

    }
}
