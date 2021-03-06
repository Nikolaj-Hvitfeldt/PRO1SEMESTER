package opg4;

public class Rectangle extends Figur{

    private int side1;
    private int side2;

    public Rectangle(int xPos, int yPos, int side1, int side2) {
        super(xPos, yPos);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1 * side2;
    }
    public String toString() {
        String str = String.format("Rectangle %s 1st side: %d 2nd side: %d", super.toString(), side1, side2);
        return str;
}}
