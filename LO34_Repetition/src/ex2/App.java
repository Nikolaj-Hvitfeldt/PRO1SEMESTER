package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println(lineFileSearchPerson("personer.txt", "Hansen"));

    }

    public static String lineFileSearchPerson(String fileName, String target) {
        String str = "";
        File in = new File("LO34_Repetition/src/ex2/" + fileName);
        boolean found = false;
        try (Scanner scanner = new Scanner(in)) {
            while (!found && scanner.hasNext()) {
                String[] k = scanner.nextLine().split(" ");
                if (k[2].equals(target)) {
                    found = true;
                    str = k[1] + " " + k[2];
                    return str;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return str;
    }
}

