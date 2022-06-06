package ex6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Kunde[] kundeliste = {
                new Kunde("Alex", "A", 22),
                new Kunde("Bjarne", "B", 85),
                new Kunde("Casper", "C", 1),
                new Kunde("Christian", "D", 55),
                new Kunde("Erik", "E", 22),
                new Kunde("Frank", "F", 25),
                new Kunde("Karen", "G", 37),
                new Kunde("Sarah", "H", 33)};


        indsætKunde(kundeliste, new Kunde("Annika", "I", 23));

        Arrays.sort(kundeliste);

        System.out.println(Arrays.toString(kundeliste));
    }


    public static void indsætKunde(Kunde[] kunder, Kunde kunde) {
        int i = 0;
        boolean foundPlace = false;
        while (i < kunder.length) {
            Kunde k = kunder[i];
            if (k.compareTo(kunde) > 0) {
                kunder[i] = kunde;
                foundPlace = true;
            } else {
                kunder[i] = k;
            }
            i++;
        }
    }
}

