package person;

public class PersonTester {

    public static void main(String[] args) {
        // Ex. 2
        Person p1 = new Person("Ib", 2000, 10, 6);
        p1.printPerson();

        Person p2 = new Person("Putin", 1969,2,2);
        p2.printPerson();
        System.out.println(p2.alcAge(2022,2,1));

        Person p3 = new Person("Rusland",1991,6,10);
        p3.printPerson();
        System.out.println(p3.alcAge(2022,8, 1));

        Person p4 = new Person("Ukraine",1989, 11, 12);
        p4.printPerson();
        System.out.println(p4.alcAge(2022,4,5));

        Person p5 = new Person("Nikolaj",1997,1,24);
        p5.printPerson();
        System.out.println(p5.alcAge(2022,1,25));

    }
}
