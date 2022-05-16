package exercises;

public class App {

    public static void main(String[] args) {

        int[] testArray = {2, 4, 6, 5, 1, 3, 7, 9, 13};
        int[] testArrayAdjacent = {2, 4, 6, 6, 5, 1, 3, 7, 9, 13};
        int[] testArrayCountAdjacent = {3,3,3,3,3,3,3,10,4,2,6,7};


        System.out.println(linearSearchUneven(testArray));
        System.out.println(linearSearchInterval(testArray));
        System.out.println(linearSearchAdjacent(testArrayAdjacent));
        System.out.println(linearSearchCountAdjacent(testArrayCountAdjacent,7));
        System.out.println(linearSearchCountAdjacent(testArrayCountAdjacent,8));

    }

    public static boolean linearSearchUneven(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            int k = arr[i];
            if (k % 2 != 0)
                found = true;
            else
                i++;
        }
        return found;
    }

    public static int linearSearchInterval(int[] arr) {
        int index = -1;
        int i = 0;
        int min = 10;
        int max = 15;
        while (index == -1 && i < arr.length) {
            int k = arr[i];
            if (k >= min && k <= max) {
                index = k;
            } else
                i++;
        }
        return index;
    }

    public static boolean linearSearchAdjacent(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            int k = arr[i];
            if (k == arr[i + 1])
                found = true;
            else
                i++;
        }
        return found;
    }

    public static boolean linearSearchCountAdjacent(int[] arr, int n) {
        boolean found = false;
        int i = 0;
        int counter = 1;
        while (!found && i < arr.length - 1) {
            int k = arr[i];
            if (k == arr[i + 1]) {
                counter++;
                i++;
                if (counter == n){
                    found = true;
                }
            } else
            i++;
        }
        return found;
    }
}

