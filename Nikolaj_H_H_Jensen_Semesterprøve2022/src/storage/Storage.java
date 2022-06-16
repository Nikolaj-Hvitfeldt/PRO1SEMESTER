package storage;

import model.*;

import java.util.ArrayList;

public class Storage {

    private static final ArrayList<Funktion> funktioner = new ArrayList<>();
    private static final ArrayList<Medarbejder> medarbejdere = new ArrayList<>();
    private static final ArrayList<Vagt> vagter = new ArrayList<>();

    // ----------------------------------------------------------------------------------
    public static ArrayList<Funktion> getFunktioner() {
        return funktioner;
    }

    public static void storeFunktion(Funktion funktion) {
        funktioner.add(funktion);
    }
// ----------------------------------------------------------------------------------

    public static ArrayList<Medarbejder> getMedarbejdere() {
        return medarbejdere;
    }

    public static void storeMedarbejder(Medarbejder medarbejder) {
        medarbejdere.add(medarbejder);
    }
// ----------------------------------------------------------------------------------

    public static ArrayList<Vagt> getVagter() {
        return vagter;
    }

    public static void storeVagt(Vagt vagt) {
        vagter.add(vagt);
    }
// ----------------------------------------------------------------------------------

}
