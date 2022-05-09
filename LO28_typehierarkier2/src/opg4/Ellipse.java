package opg4;

public class Ellipse extends Figur{

    private int smallRadius;
    private int bigRadius;

    public Ellipse(int xPos, int yPos, int smallRadius, int bigRadius) {
        super(xPos, yPos);
        this.smallRadius = smallRadius;
        this.bigRadius = bigRadius;
    }

    @Override
    public double area() {
        return Math.PI * smallRadius * bigRadius;
    }

    @Override
    public String toString() {
        return "Ellipse" +
    }
}
