/** Beginner learning example. Read the README in this folder first. */
public class RangeSum {
    static long[] build(int[] a) {
        long[] prefix = new long[a.length + 1];
        for (int i = 0; i < a.length; i++) prefix[i + 1] = prefix[i] + a[i];
        return prefix;
    }
    public static void main(String[] args) {
        long[] prefix = build(new int[]{2, 4, 6, 8});
        int left = 1, right = 3;
        System.out.println(prefix[right + 1] - prefix[left]);
    }
}
