package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        System.out.println("Type in an index (0..9): ");
        try (Scanner scanner = new Scanner(System.in)) {
            int index = -1;
            while (index < 0 || index > 9) {
                try {
                    index = scanner.nextInt();
                    if (index >= 10) {
                        System.out.println("Number is above 9. Try again");
                    } else {
                        if (index < 0) {
                            System.out.println("Number is under 0. Try again");
                        } else {
                            System.out.printf("Prime at index %d is %d", index, primes[index]);
                        }
                    }

                } catch (InputMismatchException ex) {
                    System.out.println("You didn't enter a number. Try again");
                    scanner.nextLine();
                }
            }
        }
    }
}
