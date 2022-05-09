package opg4;

public abstract class Figur {

    private int xPos;
    private int yPos;

    public Figur(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public abstract double area();
}
