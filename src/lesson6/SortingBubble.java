package lesson6;

import java.util.Arrays;

public class SortingBubble {
    public static void main(String[] args) {
        int[][] mass = {
                {120, 45, 7456,},
                {789, 5200, 300},
                {0, 2, 1, 43},
                {100, 600, 32, 75, 42},
                {443, 85, 200, 1230, 505}
        };
        for (int[] arr : mass) {
            System.out.print(Arrays.toString(arr) + " ==> ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void sort(int[] array) {
        boolean finish;
        for (int i = 0; i < array.length; i++) {
            finish = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    finish = true;
                }
            }
            if (!finish) {
                return;
            }
        }
    }

}
