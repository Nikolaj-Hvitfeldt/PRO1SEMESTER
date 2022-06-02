package storage;

import model.Kamp;
import model.Spiller;

import java.util.ArrayList;

public class Storage {

    private final static ArrayList<Kamp> kampe = new ArrayList<>();
    private final static ArrayList<Spiller> spillere = new ArrayList<>();

    public static ArrayList<Kamp> getKampe() {
        return kampe;
    }

    public static void storeKampe(Kamp kamp) {
        kampe.add(kamp);

    }

    public static ArrayList<Spiller> getSpillere() {
        return spillere;
    }

    public static void storeSpiller(Spiller spiller) {
        spillere.add(spiller);
    }
}
