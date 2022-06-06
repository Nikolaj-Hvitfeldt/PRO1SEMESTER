package ex5;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ArrayList<Kunde> kundeListe = new ArrayList<>(List.of(
                new Kunde("Alex"), new Kunde("Bjarne"),
                new Kunde("Casper"), new Kunde("Christian"),
                new Kunde("Erik"), new Kunde("Frank")));

        indsætKunde(kundeListe, new Kunde("Emilie"));
        indsætKunde(kundeListe, new Kunde("Anker"));

        System.out.println(kundeListe);
    }

    public static void indsætKunde(ArrayList<Kunde> kunder, Kunde kunde){
        int i1 = 0;
        boolean found = false;
        while(i1 < kunder.size() && !found){
            if (kunde.compareTo(kunder.get(i1)) < 0){
                kunder.add(i1,kunde);
                found = true;}
            else { i1++;

            }
        }
    }
}

