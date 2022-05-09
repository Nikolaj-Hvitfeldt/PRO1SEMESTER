package opg4;


public class Circle extends Figur{

    private int radius;

    public Circle(int xPos, int yPos, int radius) {
        super(xPos, yPos);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}

