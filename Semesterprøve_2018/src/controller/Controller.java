package controller;

import model.Arrangement;
import model.Hold;
import model.Tutor;
import model.Uddannelse;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Controller {


    public static Uddannelse opretUddannelse(String navn) {
        Uddannelse uddannelse = new Uddannelse(navn);
        Storage.storeUddannelse(uddannelse);
        return uddannelse;
    }

    public static ArrayList<Uddannelse> getUddannelse() {
        return Storage.getUddannelser();
    }

    public static Tutor opretTutor(String navn, String email, Hold hold) {
        Tutor tutor = new Tutor(navn, email, hold);
        Storage.storeTutor(tutor);
        return tutor;
    }

    public static ArrayList<Tutor> getTutorer() {
        return Storage.getTutorer();
    }

    public static Arrangement opretArrangement(String titel, LocalDate dato, LocalTime startTid, LocalTime slutTid, int pris) {
        Arrangement arrangement = new Arrangement(titel, dato, startTid, slutTid, pris);
        Storage.storeArrangement(arrangement);
        return arrangement;
    }

    public static ArrayList<Arrangement> getArrangementer() {
        return Storage.getArrangementer();
    }

    public static Hold opretHold(String betegnelse, String holdleder) {
        Hold hold = new Hold(betegnelse, holdleder);
        Storage.storeHold(hold);
        return hold;
    }

    public static ArrayList<Hold> getAlleHold() {
        return Storage.getAlleHold();
    }

    public static void tilføjHoldTilUddannelse(Hold hold, Uddannelse uddannelse) {
        uddannelse.getAlleHold().add(hold);
    }

    /**
     * Tutor må ikke være tilsluttet et hold
     *
     * @param tutor
     * @param hold
     */
    public static void tilføjTutortilHold(Tutor tutor, Hold hold) {
        var gammeltHold = tutor.getHold();
        if (gammeltHold == null) {
            hold.getTutorer().add(tutor);
            tutor.setHold(hold);
        } else throw new RuntimeException("Tutor er allerede tildelt Hold");
    }


    /**
     * pre: Tutor må ikke have et arrangement på tilsvarende tidspunkt.
     * Tuor skal være tilknyttet hold.
     *
     * @param tutor
     * @param arrangement
     */
    public static void tilføjArrangementTilTutor(Arrangement arrangement, Tutor tutor) {
        if (!tutor.getHold().harTidsOverlap(arrangement)) {
            tutor.getArrangementer().add(arrangement);
        } else {
            throw new RuntimeException("Valgte arrangement overlapper med et allerede eksisterende Arrangement");
        }
    }

    public static ArrayList<Hold> holdUdenTutor(){
        ArrayList<Hold> holdUdenTutor = new ArrayList<>();
        for(Hold e : getAlleHold()){
            if(e.getTutorer().size() == 0){
                holdUdenTutor.add(e);
            }
        }
        return holdUdenTutor;
    }


    public static void initStorage() {

        Uddannelse u1 = opretUddannelse("DMU");
        Uddannelse u2 = opretUddannelse("FINØ");

        Hold h1 = opretHold("1dmE17S", "Margrethe Dybdahl");
        Hold h2 = opretHold("1dmE17T", "Kristian Dorland");
        Hold h3 = opretHold("1dmE17U", "Kell Ørhøj");
        Hold h4 = opretHold("1fiE17B", "Karen Jensen");

        tilføjHoldTilUddannelse(h1, u1);
        tilføjHoldTilUddannelse(h2, u1);
        tilføjHoldTilUddannelse(h3, u1);
        tilføjHoldTilUddannelse(h4, u2);

        Tutor t1 = opretTutor("Ander Hansen", "aaa@students.eaaa.dk", null);
        Tutor t2 = opretTutor("Peter Jensen", "ppp@students.eaaa.dk", null);
        Tutor t3 = opretTutor("Niels Madsen", "nnn@students.eaaa.dk", null);
        Tutor t4 = opretTutor("Lone Andersen", "lll@students.eaaa.dk", null);
        Tutor t5 = opretTutor("Mads Miller", "mmm@students.eaaa.dk", null);

        tilføjTutortilHold(t1,h1);
        tilføjTutortilHold(t4,h1);
        tilføjTutortilHold(t2,h3);
        tilføjTutortilHold(t3,h3);
        tilføjTutortilHold(t5,h4);

        Arrangement a1 = opretArrangement("Rusfest", LocalDate.of(2017, 8, 31), LocalTime.of(18, 0), LocalTime.of(23, 30), 250);
        Arrangement a2 = opretArrangement("Fodbold", LocalDate.of(2017, 8, 30), LocalTime.of(14, 0), LocalTime.of(17, 30), 100);
        Arrangement a3 = opretArrangement("Brætspil", LocalDate.of(2017, 8, 29), LocalTime.of(12, 0), LocalTime.of(16, 30), 25);
        Arrangement a4 = opretArrangement("Mindeparken", LocalDate.of(2017, 8, 30), LocalTime.of(18, 0), LocalTime.of(22, 0), 25);

        tilføjArrangementTilTutor(a1,t1);
        tilføjArrangementTilTutor(a1,t2);
        tilføjArrangementTilTutor(a1,t5);
        tilføjArrangementTilTutor(a2,t3);
        tilføjArrangementTilTutor(a3,t3);
        tilføjArrangementTilTutor(a3,t4);
        tilføjArrangementTilTutor(a4,t5);
        tilføjArrangementTilTutor(a4,t1);
    }
}


