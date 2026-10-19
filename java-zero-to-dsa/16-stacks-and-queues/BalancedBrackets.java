/** Beginner learning example. Read the README in this folder first. */
public class BalancedBrackets {
    static boolean valid(String text) {
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        for (char c : text.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (c != ')' && c != ']' && c != '}') return false;
                if (stack.isEmpty()) return false;
                char opening = stack.pop();
                if ((c == ')' && opening != '(') ||
                    (c == ']' && opening != '[') ||
                    (c == '}' && opening != '{')) return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(valid("([])"));
        System.out.println(valid("([)]"));
    }
}
