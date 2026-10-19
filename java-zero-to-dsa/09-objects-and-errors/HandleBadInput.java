/** Beginner learning example. Read the README in this folder first. */
public class HandleBadInput {

    public static void main(String[] args) {
        String input = "abc";
        try {
            int age = Integer.parseInt(input);
            System.out.println("Age: " + age);
        } catch (NumberFormatException error) {
            System.out.println("Please enter a whole number.");
        }
    }
}
