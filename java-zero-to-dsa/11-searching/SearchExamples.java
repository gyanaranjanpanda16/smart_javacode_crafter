/** Beginner learning example. Read the README in this folder first. */
public class SearchExamples {
    static int linear(int[] a, int target) {
        for (int i = 0; i < a.length; i++) if (a[i] == target) return i;
        return -1;
    }
    static int binary(int[] a, int target) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) return mid;
            if (a[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(linear(a, 8));
        System.out.println(binary(a, 8));
        System.out.println(binary(a, 7));
    }
}
