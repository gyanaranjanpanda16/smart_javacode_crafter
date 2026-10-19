package com.gyanaranjan.dsa.daily.day20261020.google;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoSum {
    /** Returns two distinct indices, or an empty array if no pair exists.
     * Expected O(n) time and O(n) extra space. Input is unchanged.
     */
    public static int[] twoSum(int[] numbers, int target) {
        Objects.requireNonNull(numbers, "numbers");
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            long complement = (long) target - numbers[i];
            if (complement >= Integer.MIN_VALUE && complement <= Integer.MAX_VALUE) {
                Integer previous = seen.get((int) complement);
                if (previous != null) {
                    return new int[]{previous, i};
                }
            }
            seen.put(numbers[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
        System.out.println(Arrays.toString(twoSum(new int[]{Integer.MAX_VALUE, 1}, Integer.MIN_VALUE)));
    }
}
