package ex1;

import java.util.ArrayList;

public class DogeTest {

    public static void main(String[] args) {
        Hund h1 = new Hund("Putin", false, 100, DogRace.Race.terrier);
        Hund h2 = new Hund("Stalin", true, 100, DogRace.Race.terrier);
        Hund h3 = new Hund("Mao", false, 200, DogRace.Race.puddel);
        Hund h4 = new Hund("Kim Jong Un", true, 300, DogRace.Race.bokser);
        Hund h5 = new Hund("Makker", false, 500, DogRace.Race.bokser);

        ArrayList<Hund> hunde = new ArrayList<>();
        hunde.add(h1);
        hunde.add(h2);
        hunde.add(h3);
        hunde.add(h4);
        hunde.add(h5);

        System.out.println(samletPris(hunde, DogRace.Race.bokser));
    }
    public static int samletPris(ArrayList<Hund> hunde, DogRace.Race race) {
        int totalpris = 0;
        for (Hund hund : hunde) {
            if (hund.getRace() == race)
                totalpris += hund.getPrice();
        }
        return totalpris;
}}
