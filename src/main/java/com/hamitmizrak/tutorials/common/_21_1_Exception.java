package com.hamitmizrak.tutorials.common;



public class _21_1_Exception {

    // Exception: try, catch, finally, throws, throw
    // PSVM
    public static void main(String[] args) throws ArithmeticException, IndexOutOfBoundsException, HamitMizrakException {
        // Object > Trowable > Exception + Error

        System.out.println("1.satır");

        try{
            int number=4/0;
            System.out.println(number);

        }catch (ArithmeticException aritmetic){// ArithmeticException: / by zero
            System.out.println(aritmetic);
            System.err.println(aritmetic);
            aritmetic.getMessage();
            aritmetic.toString();
            aritmetic.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        } finally {
            System.out.println("Zorunlu alandır db.close()");
        }

        System.out.println("son satır");
        throw new HamitMizrakException(" burada bilerek istisna oluşturdum.");

    }
}
