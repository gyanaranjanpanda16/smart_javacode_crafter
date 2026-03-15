package com.gyanaranjan.ZenCodingRoundQuestions01;


public class BananaDistribution {
    public static boolean distribute(int N) {
        // N bananas must be greater than 2 to satisfy the conditions
        if (N <= 2) {
            return false;
        }
        // Check for any integer k such that 2 <= k <= N/2 and N % k == 0
        for (int k = 2; k <= N / 2; k++) {
            if (N % k == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(distribute(2)); // false
        System.out.println(distribute(4)); // true
        System.out.println(distribute(5)); // false
    }
}
