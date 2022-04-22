package exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class e5_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type first number");
        int tal = scan.nextInt();
        System.out.println("Type second number");
        int tal2 = scan.nextInt();
        System.out.println("Type third numberr");
        int tal3 = scan.nextInt();
        if (tal < tal2 && tal2 < tal3) {
            System.out.println("numbers are in increasing order");
        } else if (tal > tal2 && tal2 > tal3) {
            System.out.println("numbers are in decreasing order");
        }
        else
        {
            System.out.println("numbers are in neither increasing or decreasing order");
        }
        scan.close();
        }
    }
