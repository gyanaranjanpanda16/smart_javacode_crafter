package com.gyanaranjan.ZenCodingRoundQuestions01;


public class MaxProductPair {
    public static int[] maxProductPair(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        if (max1 * max2 > min1 * min2) {
            return new int[]{max1, max2};
        } else {
            return new int[]{min1, min2};
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 3, 6, 7, 0};
        int[] result1 = maxProductPair(arr1);
        System.out.println("Pair with maximum product: " + result1[0] + ", " + result1[1]);

//        int[] arr2 = {-1, -3, -6, -5, 0, 3};
//        int[] result2 = maxProductPair(arr2);
//        System.out.println("Pair with maximum product: " + result2[0] + ", " + result2[1]);
    }
}
