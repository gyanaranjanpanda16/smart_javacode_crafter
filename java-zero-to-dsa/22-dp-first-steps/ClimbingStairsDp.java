/** Beginner learning example. Read the README in this folder first. */
public class ClimbingStairsDp {
    static long ways(int n) {
        if (n < 0 || n > 91) throw new IllegalArgumentException("Use 0 to 91");
        long twoBack = 1, oneBack = 1;
        for (int step = 2; step <= n; step++) {
            long current = oneBack + twoBack;
            twoBack = oneBack;
            oneBack = current;
        }
        return oneBack;
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
