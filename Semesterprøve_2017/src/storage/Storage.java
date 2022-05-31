package storage;

import model.Arrangement;
import model.Plads;
import model.Reservation;

import java.util.ArrayList;

public class Storage {

    private static final ArrayList<Plads> pladser = new ArrayList<>();
    private static final ArrayList<Arrangement> arrangementer = new ArrayList<>();
    private static final ArrayList<Reservation> reservationer = new ArrayList<>();

    // ------------------------------------------------------------

    public static ArrayList<Plads> getPladser() {
        return pladser;
    }

    public static void storePlads(Plads plads) {
        pladser.add(plads);
    }

    // -----------------------------------------------------------

    public static ArrayList<Arrangement> getArrangement() {
        return arrangementer;
    }

    public static void storeArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);

        // -----------------------------------------------------------
    }

    public static ArrayList<Reservation> getReservationer() {
        return reservationer;
    }

    public static void storeReservation(Reservation reservation) {
        reservationer.add(reservation);
    }
}
