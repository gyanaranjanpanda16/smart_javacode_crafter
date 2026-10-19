/** Beginner learning example. Read the README in this folder first. */
public class FixedWindow {
    static long maxSum(int[] a, int k) {
        if (k <= 0 || k > a.length) throw new IllegalArgumentException("Invalid window size");
        long sum = 0;
        for (int i = 0; i < k; i++) sum += a[i];
        long best = sum;
        for (int i = k; i < a.length; i++) {
            sum += (long) a[i] - a[i - k];
            best = Math.max(best, sum);
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }
}
