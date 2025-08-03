package arrays.search_algorithms.linear_search;

public class Main {
    public static void main(String[] args) {
        int[] nums = {52, 89, 12, 1, 65, 34, 90, -29, -83, -11};
        int target = 90;
        int index = linearSearchReturningIndex(nums, target);
        System.out.println("Index of " + target + " is: " + index);
        boolean isFound = linearSearchReturningBoolean(nums, target);
        System.out.println("Is " + target + " found?: " + isFound);
    }

    // search in the array and return the index of the element if found, otherwise return -1
    private static int linearSearchReturningIndex(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 if the array is null or empty
        }

        // Iterate through each element in the array
        for (int index = 0; index < arr.length; index++) {
            // Check if the current element equals the target
            int element = arr[index];
            if (element == target) {
                return index; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the target is not found in the array
    }

    // Search in the array and return true if the element is found, otherwise return false
    private static boolean linearSearchReturningBoolean(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return false; // Return false if the array is null or empty
        }

        // Iterate through each element in the array
        for (int element : arr) {
            // Check if the current element equals the target
            if (element == target) {
                return true; // Return true if the element is found
            }
        }
        return false; // Return false if the target is not found in the array
    }
}
