package ex_3;

import java.awt.*;
import java.util.Locale;

public class opg_3 {
    public static void main(String[] args) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";

        System.out.println(ord1.toUpperCase());
        System.out.println(ord2.toLowerCase());
        System.out.println(ord1 + " " + ord2);

        String lc2=ord2.toLowerCase();
        String ord3=ord1 + " " + lc2;
        System.out.println(ord3);
        System.out.println("Længde af streng: " + ord3.length());
        System.out.println(ord1.substring(0,7));
        System.out.println(ord2.substring(3,7));
        System.out.println(ord3.substring(ord3.length()/2));




    }
}
