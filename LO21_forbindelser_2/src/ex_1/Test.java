package ex_1;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("Karl", "2402781713", "12345678");

        Dog d1 = new Dog("Speedy",282828);

        d1.setOwner(p1);

        System.out.println(d1.getOwner());
        System.out.println(p1.getDogs());
    }
}
