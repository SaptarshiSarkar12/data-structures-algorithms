package arrays.search_algorithms.linear_search.questions;

// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        System.out.println("Max Wealth: " + maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int bankMoney : account) {
                wealth += bankMoney;
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
