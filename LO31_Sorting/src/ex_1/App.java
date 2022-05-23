package ex_1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


        ArrayList<String> test = new ArrayList<>();

        String str1 = "Stalin";
        String str2 = "Putin";
        String str3 = "Mao";
        String str4 = "Lenin";
        String str5 = "Kim Jong Un";

        test.add(str1);
        test.add(str2);
        test.add(str3);
        test.add(str4);
        test.add(str5);

    }
//    public static void bubbleSort(ArrayList<String> arr) {
//        // 'arr' consists of an unsorted part followed by a sorted part
//        // 'i' is the index of the last number in the unsorted part
//        for (int i = arr.size() - 1; i > 0; i--) {
//            // bubble the largest value in arr[0..i] up to arr[i]
//            for (int j = 0; j < i; j++) {
//                if (arr.get(j).compareTo(arr.get(j + 1)){
//                    // swap arr[j] and arr[j+1]
//                    String temp = arr.get(j);
//                    arr.get(j) = arr.get(j + 1);
//                    arr[j + 1] = temp;
//                }
//            }
//        }
    }

