package ex5;

public class Kunde implements Comparable {

    private final String navn;

    public Kunde(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return navn;
    }

    public int compareTo(Kunde k) {
        int nameCompare = navn.compareTo(k.getNavn());
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            return navn.compareTo(k.navn);
        }
    }
}
