package ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    findfællesTal("fil1.txt", "fil2.txt", "commonfile.txt");

    }

    /**
     * Laver en sorteret fil i fileNameNy, der indeholder alle
     * heltal, som de to filer har til fælles .
     * Krav: filename1 og filename2 er navne på to sorterede filer.
     */
    public static void findfællesTal(String fileName1, String fileName2, String fileNameNy) {
        File fil1 = new File("LO34_Repetition/src/ex4/" + fileName1);
        File fil2 = new File("LO34_Repetition/src/ex4/" + fileName2);
        File commonfile = new File("LO34_Repetition/src/ex4/" + fileNameNy);
        try (Scanner sc1 = new Scanner(fil1);
             Scanner sc2 = new Scanner(fil2);
             PrintWriter writer = new PrintWriter(commonfile)) {
            int k1 = sc1.nextInt();
            int k2 = sc2.nextInt();
            while (sc1.hasNextInt() && sc2.hasNextInt() && k1 != Integer.MAX_VALUE && k2 != Integer.MAX_VALUE) {
                if (k1 < k2) {
                    k1 = sc1.nextInt();
                } else if (k1 > k2) {
                    k2 = sc2.nextInt();
                } else {
                    writer.println(k1);
                    k1 = sc1.nextInt();
                    k2 = sc2.nextInt();
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}
