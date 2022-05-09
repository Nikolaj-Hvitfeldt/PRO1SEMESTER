package opg3;

public class Foreman extends Employee {

    private String graduationForeman;
    private String graduationMechanic;
    private int weeklyBonusWage;

    public Foreman(String name, String address, String graduationMechanic, String graduationForeman, int hourlyWage, int weeklyBonusWage){
        super(name,address, hourlyWage);
        this.graduationMechanic = graduationMechanic;
        this.graduationForeman = graduationForeman;
        this.weeklyBonusWage = weeklyBonusWage;
    }

    public int getWeeklyBonusWage() {
        return weeklyBonusWage;
    }

    public double weeklySalary(){
        double antal = super.weeklySalary() + getWeeklyBonusWage();
        return antal;
    }
}
