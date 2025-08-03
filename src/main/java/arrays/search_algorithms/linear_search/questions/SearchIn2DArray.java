package arrays.search_algorithms.linear_search.questions;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {80, 14, 15, 63},
            {12, 45, 67},
            {34, 78, 90, 11, 22, 33},
            {44, 54, 62, 83, 59}
        };
        int target = 90;
        int[] result = searchIn2DArray(arr, target);
        System.out.println("Location of " + target + " is: " + Arrays.toString(result));
        System.out.println("Max value in the array is: " + maxIn2DArray(arr));
    }

    private static int[] searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    private static int maxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
}
