package com.hamitmizrak._2_week;


// public class _14_2_SpecialException extends Exception
// public class _14_2_SpecialException extends RuntimeException


public class _14_2_SpecialException extends Exception {

    // Constructor
    public _14_2_SpecialException(String message) {
        super(message);
    }


    // PSVM
    public static void main(String[] args) throws _14_2_SpecialException {
        throw new _14_2_SpecialException("Kendime özel exception");
    }
}
