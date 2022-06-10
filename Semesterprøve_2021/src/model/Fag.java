package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fag {

    private String navn;
    private String klasse;

    // Association 0..* lektioner
    private ArrayList<Lektion> lektioner = new ArrayList<>();

    public Fag(String navn, String klasse) {
        this.navn = navn;
        this.klasse = klasse;
    }

    public String getNavn() {
        return navn;
    }

    public String getKlasse() {
        return klasse;
    }

    public void addLektion(Lektion lektion) {
        lektioner.add(lektion);
    }

    public ArrayList<Lektion> getLektioner() {
        return lektioner;
    }

    public ArrayList<Studerende> sygdomPåDato(LocalDate dato) {
        ArrayList<Studerende> sygeStuderende = new ArrayList<>();
        for (Lektion e : lektioner) {
            if (e.getDato().isEqual(dato)) {
                for (Deltagelse d : e.getDeltagelser()) {
                    if (d.getStatus() == DeltagerStatus.SYG) {
                        Studerende s = d.getStuderende();
                        sygeStuderende.add(s);
                    }
                }
            }
        }
        return sygeStuderende;
    }

    public Lektion lektionMedMestFravær() {
        int højestFravær = 0;
        int count = 0;
        Lektion pjækkeLektionen = null;
        for (int i = 0; i < lektioner.size(); i++) {
            for (Deltagelse d : lektioner.get(i).getDeltagelser()) {
                while (d.getStuderende() == null) {
                    if (d.erRegistreretFraværende()) {
                        count++;
                    }
                }
                if (count > højestFravær) {
                    højestFravær = count;
                }
                pjækkeLektionen = lektioner.get(i);
            }
        }
        return pjækkeLektionen;
    }
}
