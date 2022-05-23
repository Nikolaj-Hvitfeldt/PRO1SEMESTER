package opg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class opg_2 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayListTest = new ArrayList<>();

        String fileName = "LO32_files&exceptions/src/opg2/opg2.txt";
        File in = new File(fileName);
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextInt()) {
                int d = scanner.nextInt();
                arrayListTest.add(d);
//                scanner.nextLine();
            }
            Collections.reverse(arrayListTest);
            System.out.println(arrayListTest);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}