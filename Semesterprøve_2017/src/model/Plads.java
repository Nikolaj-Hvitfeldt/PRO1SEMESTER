package model;

import java.util.ArrayList;

public class Plads {

    private int nr;
    private Omraade område;
    private static int standardTimePris = 50;

    //association <---> 0..*
    private final ArrayList<Reservation> reservationer = new ArrayList<>();
    KonsolPlads konsolPlads;


    public Plads(int nr, Omraade område) {
        this.nr = nr;
        this.område = område;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public Omraade getOmråde() {
        return område;
    }

    public void setOmråde(Omraade område) {
        this.område = område;
    }

    public ArrayList<Reservation> getReservationer() {
        return reservationer;
    }

    public static int getStandardTimePris() {
        return standardTimePris;
    }

    public static void setStandardTimePris(int standardTimePris) {
        Plads.standardTimePris = standardTimePris;
    }

    public double pris(int timer) {
        double totalPris = 0;
        if (this.område == Omraade.Standard) {
            totalPris = getStandardTimePris() * timer;
        } else if (this.område == Omraade.VIP) {
            totalPris = (getStandardTimePris() * timer) * 1.25;
        } else if (this.område == Omraade.Børne) {
            totalPris = (getStandardTimePris() * timer) * 0.80;
        } else if (this.område == Omraade.Turnering) {
            totalPris = (getStandardTimePris() * timer) * 1.10;
        } else if (this.equals(konsolPlads) && konsolPlads.getOmråde().equals(Omraade.VIP)) {
            totalPris = (getStandardTimePris() * timer) * 1.50;
        } else if (this.equals(konsolPlads) && konsolPlads.getOmråde().equals(Omraade.Standard)) {
            totalPris = (getStandardTimePris() * timer) * 1.25;
        } else if (this.equals(konsolPlads) && konsolPlads.getOmråde().equals(Omraade.Turnering)) {
            totalPris = (getStandardTimePris() * timer) * 1.35;
        } else if (this.equals(konsolPlads) && konsolPlads.getOmråde().equals(Omraade.Børne)) {
            totalPris = (getStandardTimePris() * timer) * 0.90;
        }
        return totalPris;
    }
}

