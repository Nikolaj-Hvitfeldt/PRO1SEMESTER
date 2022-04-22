package ex_1;

import java.util.ArrayList;

public class Person {
    private String name;
    private String cpr;
    private String phone;
    final ArrayList<Dog> dogs = new ArrayList<>(); // OBS: package visible

    public ArrayList<Dog> getDogs() {
        return new ArrayList<>(dogs);
    }

    public Person(String name, String cpr, String phone) {
        this.name = name;
        this.cpr = cpr;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name;
    }
}
