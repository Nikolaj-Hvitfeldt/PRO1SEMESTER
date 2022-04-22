package ex_2;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] pp = new int[]{2, 2};
        int[] pp2 = new int[]{3, 5};
        int[] pp3 = new int[]{5, 7, 9};
        int[] array1 = new int[5];
        int[] moreArray1 = {4, 6, 7, 2, 3};
        System.out.println(sum(moreArray1));

        double[] arrayDouble = new double[10];
        double[] moreArrayDouble = {1.2, 4.5, 8.9,};
        System.out.println(sumDouble(moreArrayDouble));

        int[] arrayTest = new int[5];
        int[] moreArrayTest = {7, 9, 5, 2, 3};
        System.out.println(Arrays.toString(sumArray(pp, pp2)));
        System.out.println(Arrays.toString(sumArrayUneven(pp2, pp3)));
        System.out.println(hasUneven(pp));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }

    public static double sumDouble(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }

    public static int[] sumArray(int[] a, int[] b) {
        int[] array2 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            sum = a[i] + b[i];
            array2[i] = sum;
        }
        return array2;
    }

    public static int[] sumArrayUneven(int[] a, int[] b) {
        int length = 0;
        if (a.length > b.length) {
            length = a.length;
        } else {
            length = b.length;
        }

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            if (a.length > i) {
                array[i] += a[i];
            }
            if (b.length > i) {
                array[i] += b[i];
            }
        }
        return array;
    }

    public static boolean hasUneven(int[] t) {
        boolean hasUneven = false;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                hasUneven = false;
            } else {
                hasUneven = true;
            }
        } return hasUneven;
    }
}