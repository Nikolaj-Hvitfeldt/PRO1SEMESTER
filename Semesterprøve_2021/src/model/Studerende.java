package model;

import java.util.ArrayList;

public class Studerende {

    private String navn;
    private String email;

    //Association 0..* <--> model.Deltagelse
    ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Studerende(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return deltagelser;
    }

    public void addDeltagelse(Deltagelse deltagelse){
        deltagelser.add(deltagelse);
        deltagelse.studerende = this;
    }

    public void removeDeltagelse(Deltagelse deltagelse){
        deltagelser.remove(deltagelse);
        deltagelse.studerende = null;
    }


    public int antalFraværendeLektioner(){
        int fraværendeLektioner = 0;
        for (Deltagelse e : deltagelser) {
            if (e.erRegistreretFraværende()){
                fraværendeLektioner++;
            }
        }
        return fraværendeLektioner;
    }
}
