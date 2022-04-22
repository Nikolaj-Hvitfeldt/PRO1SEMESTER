package ex_1b;

public class Dog {
    private String name;
    private int number;

    // association 0..* --> 0..1
    private Person person; // nullable


    public Dog(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name;
    }
}

