package controller;

import model.Deltagelse;
import model.Fag;
import model.Lektion;
import model.Studerende;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Controller {


    public static Deltagelse createDeltagelse(Studerende studerende) {
        Deltagelse deltagelse = new Deltagelse(studerende);
        return deltagelse;
    }

    public static Studerende createStuderende(String navn, String email) {
        Studerende studerende = new Studerende(navn, email);
        Storage.storeStuderende(studerende);
        return studerende;
    }

    public static ArrayList<Studerende> getStuderende() {
        return Storage.getAlleStuderende();
    }

    public static Fag createFag(String navn, String klasse) {
        Fag fag = new Fag(navn, klasse);
        Storage.storeFag(fag);
        return fag;
    }

    public static ArrayList<Fag> getFag() {
        return Storage.getAlleFag();
    }

    public static Lektion createLektion(LocalDate dato, LocalTime starTid, String lokale, Fag fag) {
        Lektion lektion = new Lektion(dato, starTid, lokale, fag);
        Storage.StoreLektion(lektion);
        return lektion;
    }

    public static ArrayList<Lektion> getLektioner() {
        return Storage.getLektioner();
    }

    public static void createDeltagelser(Fag fag, Studerende studerende) {
        for (Lektion l : fag.getLektioner()) {
            l.opretDeltagelse(studerende);
        }
    }

    public static ArrayList<Studerende> tilObservation(int grænse) {
        ArrayList<Studerende> studerendeFravær = new ArrayList<>();
        int fraværsLektioner;
        for (Studerende e : getStuderende()) {
            fraværsLektioner = e.antalFraværendeLektioner();
            if (grænse >= fraværsLektioner) {
                studerendeFravær.add(e);
                Collections.sort(studerendeFravær);
            }
        }
        return studerendeFravær;
    }

    public static void initStorage() {

        Studerende s1 = createStuderende("Peter Hansen", "ph@stud.dk");
        Studerende s2 = createStuderende("Tina Jensen", "tj@stud.dk");
        Studerende s3 = createStuderende("Sascha Petersen", "sp@stud.dk");

        Fag f1 = createFag("PRO1", "20S");
        Fag f2 = createFag("PRO1", "20T");
        Fag f3 = createFag("SU1", "20S");

        Lektion l1 = createLektion(LocalDate.of(2021, 2, 1), LocalTime.of(8, 30), "A1.32", f1);
        Lektion l2 = createLektion(LocalDate.of(2021, 2, 1), LocalTime.of(10, 30), "A1.32", f1);
        Lektion l3 = createLektion(LocalDate.of(2021, 2, 3), LocalTime.of(8, 30), "A1.32", f1);
        Lektion l4 = createLektion(LocalDate.of(2021, 2, 3), LocalTime.of(10, 30), "A1.32", f1);

       createDeltagelser(f1,s1);
       createDeltagelser(f1,s2);
       createDeltagelser(f1,s3);
    }
}

