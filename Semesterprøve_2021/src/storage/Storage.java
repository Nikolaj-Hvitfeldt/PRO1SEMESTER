package storage;

import model.Deltagelse;
import model.Fag;
import model.Lektion;
import model.Studerende;

import java.util.ArrayList;

public class Storage {

    private static ArrayList<Fag> alleFag = new ArrayList<>();
    private static ArrayList<Studerende> alleStuderende = new ArrayList<>();
    private static ArrayList<Lektion> lektioner = new ArrayList<>();

    public static ArrayList<Fag> getAlleFag() {
        return alleFag;
    }

    public static void storeFag(Fag fag) {
        alleFag.add(fag);
    }

    public static ArrayList<Studerende> getAlleStuderende() {
        return alleStuderende;
    }

    public static void storeStuderende(Studerende studerende) {
        alleStuderende.add(studerende);
    }

    public static ArrayList<Lektion> getLektioner(){
        return lektioner;
    }

    public static void StoreLektion(Lektion lektion){
        lektioner.add(lektion);
    }
}

