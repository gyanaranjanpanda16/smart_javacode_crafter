package com.gyanaranjan.DsaProgram.ArrayQuestions;

//Given an array of integer elements, find the number of good pairs present in array.
//        A pair (i, j) is called 'good' if arr[i]==arr[j] and i<j.
//        Example:
//        Input: [1,1,2,3,1,2]
//        Output: 4
//        Explanation:
//        {(1,1),(1,1),(1,1),(2,2)}
import java.util.HashMap;
import java.util.Map;

public class GoodPairArray {
    public static int countGoodPairs(int[] nums) {
        // Map to keep track of occurrences of each number
        Map<Integer, Integer> numCount = new HashMap<>();
        int count = 0;
        // Traverse through the array
        for (int num : nums) {
            if (numCount.containsKey(num)) {
                // If this number has occurred before, it forms good pairs with all previous occurrences
                count += numCount.get(num);
                // Increment the count of occurrences for this number
                numCount.put(num, numCount.get(num) + 1);
            } else {
                // First occurrence of this number
                numCount.put(num, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 1, 3, 1, 1, 5, 3, 7, 3};
        int [] nums = {1,1,2,3,1,2};
        int result = countGoodPairs(nums);
        System.out.println("Number of good pairs: " + result);
    }
}

