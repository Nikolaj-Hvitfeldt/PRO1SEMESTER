package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Medlem {

    private String navn;
    private String mobil;
    private String mail;

    //Association 0..* <--> Reservation
    ArrayList<Reservation> bookerReservationer = new ArrayList<>();

    ArrayList<Reservation> makkerReservationer = new ArrayList<>();

    public Medlem(String navn, String mobil, String mail) {
        this.navn = navn;
        this.mobil = mobil;
        this.mail = mail;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public String getMail() {
        return mail;
    }

    public ArrayList<Reservation> getBookerReservationer() {
        return bookerReservationer;
    }

    public ArrayList<Reservation> getMakkerReservationer() {
        return makkerReservationer;
    }

}

