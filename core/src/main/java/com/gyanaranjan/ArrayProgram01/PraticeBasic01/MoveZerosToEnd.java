package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0; // Index to track the position to place non-zero elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, move it to the nonZeroIndex position
                nums[nonZeroIndex] = nums[i];
                // Increment the nonZeroIndex to prepare for the next non-zero element
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 7, 0};
        moveZeros(nums);
        System.out.println("Array after moving zeros to end: " + Arrays.toString(nums));
    }
}
