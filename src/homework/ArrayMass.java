package homework;

import java.util.Arrays;

public class ArrayMass {
    public static void main(String[] args) {
        ArrayMass operate = new ArrayMass();
        int[][] board = {
                {3, 4, 7, 10, 25, 60, 70, 99},
                {1, 24, 66, 77, 88, 71, 13, 14},
                {0, 3, 2, 1, 8, 7, 5, 13},
                {4, 3, 2, 1, 0, -4, -11, -15},
                {6, 8, 3, 123, 5, 4, 1, 2,},
        };
        int[][] myArray = new int[5][2];
        operate.minimumInRows(board, myArray);
        operate.largestInRows(board, myArray);
        System.out.println(Arrays.deepToString(myArray));

    }

    public void largestInRows(int[][] matrix, int[][] myArray) {
        int largest;
        for (int row = 0; row < matrix.length; row++) {
            largest = matrix[row][0];
            for (int col = 1; col < matrix[row].length; col++) {
                if (largest < matrix[row][col]) {
                    largest = matrix[row][col];
                }
            }
            myArray[row][1] = largest;
        }
    }

    public void minimumInRows(int[][] matrix, int[][] myArray) {
        int minimum;
        for (int row = 0; row < matrix.length; row++) {
            minimum = matrix[row][0];
            for (int col = 1; col < matrix[row].length; col++) {
                if (minimum > matrix[row][col]) {
                    minimum = matrix[row][col];
                }
            }
            myArray[row][0] = minimum;
        }
    }
}




