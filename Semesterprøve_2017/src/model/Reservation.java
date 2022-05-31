package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservation {

    private LocalDateTime start;
    private LocalDateTime slut;


    // association 0...*
    private final ArrayList<Plads> pladser = new ArrayList<>();

    public Reservation(LocalDateTime start, LocalDateTime slut) {
        this.start = start;
        this.slut = slut;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getSlut() {
        return slut;
    }

    public void setSlut(LocalDateTime slut) {
        this.slut = slut;
    }
    public ArrayList<Plads> getPladser(){
        return pladser;
    }
}
