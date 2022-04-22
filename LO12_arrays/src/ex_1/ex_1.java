package ex_1;

import java.util.Arrays;

public class ex_1 {

    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println(Arrays.toString(array));
        System.out.println("");
        System.out.println("");


        int[] a = new int[10];
        int[] moreValues = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};

        System.out.println("a: " + Arrays.toString(moreValues));
        System.out.println("");
        System.out.println("");


        int[] b = new int[10];
        int n = b.length;
        for (int i = 0; i < n; i++) {
            b[i] = i;
        }
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("");
        System.out.println("");

        int[] c = new int[10];
        for (int j = 0; j < n; j++) {
            c[j] = 2 + j * 2;
        }
        System.out.println("c: " + Arrays.toString(c));
        System.out.println("");
        System.out.println("");

        int[] d = new int[10];
        for (int i = 0; i < 10; i++){
            d[i] =  (i+1) * (i +1);

        }
            System.out.println("d: " + Arrays.toString(d));
            System.out.println("");
            System.out.println("");

            int[] e = new int[10];
            for (int i = 0; i<10; i++){
                e[i] = i % 2;}

        System.out.println("e: " + Arrays.toString(e));
        System.out.println("");
        System.out.println("");

        int[] f = new int[10];
        for(int i = 0; i<10; i++){
            f[i] = i % 5;
        }

        System.out.println("f: " + Arrays.toString(f));
        System.out.println("");
        System.out.println("");

        int[] g = new int[10];
        for(int i = 0; i<10; i++){
        g[i]= 2 * i + i%2;}

        System.out.println("g: "+ Arrays.toString(g));
        System.out.println();
        System.out.println();

            }
        }

