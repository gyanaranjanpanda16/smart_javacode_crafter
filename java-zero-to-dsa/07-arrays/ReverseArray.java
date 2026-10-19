/** Beginner learning example. Read the README in this folder first. */
public class ReverseArray {
    static void reverse(int[] values) {
        int left = 0, right = values.length - 1;
        while (left < right) {
            int saved = values[left];
            values[left] = values[right];
            values[right] = saved;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        reverse(values);
        System.out.println(java.util.Arrays.toString(values));
    }
}
