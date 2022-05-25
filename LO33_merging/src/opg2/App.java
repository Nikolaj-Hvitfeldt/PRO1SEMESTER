package opg2;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

   int[] arr1 = {2,4,4,4,6,10,12,14};
   System.out.println("arr1 = " + Arrays.toString(arr1));
   int[] arr2 = {1,2,4,4,5,6,9,12,17};
   System.out.println("arr2 = " + Arrays.toString(arr2));

   int[] arr3 = sharedNumbers(arr1,arr2);
   System.out.println("arr3 = " + Arrays.toString(arr3));

    }
    public static int[] sharedNumbers(int[] l1, int[] l2){
        int[] shared = new int[Math.min(l1.length, l2.length)];
        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while( i1 < l1.length && i2 < l2.length) {
            if (l1[i1] < l2[i2]){
                i1++;
            }
            else if (l1[i1] > l2[i2]){
                i2++;
            }
            else {
                shared[j] = l1[i1];
                i1++;
                i2++;
                j++;
            }
        }
        return Arrays.copyOf(shared, j);
    }
}
