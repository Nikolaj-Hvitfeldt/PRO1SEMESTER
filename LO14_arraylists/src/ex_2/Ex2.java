package ex_2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    /**
     * Tests all the methods.
     */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sum1(ints);
        System.out.println("Sum: " + total);

        int total1 = sum(ints);
        System.out.println();
        System.out.println("Sum: " + total1);

        int minimum = minimum(ints);
        System.out.println("Lowest number: " + minimum);

        int max = maximum(ints);
        System.out.println("Highest number: " + max);

        double average = average(ints);
        System.out.println("Average number: " + average);

        int zeroes = zeroes(ints);
        System.out.println("Number og zeroes: " + zeroes);

        System.out.println(evens(ints));

        // Test of sum() method: correct sum is 61.

        // Test of minimum() method: correct minimum is -16.

        // Test of maximum() method: correct maximum is 45.

        // Test of average() method: correct average is 7.625.

        // Test of zeroes() method: correct number of zeroes is 2.

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static int minimum(ArrayList<Integer> list) {
        int min = 0;
        for (int number : list) {
            if (min >= number) {
                min = number;
            }
        }
        return min;
    }

    public static int maximum(ArrayList<Integer> list) {
        int max = 0;
        for (int number : list) {
            if (max <= number) {
                max = number;
            }
        }
        return max;
    }

    public static double average(ArrayList<Integer> list) {
        double average = 0;
        for (double number : list) {
            average += number;
        }
        average = average / list.size();

        return average;

    }
    public static int zeroes(ArrayList<Integer> list) {
       int zeroes = 0;
        for(int numbers : list){
            if(numbers == 0 ){
                zeroes++;
            }
        }
        return zeroes;
    }
    public static ArrayList<Integer> evens(ArrayList<Integer> list){
        ArrayList<Integer> evens = new ArrayList<>();
        for(int number : list){
            if (number % 2 == 0) {
                evens.add(number);
            }
        }
        return evens;
    }
}

