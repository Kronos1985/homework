package lesson6;

import java.util.Arrays;

public class SelectionSorter {
    public static void main(String[] args) {
        int[][] mass = {
                {},
                {1},
                {0, 3, 2, 1},
                {2, 3, 4, 1, 0},
                {-12, -165, 0, 125, 4888, 6978, 11, 45, -45, 248, 275, 645},
        };
        for (int[] arr : mass) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));

        }
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < x) {
                    k = j;
                    x = array[j];
                }
            }
            if (array[i] != x) {
                array[k] = array[i];
                array[i] = x;
            }
        }
    }
}


