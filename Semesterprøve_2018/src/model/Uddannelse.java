package model;

import java.util.ArrayList;

public class Uddannelse {

    private final String navn;

    private final ArrayList<Hold> alleHold = new ArrayList<>();

    public Uddannelse(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<Hold> getAlleHold() {
        return alleHold;
    }

    public Hold opretHold(String betegnelse, String holdleder){
        Hold hold = new Hold(betegnelse, holdleder);
        hold.uddannelse = this;
        alleHold.add(hold);
        return hold;
    }
}
