package model;


public class Deltagelse {

    private boolean afbud;
    private String begrundelse;

    // association 1 <--> Spiller
    private Spiller spiller;


    public Deltagelse(boolean afbud, String begrundelse, Spiller spiller) {
        this.afbud = afbud;
        this.begrundelse = begrundelse;
        this.spiller = spiller;
    }

    public void setBegrundelse(String begrundelse) {
        this.begrundelse = begrundelse;
    }

    public boolean isAfbud() {
        return afbud;
    }

    public String getBegrundelse() {
        return begrundelse;
    }

    public Spiller getSpiller() {
        return spiller;
    }
}


