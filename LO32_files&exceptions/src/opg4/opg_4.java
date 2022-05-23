package opg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class opg_4 {
    public static void main(String[] args) {
        String fileName = "LO32_files&exceptions/src/opg4/opg4.txt";
        File out = new File(fileName);
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(out)) {
            System.out.println("Type a positive number: (end with -1)");
            boolean finished = false;
            while (!finished) {
                try {
                    int d = scanner.nextInt();
                    if (d == -1) {
                        finished = true;
                    } else if (d < 0) {
                        System.out.println("NOT a positive number!");
                    } else {
                        System.out.println("Typed in: " + d);
                        System.out.println();
                        writer.println(d);

                    }
                } catch (InputMismatchException ex) {
                    System.out.println("NOT a positive number!");
                    System.out.println();
                    scanner.nextLine();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("End of program ");
    }
}