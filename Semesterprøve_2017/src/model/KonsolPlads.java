package model;

public class KonsolPlads extends Plads {

    private String type;

   public KonsolPlads(int nr, Omraade område, String type) {
       super(nr,område);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
