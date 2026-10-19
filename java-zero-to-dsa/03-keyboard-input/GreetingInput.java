/** Beginner learning example. Read the README in this folder first. */
public class GreetingInput {

    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
