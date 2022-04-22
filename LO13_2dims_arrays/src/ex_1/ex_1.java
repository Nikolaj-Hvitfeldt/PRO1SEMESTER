package ex_1;

public class ex_1 {


    public static void main(String[] args) {

        int[][] array = {
                {0, 4, 3, 9, 6},
                {1, 3, 4, 2, 2},
                {3, 3, 1, 0, 1},
                {0, 0, 9, 7, 1},

        };
        print(array);
        System.out.println();
        System.out.println(getValueAt(array, 3, 2));
        setValueAt(array, 3, 2, 3);
        System.out.println(getValueAt(array, 3, 2));
        System.out.println(sumRow(array, 1));
        System.out.println(sumCol(array, 3));
        System.out.println(totalSum(array));
    }

    public static void print(int[][] array) {
        System.out.println("table:");
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static int getValueAt(int[][] array, int row, int col) {

        return array[row][col];
    }

    public static void setValueAt(int[][] array, int row, int col, int value) {
        array[row][col] = value;
    }

    public static int sumRow(int[][] array, int row) {
        int sum = 0;
        for (int col = 0; col < array[row].length; col++) {
            sum += array[row][col];
        }
        return sum;
    }

    public static int sumCol(int[][] array, int col) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            sum += array[row][col];
        }
        return sum;
    }

    public static int totalSum(int[][] array) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
            }
        }
        return sum;
    }
}