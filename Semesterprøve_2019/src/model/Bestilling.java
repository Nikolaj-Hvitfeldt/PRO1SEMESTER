package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling extends Plads {

    private LocalDate dato;
    // Association 1 <--> Forestilling
    private Forestilling forestilling;
    // Association 1 <--> Kunde
    private Kunde kunde;
    // Association 0..* <---> Plads
    private final ArrayList<Plads> pladser = new ArrayList<>();

    public Bestilling(int række, int nr, int pris, LocalDate dato) {
        super(række, nr, pris);
        this.dato = dato;
    }

    public LocalDate getDato() {
        return dato;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public ArrayList<Plads> getPladser() {
        return pladser;
    }

    public int samletPris() {
        int sum = 0;
        for (Plads e : pladser) {
            sum += e.getPris();
        }
        return sum;
    }
}
