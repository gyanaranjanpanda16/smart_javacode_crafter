/** Beginner learning example. Read the README in this folder first. */
public class HouseRobberDp {
    static long best(int[] money) {
        long twoBack = 0, oneBack = 0;
        for (int value : money) {
            if (value < 0) throw new IllegalArgumentException("Use nonnegative values");
            long current = Math.max(oneBack, twoBack + value);
            twoBack = oneBack;
            oneBack = current;
        }
        return oneBack;
    }
    public static void main(String[] args) {
        System.out.println(best(new int[]{2, 7, 9, 3, 1}));
    }
}
