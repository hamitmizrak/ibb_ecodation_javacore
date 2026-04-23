package com.hamitmizrak.tutorials._5_week;

import java.util.Vector;

public class Week5_106_List_Vector {

    // VECTOR
    private static void vectorNoGenericsData(){
        Vector vector= new Vector();
        vector.add("Malatya");
        vector.add(44);
        vector.add("Istanbul");
        vector.add("Ankara");
        vector.add("Sivas");
        vector.add("Sivas");

        System.out.println("Eleman Sayısı:"+vector.size());

        for(   Object temp : vector){
            System.out.print(temp+" ");
        }
    }

    // VECTOR (GENERICS)
    private static void vectorGenericsData(){
        Vector<String> vector= new Vector<String> ();
        vector.add("Malatya");;
        vector.add("Istanbul");
        vector.add("Ankara");
        vector.add("Sivas");
        vector.add("Sivas");

        System.out.println("Eleman Sayısı:"+vector.size());

        for(Object temp : vector){
            System.out.print(temp+" ");
        }
    }

    // VECTOR (SPECIAL SPACE AREA)
    private static void vectorSpecialGenericsData(){
        Vector<String> vector= new Vector<String> (4);
        vector.add("Malatya");;
        vector.add("Istanbul");
        vector.add("Ankara");
        vector.add("Sivas");
        vector.add("Sivas");

        System.out.println("Eleman Sayısı:"+vector.size());

        for(   Object temp : vector){
            System.out.print(temp+" ");
        }
    }

    public static void main(String[] args) {
        //vectorNoGenericsData();
        //vectorGenericsData();
        vectorSpecialGenericsData();
    }
}
