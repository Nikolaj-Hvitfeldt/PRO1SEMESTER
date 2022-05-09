package opg3;

public class WorkingBoy extends Employee {

    public WorkingBoy(String name, String address, int hourlyWage) {
        super(name, address, hourlyWage);
    }

    @Override
    public double weeklySalary() {
        return super.getHourlyWage()*25;
    }
}
