package com.hamitmizrak.tutorials._1_week;

public class _06_Math {

    public static void main(String[] args) {
        // NaN: Not A Number
        System.out.println("En küçük: " + Math.min(-300, 10));
        System.out.println("En büyük: " + Math.max(-300, 10));

        System.out.println("Mutlak: " + Math.abs(-7));

        System.out.println("Karekök: " + Math.sqrt(25));
        System.out.println("Karekök: " + Math.sqrt(+25));
        System.out.println("Karekök: " + Math.sqrt(Math.abs(-25)));

        System.out.println("Üslü: " + Math.pow(2,5));

        System.out.println("Alt yuvarla: " + Math.floor(2.9));
        System.out.println("Üste yuvarla: " + Math.ceil(2.1));
        System.out.println("Üste yuvarla: " + Math.ceil(2.00001));
        System.out.println("Ortalama yuvarla: " + Math.round(3.4)); //x>=4 aşağı yuvarla
        System.out.println("Ortalama yuvarla: " + Math.round(3.5)); // x>=5 ve yukarıysa yukarı yuvarla

        System.out.println("PI Sayısı: "+Math.PI);
        System.out.println("E Sayısı: "+Math.E);

        System.out.println("Triginometrik Sinüs: "+ Math.sin(1));
        System.out.println("Triginometrik Sinüs: "+ Math.asin(1));

        System.out.println("Triginometrik Cosinüs: "+ Math.cos(1));
        System.out.println("Triginometrik Tanjant: "+ Math.tan(1));
    }
}
