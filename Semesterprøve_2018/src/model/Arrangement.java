package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Arrangement {

    private String titel;
    private LocalDate dato;
    private LocalTime startTid;
    private LocalTime slutTid;
    private double pris;

    private final ArrayList<Tutor> tutorer = new ArrayList<>();

    public Arrangement(String titel, LocalDate dato, LocalTime startTid, LocalTime slutTid, double pris) {
        this.titel = titel;
        this.dato = dato;
        this.startTid = startTid;
        this.slutTid = slutTid;
        this.pris = pris;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public void setStartTid(LocalTime startTid) {
        this.startTid = startTid;
    }

    public LocalTime getSlutTid() {
        return slutTid;
    }

    public void setSlutTid(LocalTime slutTid) {
        this.slutTid = slutTid;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public ArrayList<Tutor> getTutorer() {
        return tutorer;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", titel, dato, startTid, slutTid, pris);
    }
}


