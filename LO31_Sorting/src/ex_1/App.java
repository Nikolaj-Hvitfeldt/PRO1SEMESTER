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
        System.out.println(test);

        System.out.println(bubbleSort(test));

    }

    public static ArrayList<String> bubbleSort(ArrayList<String> arr) {
        for (int i = arr.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                // comparing adjacent strings
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    String temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
        }
        return arr;
    }
}


