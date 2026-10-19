/** Beginner learning example. Read the README in this folder first. */
public class CoinChangeDp {
    static int minimum(int[] coins, int amount) {
        if (amount < 0 || amount > 100000) throw new IllegalArgumentException("Demo amount: 0 to 100000");
        for (int coin : coins) if (coin <= 0) throw new IllegalArgumentException("Coins must be positive");
        int[] dp = new int[amount + 1];
        java.util.Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int total = 1; total <= amount; total++) {
            for (int coin : coins) {
                if (coin <= total) dp[total] = Math.min(dp[total], dp[total - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        System.out.println(minimum(new int[]{1, 3, 4}, 6));
        System.out.println(minimum(new int[]{2}, 3));
    }
}
