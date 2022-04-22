package ex_cars;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White", "AB 12.345");
        System.out.println(myCar.getBrand() + ", " + myCar.getColor());
        System.out.println(myCar.getKm());

        myCar.setKm(5000);
        System.out.println(myCar.getKm());
        System.out.println();

        System.out.println("***************************************");
        Car myCar1 = new Car("Ford Fiesta"," Black","AB 69.420");
        System.out.println(myCar1.getBrand() + "," + myCar1.getColor());
        System.out.println("Registration number: " + myCar1.getRegistrationNumber());
        myCar1.setKm(2000);
        System.out.println("Kilometers now " + myCar1.getKm());
        System.out.println("***************************************");

        Car annsBil = new Car("ferrari","red","696969");
        System.out.println(annsBil.getBrand());
        System.out.println(annsBil.getColor());
    }
}
