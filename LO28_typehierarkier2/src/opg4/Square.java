package opg4;

public class Square extends Figur{

    private int sideLength;

    public Square(int xPos, int yPos, int sideLength) {
        super(xPos, yPos);
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }
}
