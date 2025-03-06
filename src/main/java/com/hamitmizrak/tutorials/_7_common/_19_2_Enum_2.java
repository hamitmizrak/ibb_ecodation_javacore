package com.hamitmizrak.tutorials._7_common;

public class _19_2_Enum_2 {
    // Enum
    enum Days{
    PAZARTESI(1,"pazartesi"),SALI(2,"salı"),CARSAMBA(3,"çarşamba"),PERSEMBE(4,"perşembe"),CUMA(5,"cuma"),CUMARTESI(6,"cumartesi"),PAZAR(7,"pazar");

        // Variables
        private final int key;
        private final String value;

        // parametreli constructor
         private  Days(int key, String value) {
            this.key = key;
            this.value = value;
        }

        // GET
        public int getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    } //end enum

    public static void main(String[] args) {
        Days days= Days.PAZARTESI;
        System.out.println(days);
        System.out.println("SIRA:" + days.ordinal());
        System.out.println("KEY:" + days.getKey());
        System.out.println("VALUE:" + days.getValue());

        String data=Days.PAZARTESI.toString();
        System.out.println(data);

        System.out.println("******************************");
        for( Days temp:  Days.values()){
            System.out.println(temp+" "+ temp.getKey()+"=>"+temp.getValue());
        }
    }

} //end class
