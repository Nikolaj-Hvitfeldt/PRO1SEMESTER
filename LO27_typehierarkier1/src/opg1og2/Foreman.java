package opg1og2;

public class Foreman extends Mechanic{

    private String yearOfPromotion;
    private int weeklyBonusWage;

    public Foreman(String name, String address, String registeredYear, int hourlyWage, String yearOfPromotion, int weeklyBonusWage){
        super(name,address,registeredYear,hourlyWage);
        this.yearOfPromotion = yearOfPromotion;
        this.weeklyBonusWage = weeklyBonusWage;
    }

    public int getWeeklyBonusWage() {
        return weeklyBonusWage;
    }

    public int weeklySalary(){
        int antal = super.weeklySalary() + getWeeklyBonusWage();
        return antal;
    }
}
