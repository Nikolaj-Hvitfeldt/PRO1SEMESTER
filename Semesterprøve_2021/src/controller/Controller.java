package controller;

import model.Deltagelse;
import model.Fag;
import model.Lektion;
import model.Studerende;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {


    public static Deltagelse createDeltagelse(Studerende studerende) {
        Deltagelse deltagelse = new Deltagelse(studerende);
        return deltagelse;
    }

    public static Studerende createStuderende(String navn, String email){
        Studerende studerende = new Studerende(navn, email);
        Storage.storeStuderende(studerende);
        return studerende;
    }

    public static ArrayList<Studerende> getStuderende(){
        return Storage.getAlleStuderende();
    }

    public static Fag createFag(String navn, String klasse){
        Fag fag = new Fag(navn, klasse);
        Storage.storeFag(fag);
        return fag;
    }

    public static ArrayList<Fag> getFag(){
        return Storage.getAlleFag();
    }

    public static Lektion createLektion(LocalDate dato, LocalTime starTid, String lokale, Fag fag){
        Lektion lektion = new Lektion(dato, starTid, lokale, fag);
        Storage.StoreLektion(lektion);
        return lektion;
    }

    public static ArrayList<Lektion> getLektioner(){
        return Storage.getLektioner();
    }

    public static void initStorage(){

        Studerende s1 = new Studerende("Peter Hansen", "ph@stud.dk");
        Studerende s2 = new Studerende("Tina Jensen", "tj@stud.dk");
        Studerende s3 = new Studerende("Sascha Petersen", "sp@stud.dk");

        Fag f1 = new Fag("PRO1","20S");
        Fag f2 = new Fag("PRO1","20T");
        Fag f3 = new Fag("SU1","20S");

        Lektion l1 = new Lektion(LocalDate.of(2021,2,1),LocalTime.of(8,30),"A1.32",f1);
        Lektion l2 = new Lektion(LocalDate.of(2021,2,1),LocalTime.of(10,30),"A1.32",f1);
        Lektion l3 = new Lektion(LocalDate.of(2021,2,3),LocalTime.of(8,30),"A1.32",f1);
        Lektion l4 = new Lektion(LocalDate.of(2021,2,3),LocalTime.of(10,30),"A1.32",f1);
    }
}

