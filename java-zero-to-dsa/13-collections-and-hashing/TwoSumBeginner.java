/** Beginner learning example. Read the README in this folder first. */
public class TwoSumBeginner {
    static int[] find(int[] a, int target) {
        java.util.Map<Integer, Integer> seen = new java.util.HashMap<>();
        for (int i = 0; i < a.length; i++) {
            long needed = (long) target - a[i];
            if (needed >= Integer.MIN_VALUE && needed <= Integer.MAX_VALUE) {
                Integer index = seen.get((int) needed);
                if (index != null) return new int[]{index, i};
            }
            seen.put(a[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(find(new int[]{2, 7, 11, 15}, 9)));
    }
}
