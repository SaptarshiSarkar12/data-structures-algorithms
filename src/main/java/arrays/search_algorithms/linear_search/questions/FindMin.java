package arrays.search_algorithms.linear_search.questions;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 31, 42, 8};
        System.out.println(findMin(arr));
    }

    // assuming the array is not empty
    // returns the minimum element in the array
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
