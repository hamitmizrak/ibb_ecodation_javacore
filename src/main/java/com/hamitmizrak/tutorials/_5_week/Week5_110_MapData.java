package com.hamitmizrak.tutorials._5_week;

import java.util.*;

public class Week5_110_MapData {

    private static void hashMapData(){
        Map<String,String> frontendList=new HashMap<>();
        //Map<String,String> frontendList=new LinkedHashMap<>();
        //Map<String,String> frontendList=new TreeMap<>();
        //Map<String,String> frontendList=new Hashtable<>();
        frontendList.put("1","html5");
        frontendList.put("2","css3");
        frontendList.put("3","js");

        // KEY
        for(String key:frontendList.keySet()){
            System.out.println(key+" ");
        }

        // VALUE
        for(String value:frontendList.values()){
            System.out.println(value+" ");
        }

        // KEY-VALUE
        for(String key:frontendList.keySet()){
            System.out.println(key+" => "+frontendList.get(key));
        }

        //
        System.out.println(frontendList.get("1"));
        System.out.println("Size: "+frontendList.size());
        System.out.println("hashCode: "+frontendList.hashCode());
        System.out.println("toString: "+frontendList.toString());

        //System.out.println(frontendList.get("1"));
        //frontendList.remove("1");
        //System.out.println(frontendList.get("1"));
        //frontendList.clear();

        System.out.println("containsKey: "+frontendList.containsKey("1"));
        System.out.println("containsValue: "+frontendList.containsValue("css3"));

        System.out.println("** entrySet().forEach ** ");
        frontendList.entrySet().forEach((temp)->{
            System.out.println(temp);
        });


        System.out.println("** entrySet().forEach ** ");
        frontendList.entrySet().forEach(System.out::println);

        System.out.println("** map Iterator ** ");
        Set<String> setList=frontendList.keySet();
        Iterator iterator=setList.iterator();
        while(iterator.hasNext()){
            System.out.println(frontendList.get(iterator.next()));
        }

        System.out.println("** Map.Entry<String,String> ** ");
        for(Map.Entry<String,String> temp: frontendList.entrySet()){
            System.out.println(temp);
        }
    }

    // PSVM
    public static void main(String[] args) {
        hashMapData();
    } //end psvm
} //end  _6_MapData
