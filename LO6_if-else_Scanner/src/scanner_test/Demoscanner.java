package scanner_test;

import java.util.Scanner;

public class Demoscanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hvad er dit fornavn?");
        String fornavn = scan.nextLine();
        System.out.println("Hvad er dit efternavn?");
        String efternavn = scan.nextLine();
        System.out.println("hvor gammel er du?");
        int alder = scan.nextInt();
        System.out.println(fornavn + " " + efternavn + " " + alder);

        scan.close();
    }
}
