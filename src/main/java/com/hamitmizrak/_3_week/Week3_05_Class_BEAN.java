package com.hamitmizrak._3_week;

import com.hamitmizrak.utils.SpecialColor;
import java.util.Date;
import java.util.Objects;


/*1. Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi eğer 3 harften fazlaysa geri kalan harflerinin yerine yıldız (*)
 Hamit MIZRAK , Hamit MIZ***(Maskeleme)
 Tip(loop, conditional)*/
//2. İsim ve soyisim birlikte ayarlanırken, isim baş harfi büyük geri kalan küçük olacak şekilde ayarlanabilir mi?
//3. İsim ve soyisim birlikte dönen bir metod oluşturulabilir mi?
//4. Soyisimde noktalama işaretleri olup olmadığını kontrol eden bir doğrulama ekleyebilir miyiz?
//5. İsim veya soyisim boş girildiğinde varsayılan bir değer atanabilir mi?
//6. İsim ve soyisimde sadece harfler olup olmadığını kontrol edebilir miyiz?
//7. Kullanıcıdan isim ve soyismini girerken karakter sınırı koyabilir miyiz?
//8. İsmi veya soyismi tamamen büyük harfe çevirecek bir metod ekleyebilir miyiz?
public class Week3_05_Class_BEAN {

    // Field
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    // Constructor Metot(parametresiz)
    public Week3_05_Class_BEAN() {
        id=0L;
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
    public Week3_05_Class_BEAN( String name, String surname) {
        id=0L;
        this.name = name;
        this.surname = surname;
        this.createdDate=new Date(System.currentTimeMillis());
    }


    // Method
    public String fullName(){
        return  id+" "+name.toString()+" "+this.surname+" "+createdDate;
    }

    // toString

    @Override
    public String toString() {
        return "Week3_05_Class_BEAN{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createdDate=" + createdDate +
                '}';
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    // PSVM
    public static void main(String[] args) {
        Week3_05_Class_BEAN bean1= new Week3_05_Class_BEAN();
        bean1.setId(1L);
        bean1.setName("Hamit");
        bean1.setSurname("Mızrak");
        System.out.println(SpecialColor.BLUE+ bean1.getId()+" "+bean1.getName()+" "+bean1.getSurname()+" "+bean1.getCreatedDate()+SpecialColor.RESET);
        System.out.println(SpecialColor.YELLOW+" "+bean1+" "+SpecialColor.RESET);

        System.out.println("#################################################################");
        Week3_05_Class_BEAN bean2= new Week3_05_Class_BEAN("Hamit2","Mızrak");
        System.out.println(SpecialColor.YELLOW+" "+bean2+" "+SpecialColor.RESET);

        System.out.println("##################################################################");
        /*1. Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi eğer 3 harften fazlaysa geri kalan harflerinin yerine yıldız (*)
        Hamit MIZRAK , Hamit MIZ***(Maskeleme)
                Tip(loop, conditional)*/
    }
}
