package ex1;

import java.util.ArrayList;

public class Hund {
    private String name;
    private boolean heritage;
    private int price;
    private DogRace.Race race;

    public Hund(String name, boolean heritage, int price, DogRace.Race race) {
        this.name = name;
        this.heritage = heritage;
        this.price = price;
        this.race = race;
    }

    public int getPrice() {
        return price;
    }

    public DogRace.Race getRace() {
        return race;
    }
}

