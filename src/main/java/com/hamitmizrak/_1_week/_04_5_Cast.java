package com.hamitmizrak._1_week;

public class _04_5_Cast {

    public static void main(String[] args) {

       // 1-) Widening Cast - Implicit Cast(Kapalı) Daha küçük bir türü daha büyük bir veriye dönüştürmek için
        byte cast1Byte = 100; // Küçük olan veriyi
        int cast1Int= cast1Byte; // Büyük olan verinin içine ekledim (Veri kaybı yoktur)
        System.out.println(cast1Int);

        // 2-) Narrowing Cast- Explicit Cast(Açık) Daha büyük bir türü daha küçük bir veriye dönüştürmek için
        int cast2Int=999999999;
        byte cast2Byte= (byte) cast2Int;
        System.out.println(cast2Byte);

        // 3-) char  => Int
        char cast3Char='&';
        int ascii1=cast3Char;
        System.out.println(cast3Char+" harfi ascci olarak karşılığı: "+ascii1);

        int cast3Int=38;
        char ascii2= (char) cast3Int;
        System.out.println(cast3Int+" ascii karşılığı: "+ascii2);

        // 4-) String => int
        String cast4String="10";
        int cast4Int1=Integer.valueOf(cast4String);
        int cast4Int2=Integer.parseInt(cast4String);
        System.out.println(cast4String+20);
        System.out.println(cast4Int1+20);
        System.out.println(cast4Int2+20);

        // 5-) int => String
        int cast5Int=55;
        String cast5String1=String.valueOf(cast5Int);
        String cast5String2=cast5String1.toString();
        System.out.println(cast5String1);
        System.out.println(cast5String2);

    }
}
