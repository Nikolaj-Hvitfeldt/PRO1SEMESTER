package ex_1;

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

    public void setOwner(Person person) {
        this.person = person;
        person.dogs.add(this);
    }

    public void removeOwner() {
        this.person = person;
        person.dogs.remove(this);
    }

    public Person getOwner() {
        return person;
    }
}
