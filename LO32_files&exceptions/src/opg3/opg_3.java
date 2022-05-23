package opg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class opg_3 {

    public static void main(String[] args) {

        String fileName = "LO32_files&exceptions/src/opg3/opg3.txt";
        File in = new File(fileName);
        try (PrintWriter writer = new PrintWriter(in)) {
            int number = 100;
            System.out.print("List of odd numbers from 1 to " + number + ": ");
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    writer.println(i);
                    System.out.println(i);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}