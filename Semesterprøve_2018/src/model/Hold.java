package model;

import java.util.ArrayList;

public class Hold {

    private final String betegnelse;
    private final String holdleder;

    Uddannelse uddannelse; // package visible

    // association 0..* <---->
    private ArrayList<Tutor> tutorer = new ArrayList<>();

    public Hold(String betegnelse, String holdleder) { // package visible
        this.betegnelse = betegnelse;
        this.holdleder = holdleder;
    }

    public String getBetegnelse() {
        return betegnelse;
    }

    public String getHoldleder() {
        return holdleder;
    }

    public ArrayList<Tutor> getTutorer() {
        return tutorer;
    }

    public Uddannelse getUddannelse() {
        return uddannelse;
    }

    public void tilføjTutor(Tutor tutor){
        tutorer.add(tutor);
        tutor.setHold(this);
    }

    public void fjernTutor(Tutor tutor){
        this.tutorer.remove(tutor);
        tutor.hold = null;
    }

    public double arrangementPris(){
        double sum = 0;
        for(Tutor e : this.tutorer){
           sum += e.arrangementsPris();
        }
        return sum;
    }

    public boolean harTidsOverlap(Arrangement arrangement){
        for(Tutor t : this.tutorer ){
            for (Arrangement a : t.getArrangementer()){
                if (arrangement.getDato().isEqual(a.getDato()) && arrangement.getStartTid().isBefore(a.getSlutTid())){
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("%s %s",betegnelse,holdleder);
    }
}
