package homework;

public class BubbleSorterS {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array[0] ; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}

