package model;

import java.util.ArrayList;

public class Tutor {

    private String navn;
    private String email;

    Hold hold; // package visible

    private final ArrayList<Arrangement> arrangementer = new ArrayList<>();

    public Tutor(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public ArrayList<Arrangement> getArrangementer() {
        return arrangementer;
    }

    public String getNavn() {
        return navn;
    }

    public void setHold(Hold hold) {
        this.hold = hold;
    }

    public String getEmail() {
        return email;
    }

    public Hold getHold() {
        return hold;
    }

    public double arrangementsPris() {
        double sum = 0;
        for (Arrangement e : this.arrangementer) {
            sum += e.getPris();
        }
        return sum;
    }

    @Override
    public String toString() {
        if (getHold() != null)
            return String.format("%s %s %s", navn, email, hold);
        else return String.format("%s %s", navn, email);
    }
}
