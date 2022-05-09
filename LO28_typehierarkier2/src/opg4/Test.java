package opg4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        ArrayList<Figur> figures = new ArrayList<>(List.of(
                new Circle(10, 10, 10),
                new Ellipse(20, 20, 15, 20),
                new Square(40, 40, 5),
                new Rectangle(50, 50, 10, 15)));


        printAllFigures(figures);
        System.out.println();
        System.out.printf("Total Area: %.2f", calcTotalArea(figures));
        System.out.println();
        parallelShifting(figures, 10);
        printAllFigures(figures);
    }

    public static void printAllFigures(ArrayList<Figur> figures) {
        for (Figur e : figures) {
            System.out.println(e.toString());
            System.out.printf("Area: %.2f\n", e.area());
        }
    }

    public static double calcTotalArea(ArrayList<Figur> figures){
       double total = 0;
        for(Figur e : figures){
           total += e.area();
        }
        return total;
    }

    public static void parallelShifting(ArrayList<Figur> figures, int amount){
        for (Figur e : figures){
            e.moveYPos(amount);
            e.moveXPos(amount);
        }
    }
}

