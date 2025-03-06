package com.hamitmizrak.tutorials._5_week;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Queue
// Queue: İki Tarafı Açık bir kutudur
// FIFO: First In First Out (İlk Giren İlk Çıkar)
// import java.util.Queue;

public class Week5_08_Queue {

    private static void stackData() {
        Queue<String> queueList = new LinkedList<>();
        queueList.add("1.data");
        queueList.add("2.data");
        queueList.add("3.data");
        queueList.add("4.data");
        queueList.add("5.data");

        System.out.println("Eleman Sayısı: " + queueList.size());
        System.out.println("son data: " + queueList.peek());
        System.out.println("İlk kaydı silinsin Ancak listeden silmesi: " + queueList.element());
        System.out.println("İlk kaydı silinsin Tamamen silinsin: " + queueList.poll());

        System.out.println("** ITERATOR **********************");
        Iterator iterator=queueList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }

        System.out.println("\n** FOREACH **********************");
        // FOR EACH
        for (Object temp:queueList) {
            System.out.print(temp+" ");
        }

        //////////////////////////////////////////////////////
        queueList.remove(0);
        System.out.println("\n** STREAM FOR **********************");
        queueList.stream().forEach(System.out::println);

        queueList.clear();
        System.out.println("\n** STREAM FOR **********************");
        queueList.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        stackData();
    }
}
