/** Beginner learning example. Read the README in this folder first. */
public class FibonacciDp {
    static void check(int n) {
        if (n < 0 || n > 92) throw new IllegalArgumentException("Use 0 to 92");
    }
    static long slow(int n) {
        if (n < 0 || n > 30) throw new IllegalArgumentException("Slow demo: use 0 to 30");
        if (n < 2) return n;
        return slow(n - 1) + slow(n - 2);
    }
    static long memo(int n) {
        check(n);
        long[] cache = new long[n + 1];
        java.util.Arrays.fill(cache, -1);
        return solve(n, cache);
    }
    private static long solve(int n, long[] cache) {
        if (n < 2) return n;
        if (cache[n] != -1) return cache[n];
        cache[n] = solve(n - 1, cache) + solve(n - 2, cache);
        return cache[n];
    }
    static long table(int n) {
        check(n);
        if (n < 2) return n;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(slow(10));
        System.out.println(memo(10));
        System.out.println(table(10));
    }
}
