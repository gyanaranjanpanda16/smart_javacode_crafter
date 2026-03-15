package com.gyanaranjan.ArrayProgram01;


public class SubArraySum {

    public static int maxSubarraySum(int[] array) {
        int n = array.length;
        int[] prefixSums = new int[n + 1];
        prefixSums[0] = array[0];
        for (int i = 1; i <= n; i++) {
            prefixSums[i] = prefixSums[i - 1] + array[i - 1];
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            maxSum = Math.max(maxSum, prefixSums[i]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(array));
    }
}