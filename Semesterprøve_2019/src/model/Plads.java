package model;

public class Plads {

    private int række;
    private int nr;
    private int pris;

    private Bestilling bestilling;

    public Plads(int række, int nr, int pris) {
        this.række = række;
        this.nr = nr;
        this.pris = pris;
    }

    public int getRække() {
        return række;
    }

    public int getNr() {
        return nr;
    }

    public int getPris() {
        return pris;
    }

    public Bestilling getBestilling() {
        return bestilling;
    }
}
