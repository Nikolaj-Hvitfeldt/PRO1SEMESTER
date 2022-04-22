package loop_test;

import java.sql.SQLOutput;

public class Loop_test {
    public static void main(String[] args) {
        int i = 0;
        while (i<5) {
            System.out.println(i + ": Putin");
            i++;
        }
        int k = 0;
        while (k<20) {
            System.out.println("k: " + k);
            k+=3;
        }
        System.out.println("Slutværdi for k: " + k);
        System.out.println();
    }
    {
    int sum = 0;
    int m = 0;
    while (m * m < 100) {
        int square = m * m;
        sum = sum + square;
        m++;
    }
    System.out.println("Sum: " + sum);
}
}
