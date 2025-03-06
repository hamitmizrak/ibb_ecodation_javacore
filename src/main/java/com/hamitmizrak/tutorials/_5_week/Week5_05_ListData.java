package com.hamitmizrak.tutorials._5_week;

import java.util.*;

public class Week5_05_ListData {

    public static void arraylistValue(){
        // Diamon operators: 1.7
        List<String> list= new ArrayList<>();
        list.add("java se-1");
        list.add("java me");
        list.add("java ee");
        list.add("java se-2");
        list.add("java se-1");

        System.out.println("Elaman sayısı: "+list.size());
        System.out.println("İlk Eleman: "+list.get(0));
        System.out.println("Son Eleman: "+list.get(4));
        System.out.println("Son Eleman: "+list.get(list.size()-1));
        System.out.println("Boş mu?: "+list.isEmpty());
        System.out.println("İlk Eleman: "+list.get(0));
        //System.out.println("İlk eleman kaldır: "+list.remove(0));
        //System.out.println("İlk eleman kaldır: "+list.removeAll(list));
        if(!list.isEmpty()){
            System.out.println("İlk Eleman: "+list.get(0));
        }

        System.out.println("Hash code: "+list.hashCode());
        System.out.println("contains: "+list.contains("java me"));
        System.out.println("indexOf: "+list.indexOf("java se-1"));
        System.out.println("lastIndexOf: "+list.lastIndexOf("java se-1"));

        // Diziyi Stringe Çevirdi
       String arrayToString= list.toString();

       //
    }

    public static void linkedlistValue(){
        // Diamon operators: 1.7
        List<String> list= new LinkedList<>();
        list.add("java se-1");
        list.add("java me");
        list.add("java ee");
        list.add("java se-2");
        list.add("java se-1");

        System.out.println("Elaman sayısı: "+list.size());
        System.out.println("İlk Eleman: "+list.get(0));
        System.out.println("Son Eleman: "+list.get(4));
        System.out.println("Son Eleman: "+list.get(list.size()-1));
        System.out.println("Boş mu?: "+list.isEmpty());
        System.out.println("İlk Eleman: "+list.get(0));
        //System.out.println("İlk eleman kaldır: "+list.remove(0));
        //System.out.println("İlk eleman kaldır: "+list.removeAll(list));
        if(!list.isEmpty()){
            System.out.println("İlk Eleman: "+list.get(0));
        }

        System.out.println("Hash code: "+list.hashCode());
        System.out.println("contains: "+list.contains("java me"));
        System.out.println("indexOf: "+list.indexOf("java se-1"));
        System.out.println("lastIndexOf: "+list.lastIndexOf("java se-1"));
    }

    public static List<String> dataSet(){
        List<String> list= new ArrayList<>();
        list.add("java se-1");
        list.add("java me");
        list.add("java ee");
        list.add("java se-2");
        list.add("java se-1");
        return  list;
    }

    public static void forEachLoop(){
        List<String> list=dataSet();

        //List<String>  data=list.subList(0,3); //0<=List<=3-1
        //list=list.subList(0,3);

        //Iterative Loop
        System.out.println("\n** ITERATOR FOR********************");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" => ");
        }

        System.out.println("\n** STREAM FOREACH********************");
        //ForEach Loop
        for (String temp : list) {
            System.out.print(temp+" => ");
        }

        System.out.println("\n** ITERATOR ********************");
        //ForEach Loop
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }

        System.out.println("\n** LAMBDA EXPRESSION********************");
        //Lambda Expression Loop
        list.stream().forEach((temp)->{
            System.out.print(temp+" ");
        });

        // Collections
        //Collections.sort(list);
        Collections.reverse(list);
        System.out.println("\n ***");
        System.out.println( Collections.binarySearch(list,"java se-1"));

        System.out.println("\n** METHOD REFERANCES ********************");
        // Method Referans
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        //arraylistValue();
        //linkedlistValue();
        forEachLoop();
    }
}
