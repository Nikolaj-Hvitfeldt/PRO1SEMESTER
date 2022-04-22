package exercises;

import java.util.Scanner;

public class e5_01v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv et tal");
        int tal = scan.nextInt();
        if (tal > 0) {
            System.out.println("du her skrevet " + tal + ", et positivt tal");
        } else if (tal < 0) {
            System.out.println("du har skrevet " + tal + ", et negativt tal");
        } else {
            System.out.println("du har skrevet " + tal + ", et tal som hverken er negativt eller positivt");
        }
    }
}
