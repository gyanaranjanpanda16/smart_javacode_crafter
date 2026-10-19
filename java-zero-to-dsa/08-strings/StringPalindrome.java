/** Beginner learning example. Read the README in this folder first. */
public class StringPalindrome {
    static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("java"));
        System.out.println("java".equals("java"));
        System.out.println(new StringBuilder("hello").reverse());
    }
}
