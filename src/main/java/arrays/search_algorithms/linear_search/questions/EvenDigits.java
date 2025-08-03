package arrays.search_algorithms.linear_search.questions;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {14, 567, 89, 67, 1245, 890};
        System.out.println("Number of nums with even digits: " + findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains even digit
    static boolean even(int num) {
        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
    }

    // optimized way to find number of digits
    static int digits2(int num) {
        if (num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // Count the number of digits in a number
    static int digits(int num) {
        if (num < 0) {
            num *= -1;
        } else if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
