package opg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class opg_1 {

    public static void main(String[] args) {

        String fileName = "LO32_files&exceptions/src/opg1/opg2.txt";
        File in = new File(fileName);
        try (Scanner scanner = new Scanner(in)) {
            int sum = 0;
            while (scanner.hasNextInt()) {
                int d = scanner.nextInt();
                System.out.println(d*2);
//                scanner.nextLine();
                sum += d*2;
            }
            System.out.println("Sum is " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}