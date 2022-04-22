package ex_2;

public class Test {


    public static void main(String[] args) {


        Car c1 = new Car("69","2010",1000);
        Rental r1 = new Rental(10,"1/2/22",5);

        r1.addCar(c1);
        System.out.println(r1.getPrice(c1));
        System.out.println(c1.getLongestDate());
    }
}
