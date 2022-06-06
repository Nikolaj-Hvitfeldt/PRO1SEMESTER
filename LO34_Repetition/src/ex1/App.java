package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println(lineFileSearch("TalFIl.txt", 9140));
    }

    public static boolean lineFileSearch(String fileName, int target) {
        boolean found = false;
        File in = new File("LO34_Repetition/src/ex1/" + fileName);
        try (Scanner scanner = new Scanner(in)) {
            while (!found && scanner.hasNext()) {
                if (scanner.nextInt() == target) {
                    return true;
                } else {
                    while (scanner.hasNext()) {
                        scanner.nextLine();
                        if (scanner.nextInt() == target) {
                            return true;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return false;
    }

}
