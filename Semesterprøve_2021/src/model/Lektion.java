package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Lektion {

    private LocalDate dato;
    private LocalTime starTid;
    private String lokale;

    //Association 1-->model.Fag
    Fag fag;

    //Association 0..* <--> model.Deltagelse
    ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Lektion(LocalDate dato, LocalTime starTid, String lokale, Fag fag) {
        this.dato = dato;
        this.starTid = starTid;
        this.lokale = lokale;
        this.fag = fag;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return deltagelser;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStarTid() {
        return starTid;
    }

    public String getLokale() {
        return lokale;
    }

    public Fag getFag() {
        return fag;
    }

    public Deltagelse opretDeltagelse(Studerende studerende){
        Deltagelse deltagelse = new Deltagelse(studerende);
        deltagelser.add(deltagelse);
        return deltagelse;
    }
}
