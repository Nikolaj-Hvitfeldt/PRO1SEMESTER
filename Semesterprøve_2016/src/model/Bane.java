package model;

import java.util.ArrayList;

public class Bane {

    private int nummer;
    private String baneInfo;

    //Association 0..* <--> Reservation
    ArrayList<Reservation> reservationer = new ArrayList<>();

    public Bane(int nummer, String baneInfo) {
        this.nummer = nummer;
        this.baneInfo = baneInfo;
    }

    public int getNummer() {
        return nummer;
    }

    public String getBaneInfo() {
        return baneInfo;
    }

    public ArrayList<Reservation> getReservationer() {
        return reservationer;
    }
}
