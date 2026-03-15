package com.gyanaranjan.ArrayProgram01;

public class Java8Problem {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = calculateMaxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }

    static int calculateMaxProfit(int[] prices) {
        int minPrice = Integer.MIN_VALUE;
        int maxProfit = 0;
        int n = prices.length; // length: 6

        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {  // prices[i] < minPrice
                minPrice = prices[i];
            } else if (prices[i] - minPrice < maxProfit) {
//                maxProfit = prices[i] - prices[i]; // Bug here
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);

            }
        }

        return maxProfit;
    }
}