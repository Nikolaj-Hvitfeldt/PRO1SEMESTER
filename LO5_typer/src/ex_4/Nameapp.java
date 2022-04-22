package ex_4;

public class Nameapp {
    public static void main(String[] args) {
        Name name1 = new Name("Gilbert","", "Mogens");
        System.out.println(name1.getFirstName());
        System.out.println(name1.getMiddleName());
        System.out.println(name1.getLastName());
        System.out.println(name1.getFullName());
    }
}
