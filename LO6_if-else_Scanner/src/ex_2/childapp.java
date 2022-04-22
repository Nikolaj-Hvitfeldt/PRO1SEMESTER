package ex_2;

public class childapp {
    public static void main(String[] args) {
        Child child1 = new Child("Homie",5,false);
        child1.insitution();
        System.out.println(child1.gender());
        System.out.println(child1.team());
    }
}
