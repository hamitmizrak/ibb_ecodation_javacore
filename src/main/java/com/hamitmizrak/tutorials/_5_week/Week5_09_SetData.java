package com.hamitmizrak.tutorials._5_week;

import java.util.*;

public class Week5_09_SetData {

    // HASHSET: Tekrarsız veriler
    public static void setHashSet(){
        // Diamon operators: 1.7
        // HashSet, LinkedHashSet, TreeSet
        Set<String> setList= new HashSet<>();
        setList.add("java se-1");
        setList.add("java me");
        setList.add("java ee");
        setList.add("java se-2");
        setList.add("java se-1");

        System.out.println("Elaman sayısı: "+setList.size());
        System.out.println("Boş mu?: "+setList.isEmpty());
        //System.out.println("İlk eleman kaldır: "+setList.remove(0));
        //System.out.println("İlk eleman kaldır: "+setList.removeAll(setList));
        if(!setList.isEmpty()){
        }

        System.out.println("Hash code: "+setList.hashCode());
        System.out.println("contains: "+setList.contains("java me"));

        // Diziyi Stringe Çevirdi
       String arrayToString= setList.toString();

       //
    }

    public static Set<String> hashSetDataSet(){
        Set<String> list= new HashSet<>();
        list.add("java se-1");
        list.add("java me");
        list.add("java ee");
        list.add("java se-2");
        list.add("java se-1");
        return  list;
    }

    public static void forEachLoopHashSet(){
        Set<String>  list=hashSetDataSet();

        //List<String>  data=list.subList(0,3); //0<=List<=3-1
        //list=list.subList(0,3);

       /* System.out.println("\n** STREAM FOREACH********************");
        //ForEach Loop
        for (String temp : list) {
            System.out.print(temp+" => ");
        }*/

        System.out.println("\n** ITERATOR ********************");
        //ForEach Loop
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }

    //////////////////////////////////////////////////////
 // LINKEDHASHSET: Tekrarsız eklediğimiz sırada gösteriliyor
    public static void linkedHashSet(){
        // Diamon operators: 1.7
        Set<String> list= new LinkedHashSet<>();
        list.add("java se-1");
        list.add("java me");
        list.add("java ee");
        list.add("java se-2");
        list.add("java se-1");

        System.out.println("Elaman sayısı: "+list.size());
        System.out.println("Boş mu?: "+list.isEmpty());
        //System.out.println("İlk eleman kaldır: "+list.remove(0));
        //System.out.println("İlk eleman kaldır: "+list.removeAll(list));
        if(!list.isEmpty()){

        }

        System.out.println("Hash code: "+list.hashCode());
        System.out.println("contains: "+list.contains("java me"));
    }
    public static Set<String> linkedHashDataSet(){
        Set<String> list= new LinkedHashSet<>();
        list.add("java se-1");
        list.add("java me");
        list.add("java ee");
        list.add("java se-2");
        list.add("java se-1");
        return  list;
    }

    public static void forEachLoopLinkedHashSet(){
        Set<String> list=linkedHashDataSet();



        System.out.println("\n** LAMBDA EXPRESSION********************");
        //Lambda Expression Loop
        list.stream().forEach((temp)->{
            System.out.print(temp+" ");
        });

        // Collections
        //Collections.sort(list);
       /* Collections.reverse(list);
        System.out.println("\n ***");
        System.out.println( Collections.binarySearch(list,"java se-1"));*/

        System.out.println("\n** METHOD REFERANCES ********************");
        // Method Referans
        list.forEach(System.out::println);
    }

    //////////////////////////////////////////////////////
    // TREESET: Tekrarsız küçükten büyüğe doğru
    public static void treeSet(){
        // Diamon operators: 1.7
        Set<String> list= new TreeSet<>();
        list.add("java se-1");
        list.add("java me");
        list.add("java ee");
        list.add("java se-2");
        list.add("java se-1");

        System.out.println("Elaman sayısı: "+list.size());
        System.out.println("Boş mu?: "+list.isEmpty());
        //System.out.println("İlk eleman kaldır: "+list.remove(0));
        //System.out.println("İlk eleman kaldır: "+list.removeAll(list));
        if(!list.isEmpty()){

        }

        System.out.println("Hash code: "+list.hashCode());
        System.out.println("contains: "+list.contains("java me"));
    }
    public static Set<String> treeDataSet(){
        Set<String> list= new TreeSet<>();
        list.add("java se-1");
        list.add("java me");
        list.add("java ee");
        list.add("java se-2");
        list.add("java se-1");
        return  list;
    }

    public static void forEachLoopTreeSet(){
        Set<String> list=treeDataSet();

        System.out.println("\n** LAMBDA EXPRESSION********************");
        //Lambda Expression Loop
        list.stream().forEach((temp)->{
            System.out.print(temp+" ");
        });

        // Collections
        //Collections.sort(list);
       /* Collections.reverse(list);
        System.out.println("\n ***");
        System.out.println( Collections.binarySearch(list,"java se-1"));*/

        System.out.println("\n** METHOD REFERANCES ********************");
        // Method Referans
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
       // setHashSet();
        //forEachLoopHashSet();
        //forEachLoopLinkedHashSet();
        forEachLoopTreeSet();
    }


}
