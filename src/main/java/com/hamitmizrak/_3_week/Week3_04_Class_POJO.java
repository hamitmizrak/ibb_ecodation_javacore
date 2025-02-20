package com.hamitmizrak._3_week;

// POJO: Plain Old Java Object
// Sadece fields + getter and setter

import com.hamitmizrak.utils.SpecialColor;

// this: global nesneyi işaret eder,
public class Week3_04_Class_POJO {

    // Field
    private String name;
    private String surname;


    // Getter And Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //  name = _name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public static void main(String[] args) {
        Week3_04_Class_POJO pojo= new Week3_04_Class_POJO();
        pojo.setName("Hamit");
        pojo.setSurname("Mızrak");
        String nameAndSurname=pojo.getName().toString()+" "+pojo.getSurname().toString();
        System.out.println(SpecialColor.BLUE+nameAndSurname+SpecialColor.RESET);
        // Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi eğer 3 harften fazlaysa geri kalan harflerinin yerine (*)
        // Hamit MIZRAK , Hamit MIZ***(Maskeleme)
        // Tip(loop, conditional)
    }
}
