package model;

public class Antal {

    private int antal;

    //Association 1 --> Funktion
    Funktion funktion;

    Antal(int antal, Funktion funktion) { // package visible
        this.antal = antal;
        this.funktion = funktion;
    }

    public int getAntal() {
        return antal;
    }

    public Funktion getFunktion() {
        return funktion;
    }
}
