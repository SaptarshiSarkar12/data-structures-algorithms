package arrays.search_algorithms.linear_search.questions;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Hello programming world!";
        char target = 'p';
        System.out.println(searchUsingForLoop(str, target));
        System.out.println(searchUsingForEachLoop(str, target));
    }

    private static boolean searchUsingForEachLoop(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false; // Handle empty or null strings
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true; // Target character found
            }
        }
        return false; // Target character not found
    }

    private static boolean searchUsingForLoop(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false; // Handle empty or null strings
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true; // Target character found
            }
        }
        return false; // Target character not found
    }
}
