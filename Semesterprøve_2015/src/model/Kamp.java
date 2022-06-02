package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Kamp {

    private final String sted;
    private final LocalDate dato;
    private final LocalTime tid;

    // association 0..* --> Deltagelse
    private ArrayList<Deltagelse> deltagelser = new ArrayList<>();

     public Kamp(String sted, LocalDate dato, LocalTime tid) { // package visible
        this.sted = sted;
        this.dato = dato;
        this.tid = tid;
    }

    public String getSted() {
        return sted;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getTid() {
        return tid;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return deltagelser;
    }

    public Deltagelse opretDeltagelse(boolean afbud, String begrundelse, Spiller spiller) {
        Deltagelse deltagelse = new Deltagelse(afbud, begrundelse, spiller);
        deltagelser.add(deltagelse);
        return deltagelse;
    }

    public ArrayList<String> afbud(Spiller spiller, Deltagelse deltagelse) {
        ArrayList<String> kampAfbud = new ArrayList<>();
        for ( Deltagelse e : spiller.getDeltagelser()) {
            if (e.equals(spiller.getNavn()) && deltagelse.isAfbud())
                kampAfbud.add(spiller.getNavn() + " " + deltagelse.getBegrundelse());
        }
        return kampAfbud;
    }
}

