/** Beginner learning example. Read the README in this folder first. */
public class InsertionSort {
    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 1, 3};
        sort(a);
        System.out.println(java.util.Arrays.toString(a));
    }
}
