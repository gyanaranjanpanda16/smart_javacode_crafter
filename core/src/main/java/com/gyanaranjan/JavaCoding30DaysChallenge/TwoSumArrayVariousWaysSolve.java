package com.gyanaranjan.JavaCoding30DaysChallenge;

import java.util.*;

// Two  sum  Arrary program :-
public class TwoSumArrayVariousWaysSolve {
    public static List<int[]> findAllPairs(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        for (int num : nums) {
            int complement = target - num;
            if (numMap.containsKey(complement)) {
                result.add(new int[] {complement, num});
            }
            numMap.put(num, num); // Store the number itself as value
        }
        return result;
    }
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (numMap.containsKey(compliment)) {
                return new int[]{nums[numMap.get(compliment)], nums[i]};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not found such Element ");
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 9, 2};
        int target = 9;
        String s = Arrays.toString(findTwoSum(arr, target));
        System.out.println("-------: By using Map find two sums :---------");
        System.out.println(s);
        System.out.println("----- : By the Map  find two sums Returns List  :------");
        List<int[]> allPairs = findAllPairs(arr, target);
        for(int[] x :allPairs){
            System.out.println("("+x[0] +","+x[1]+")");
        }
        System.out.println("----- : By the For-Loop find two sums :------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 9) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
