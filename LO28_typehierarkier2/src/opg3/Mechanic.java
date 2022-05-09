package opg3;

public class Mechanic extends Employee {

    private String graduation;

    public Mechanic(String name, String address, String graduation, int hourlyWage) {
        super(name, address, hourlyWage);
        this.graduation = graduation;


    }
}
