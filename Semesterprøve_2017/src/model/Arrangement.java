package model;

import java.util.ArrayList;

public class Arrangement {

    private String navn;
    private boolean offentlig;

    // association -->0..1
    private final ArrayList<Reservation> reservationer = new ArrayList<>();

     public Arrangement(String navn, boolean offentlig) {
        this.navn = navn;
        this.offentlig = offentlig;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public boolean isOffentlig() {
        return offentlig;
    }

    public void setOffentlig(boolean offentlig) {
        this.offentlig = offentlig;
    }
    public int antalReserveredePladser(){
        int antalpladser=0;
        for (Reservation reservation : reservationer){
            reservation.getPladser().size();
            antalpladser++;
        }
        return antalpladser;
    }
}
