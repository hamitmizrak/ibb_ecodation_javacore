package com.hamitmizrak._3_week;

import com.hamitmizrak.utils.SpecialColor;

import java.util.Date;
import java.util.Objects;


/*1. Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi eğer 3 harften fazlaysa geri kalan harflerinin yerine yıldız (*)
 Hamit MIZRAK , Hamit MIZ***(Maskeleme)
 Tip(loop, conditional)*/
//2. İsim birlikte ayarlanırken, isim baş harfi büyük geri kalan küçük olacak şekilde ayarlanabilir mi?
//3. İsim birlikte dönen bir metod oluşturulabilir mi? Hamit Mızrak
//4. Soyisimde noktalama işaretleri olup olmadığını kontrol eden bir doğrulama ekleyebilir miyiz?
//5. İsim veya soyisim boş girildiğinde varsayılan bir değer atanabilir mi?
//6. İsim ve soyisimde sadece harfler olup olmadığını kontrol edebilir miyiz?
//7. Kullanıcıdan isim ve soyismini girerken karakter sınırı koyabilir miyiz?
public class Week3_05_Class_BEAN {

    // Field
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    // Constructor Metot(parametresiz)
    public Week3_05_Class_BEAN() {
        id = 0L;
        name = "isim alanını yazmadınız";
        this.surname = "soyisim alanını yazmadınız";
        this.createdDate = new Date(System.currentTimeMillis());
    }

    // Constructor(parametreli)
    public Week3_05_Class_BEAN(Long id, String name, String surname, Date createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.createdDate = createdDate;
    }

    // Constructor(parametreli)
    public Week3_05_Class_BEAN(String name, String surname) {
        id = 0L;
        this.name = name;
        this.surname = surname;
        this.createdDate = new Date(System.currentTimeMillis());
    }


    // Method
    public String fullName() {
        return id + " " + name.toString() + " " + this.surname + " " + createdDate;
    }

    // toString

    @Override
    public String toString() {
        return "Week3_05_Class_BEAN{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", createdDate=" + createdDate + '}';
    }


    // Equals And HashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Week3_05_Class_BEAN bean = (Week3_05_Class_BEAN) o;
        return Objects.equals(id, bean.id) && Objects.equals(name, bean.name) && Objects.equals(surname, bean.surname) && Objects.equals(createdDate, bean.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, createdDate);
    }

    // Getter And Setter
    // ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    // NAME
    // 2. İsim birlikte ayarlanırken, isim baş harfi büyük geri kalan küçük olacak şekilde ayarlanabilir mi?
    // 4. İsimde noktalama işaretleri olup olmadığını kontrol eden bir doğrulama ekleyebilir miyiz? varsa noktalamadan itibaren silsin
    public String getName() {
        return name;
    }

    // 2. İsim birlikte ayarlanırken, isim baş harfi büyük geri kalan küçük olacak şekilde ayarlanabilir mi?
    // 4. İsimde noktalama işaretleri olup olmadığını kontrol eden bir doğrulama ekleyebilir miyiz? varsa eğer noktalı işaretten sonra gelen harfleri sil
    public void setName(String name) throws IllegalAccessException {
        if (name != null && name.matches(".*[.,!?;:]+.*")) {
            //throw new IllegalAccessException("isimden noktalı işaretler var");
            //System.err.println("isimden noktalı işaretler var");
            System.out.println(SpecialColor.RED + "İsimde noktalama işaretleri var, noktalama işaretinden sonraki harfler silindi" + SpecialColor.RESET);
            name = name.replaceAll("[.,!?;:].*", "");
            System.out.println(name);
        }
        if (name != null && !name.isEmpty()) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            this.name = name;
        }

    }

    // SURNAME
    /*
    1. Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi eğer 3 harften fazlaysa geri kalan harflerinin yerine yıldız (*)
    Hamit MIZRAK , Hamit MIZ***(Maskeleme)
    Tip(loop, conditional)
    */
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {

        if (!name.matches("[a-zA-ZğüşıöçĞÜŞİÖÇ]+")) {
            throw new IllegalArgumentException("İsim sadece harf içermelidir!");
        } else if (surname != null && surname.length() >= 3) {
            //this.surname="MIZ***";
            this.surname = surname.substring(0, 3).toUpperCase() + "*".repeat(surname.length() - 3);

        } else if (surname != null) {
            this.surname = surname.toUpperCase();
        } else {
            this.surname = "";
        }
    }

    // DATE
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    // PSVM
    public static void main(String[] args) throws IllegalAccessException {
        Week3_05_Class_BEAN bean1 = new Week3_05_Class_BEAN();
        bean1.setId(1L);
        bean1.setName("hamit,hamza");
        bean1.setSurname("Mızrak");
        //bean1.setSurname("Mız");
        // System.out.println(SpecialColor.BLUE + bean1.getId() + " " + bean1.getName() + " " + bean1.getSurname() + " " + bean1.getCreatedDate() + SpecialColor.RESET);
        System.out.println(SpecialColor.YELLOW + " " + bean1 + " " + SpecialColor.RESET);

        // System.out.println("#################################################################");
        // Week3_05_Class_BEAN bean2 = new Week3_05_Class_BEAN("Hamit2", "Mızrak222");
        // System.out.println(SpecialColor.YELLOW + " " + bean2 + " " + SpecialColor.RESET);

    }
}
