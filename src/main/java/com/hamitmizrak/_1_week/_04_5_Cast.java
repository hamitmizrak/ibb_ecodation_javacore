package com.hamitmizrak._1_week;

public class _04_5_Cast {

    public static void main(String[] args) {

       // 1-) Widening Cast - Implicit Cast
        byte cast1Byte = 100; // Küçük olan veriyi
        int cast1Int= cast1Byte; // Büyük olan verinin içine ekledim (Veri kaybı yoktur)
        System.out.println(cast1Int);

        // 2-) Narrowing CAst- Explicit Cast
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

        // 4-)
    }
}
