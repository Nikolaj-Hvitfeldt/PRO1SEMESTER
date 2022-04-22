package exercises;

public class e5_01 {
    public static void main(String[] args) {
        int number = -20;
        if(number > 0)
        {
            System.out.println(number + " Er et positivt tal");
        }
        else if(number < 0)
        {
            System.out.println(number + " Er et negativt tal");
        }
        else
        {
            System.out.println(number + " Er hverken positivt eller negativt");
        }
    }
}
