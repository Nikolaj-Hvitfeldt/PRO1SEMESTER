package storage;

import model.Arrangement;
import model.Hold;
import model.Tutor;
import model.Uddannelse;

import java.util.ArrayList;

public class Storage {

    private static ArrayList<Uddannelse> uddannelser = new ArrayList<>();
    private static ArrayList<Tutor> tutorer = new ArrayList<>();
    private static ArrayList<Arrangement> arrangementer = new ArrayList<>();
    public static ArrayList<Hold> alleHold = new ArrayList<>();


    public static ArrayList<Uddannelse> getUddannelser() {
        return uddannelser;
    }

    public static void storeUddannelse(Uddannelse uddannelse) {
        uddannelser.add(uddannelse);
    }

    public static ArrayList<Tutor> getTutorer() {
        return tutorer;
    }

    public static void storeTutor(Tutor tutor) {
        tutorer.add(tutor);
    }


    public static ArrayList<Arrangement> getArrangementer() {
        return arrangementer;
    }

    public static void storeArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }

    public static ArrayList<Hold> getAlleHold() {
        return alleHold;
    }

    public static void storeHold(Hold hold) {
        alleHold.add(hold);
    }
}