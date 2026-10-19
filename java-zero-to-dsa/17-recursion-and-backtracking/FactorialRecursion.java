/** Beginner learning example. Read the README in this folder first. */
public class FactorialRecursion {
    static long factorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Use 0 to 20");
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(0));
    }
}
