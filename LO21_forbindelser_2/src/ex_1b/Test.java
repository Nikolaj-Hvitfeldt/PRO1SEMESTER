package ex_1b;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("Karl", "2402781713", "12345678");

        Dog d1 = new Dog("Speedy",282828);
        Dog d2 = new Dog("Penis", 232323);
        p1.addDog(d1);
        p1.addDog(d2);


        System.out.println(p1.getName() + "'s dogs are " + p1.getDogs());
    }
}
