package com.gyanaranjan.dsa.dp;

/** Count ways to climb n stairs taking one or two steps. */
public final class ClimbingStairs {
    private ClimbingStairs() { }

    /** O(n) time / O(n) space. Zero stairs has one way: take no steps. */
    public static long tabulated(int n) {
        validate(n);
        long[] dp = new long[n + 2];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /** O(n) time / O(1) space, retaining only the two previous states. */
    public static long optimized(int n) {
        validate(n);
        long previous = 1;
        long current = 1;
        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    private static void validate(int n) {
        // ways(92) exceeds signed long; reject instead of silently overflowing.
        if (n < 0 || n > 91) {
            throw new IllegalArgumentException("n must be between 0 and 91");
        }
    }
}
