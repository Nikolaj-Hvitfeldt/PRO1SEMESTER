package ex6;

public class Kunde implements Comparable<Kunde> {

    private final String navn;
    private final String efterNavn;
    private int alder;

    public Kunde(String navn, String efterNavn, int alder) {
        this.navn = navn;
        this.efterNavn = efterNavn;
        this.alder = alder;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    public int getAlder() {
        return alder;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString(){
        return  "" + navn + " " + efterNavn;
    }

    public int compareTo(Kunde k) {
            int biggest;
            if(efterNavn.compareTo(k.getEfterNavn()) == 0){
                if(navn.compareTo(k.getNavn()) == 0){
                    biggest = alder - k.getAlder();
                }else{
                    biggest = navn.compareTo(k.getNavn());
                }
            }else {
                biggest = efterNavn.compareTo(k.getEfterNavn());
            }
            return biggest;
        }
    }
