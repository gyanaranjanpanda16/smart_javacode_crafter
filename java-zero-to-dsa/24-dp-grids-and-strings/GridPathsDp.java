/** Beginner learning example. Read the README in this folder first. */
public class GridPathsDp {
    static long paths(int rows, int columns) {
        if (rows < 1 || columns < 1 || rows > 20 || columns > 20) throw new IllegalArgumentException("Use dimensions 1 to 20");
        long[][] dp = new long[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                dp[r][c] = (r == 0 || c == 0) ? 1 : dp[r - 1][c] + dp[r][c - 1];
            }
        }
        return dp[rows - 1][columns - 1];
    }
    public static void main(String[] args) {
        System.out.println(paths(3, 3));
    }
}
