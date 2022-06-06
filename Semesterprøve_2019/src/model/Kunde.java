package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kunde {

    private String navn;
    private String mobil;

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return bestillinger;
    }

//    public int bestiltePladserTilForestillingPåDag(Forestilling forestilling, LocalDate dato){
//        int bestiltePladser = 0;
//
//
//    }
}
