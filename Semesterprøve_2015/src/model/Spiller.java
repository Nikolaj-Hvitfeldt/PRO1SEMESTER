package model;

import java.util.ArrayList;

public class Spiller {

    private final String navn;
    private final int årgang;

    // association 0..*  <--> Deltagelse
    private ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Spiller(String navn, int årgang) {
        this.navn = navn;
        this.årgang = årgang;
    }

    public String getNavn() {
        return navn;
    }

    public int getÅrgang() {
        return årgang;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return deltagelser;
    }

    public double kampHonorar(Spiller spiller) {
        double totalHonorar = 0;
        for (Deltagelse d : spiller.getDeltagelser()) {
            if (!d.isAfbud()) {
                totalHonorar++;
            }
        }
        return totalHonorar * 10;
    }
}
