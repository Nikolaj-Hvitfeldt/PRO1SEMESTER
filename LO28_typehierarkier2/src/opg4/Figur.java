package opg4;

public abstract class Figur {

    private int xPos;
    private int yPos;

    public Figur(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void moveXPos(int xPos) {
        this.xPos += xPos;
    }

    public void moveYPos(int yPos) {
        this.yPos += yPos;
    }

    public abstract double area();

    @Override
    public String toString() {
        String s = String.format("(%d,%d)",xPos, yPos);
        return s;
    }
}
