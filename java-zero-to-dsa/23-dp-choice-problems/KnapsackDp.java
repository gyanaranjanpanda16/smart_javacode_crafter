/** Beginner learning example. Read the README in this folder first. */
public class KnapsackDp {
    static long best(int[] weights, int[] values, int capacity) {
        if (capacity < 0 || weights.length != values.length) throw new IllegalArgumentException("Invalid inputs");
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] <= 0 || values[i] < 0) throw new IllegalArgumentException("Invalid item");
        }
        long[][] dp = new long[weights.length + 1][capacity + 1];
        for (int i = 1; i <= weights.length; i++) {
            for (int space = 0; space <= capacity; space++) {
                dp[i][space] = dp[i - 1][space];
                if (weights[i - 1] <= space) {
                    dp[i][space] = Math.max(dp[i][space],
                        values[i - 1] + dp[i - 1][space - weights[i - 1]]);
                }
            }
        }
        return dp[weights.length][capacity];
    }
    public static void main(String[] args) {
        System.out.println(best(new int[]{1, 3, 4}, new int[]{15, 20, 30}, 4));
    }
}
