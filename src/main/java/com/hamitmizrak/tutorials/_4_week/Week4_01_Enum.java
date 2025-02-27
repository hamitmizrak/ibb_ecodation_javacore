package com.hamitmizrak.tutorials._4_week;

public class Week4_01_Enum {
    public static void main(String[] args) {
        EStudentType eStudentType=EStudentType.GRADUATE;
        System.out.println(eStudentType);
        System.out.println(eStudentType.name());
        System.out.println(eStudentType.ordinal());
    }
}
