package com.gyanaranjan.ArrayProgram01;


import java.util.Arrays;

public class TwoSumArray{
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no such pair found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7,8,9,0};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        if (result.length == 2) {
            System.out.println(" two numbers: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
