package controller;

import model.*;
import storage.Storage;

import java.time.LocalDate;

public class Controller {

    public static Festival createFestival(String navn, LocalDate fraDato, LocalDate tilDato) {
        Festival festival = new Festival(navn, fraDato, tilDato);
        Storage.storeFestivaller(festival);
        return festival;
    }

    public static Frivillig createFrivillig(String navn, String mobil, int maksAntalTimer) {
        Frivillig frivillig = new Frivillig(navn, mobil, maksAntalTimer);
        Storage.storeFrivillige(frivillig);
        return frivillig;
    }

    public static FrivilligForening createFrivilligForening(String navn, String mobil, int maksAntalTimer, String foreningsNavn, int antalPersoner) {
        FrivilligForening frivilligForening = new FrivilligForening(navn, mobil, maksAntalTimer, foreningsNavn, antalPersoner);
        Storage.storeFrivilligForeninger(frivilligForening);
        return frivilligForening;
    }

    public static Job createJob(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
        Job job = new Job(kode, beskrivelse, dato, timeHonorar, antalTimer);
        Storage.storeJobs(job);
        return job;
    }

    public static Vagt tagVagt(Job job, Frivillig frivillig, int timer) {
        try {
            if (frivillig.getMaksAntalTimer() >= timer || job.getAntalTimer() <= timer) ;
        } catch (RuntimeException e) {
            System.out.println("Ikke nok ledige timer tilbage!");
            e.printStackTrace();
        }
        Vagt vagt = job.createVagt(timer);
        frivillig.getVagter().add(vagt);
        Storage.storeVagter(vagt);
        return vagt;
    }


    public static void initStorage(){
        Festival northside = createFestival("NorthSide",LocalDate.of(2020,6,4),LocalDate.of(2020,6,6));
        Frivillig f1 =createFrivillig("Jane Jensen","12345677",20);
        Frivillig f2 = createFrivillig("Lone Hansen","78787878",25);
        Frivillig f3 = createFrivillig("Anders Mikkelsen","55555555",10);
        FrivilligForening ff1 = createFrivilligForening("Christian Madsen", "23232323",100,"Erhversakademi Aarhus",40);
        Job j1 = createJob("T1","Rengøring af toilet",LocalDate.of(2020,6,4),100,5);
        Job j2 = createJob("T2","Rengøring af toilet",LocalDate.of(2020,6,4),100,5);
        Job j3 = createJob("T3","Rengøring af toilet",LocalDate.of(2020,6,4),100,5);
        Job j4 =  createJob("T4","Rengøring af toilet",LocalDate.of(2020,6,5),100,5);
        Job j5 = createJob("T5","Rengøring af toilet",LocalDate.of(2020,6,5),100,5);
        Job j6 = createJob("T6","Rengøring af toilet",LocalDate.of(2020,6,5),100,5);
        Job j7 = createJob("T7","Rengøring af toilet",LocalDate.of(2020,6,6),100,5);
        Job j8 = createJob("T8","Rengøring af toilet",LocalDate.of(2020,6,6),100,5);
        Job j9 = createJob("T9","Rengøring af toilet",LocalDate.of(2020,6,6),100,5);
    }
}
