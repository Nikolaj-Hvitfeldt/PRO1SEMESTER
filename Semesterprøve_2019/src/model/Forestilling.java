package model;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {

    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return bestillinger;
    }

    public Bestilling opretBestilling(int række, int nr, int pris, LocalDate dato){
        Bestilling bestilling = new Bestilling(række, nr, pris, dato);
        return bestilling;

    }

    public int antalBestiltePladserPåDag(LocalDate dato){
        int bestiltePladser = 0;
        for (Bestilling e : bestillinger){
            if(e.getDato().isEqual(dato))
            bestiltePladser += e.getPladser().size();
        }
        return bestiltePladser;
    }

    public LocalDate succesDate(){
        int flestPladser = 0;
        LocalDate bestDate = null;
        for (Bestilling e : bestillinger){
            if(antalBestiltePladserPåDag(e.getDato())>flestPladser) {
                bestDate = e.getDato();
            }
        }
        return bestDate;
    }
}
