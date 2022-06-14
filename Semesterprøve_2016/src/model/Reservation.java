package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {

    private LocalDate dato;
    private LocalTime startTid;

    //Association 1 <--> Medlem
    Medlem medlem;

    //Association 1 <---> Bane
    Bane bane;

   public Reservation(LocalDate dato, LocalTime startTid, Bane bane, Medlem medlem) {
        this.dato = dato;
        this.startTid = startTid;
        this.bane = bane;
        this.medlem = medlem;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public Bane getBane() {
        return bane;
    }

    public Medlem getMedlem(){
        return medlem;
    }

    public void addMedlem(Medlem medlem) {
        this.medlem = medlem;
    }
}
