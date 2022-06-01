package model;

import java.util.ArrayList;

public class Frivillig {

    private final String navn;
    private final String mobil;
    private int maksAntalTimer;


    // association 0..* <--> Vagt
    private final ArrayList<Vagt> vagter = new ArrayList<>();

    public Frivillig(String navn, String mobil, int maksAntalTimer) {
        this.navn = navn;
        this.mobil = mobil;
        this.maksAntalTimer = maksAntalTimer;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public int getMaksAntalTimer() {
        return maksAntalTimer;
    }

    public void setMaksAntalTimer(int maksAntalTimer) {
        this.maksAntalTimer = maksAntalTimer;
    }

    public ArrayList<Vagt> getVagter() {
        return vagter;
    }

    public int ledigeTimer(Frivillig frivillig) {
        int ledigeTimer;
        int optagetTimer = 0;
        if (!frivillig.getVagter().isEmpty()) {
            for (Vagt e : frivillig.getVagter()) {
                optagetTimer += e.getTimer();
                ledigeTimer = getMaksAntalTimer() - optagetTimer;
                setMaksAntalTimer(ledigeTimer);
            }
            return getMaksAntalTimer();
        } else return getMaksAntalTimer();
    }
}
