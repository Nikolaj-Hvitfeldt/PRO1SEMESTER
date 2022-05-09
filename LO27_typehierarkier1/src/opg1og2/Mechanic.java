package opg1og2;

public class Mechanic extends Person {

    private String registeredYear;
    private int hourlyWage;

    public Mechanic(String name, String address, String registeredYear, int hourlyWage) {
        super(name, address);
        this.registeredYear = registeredYear;
        this.hourlyWage = hourlyWage;

    }

    public int getHourlyWage() {
        return hourlyWage;
    }
    public int weeklySalary(){
        int antal = getHourlyWage()*37;
        return antal;
    }
}
