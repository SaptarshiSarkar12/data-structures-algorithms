package arrays.search_algorithms.linear_search.questions;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 25, 31, 8, 0, 19};
        int target = 8;
        System.out.println(linearSearchInRange(arr, target, 2, 6));
    }

    private static int linearSearchInRange(int[] arr, int target, int start, int end) {
        if (arr == null || arr.length == 0 || start < 0 || end >= arr.length || start > end) {
            return -1; // Handle invalid input
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index; // Target found, return index
            }
        }
        return -1; // Target not found in the specified range
    }
}
