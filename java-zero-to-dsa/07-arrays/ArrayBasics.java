/** Beginner learning example. Read the README in this folder first. */
public class ArrayBasics {

    public static void main(String[] args) {
        int[] marks = {70, 80, 90};
        System.out.println("First: " + marks[0]);
        marks[1] = 85;
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Count: " + marks.length);
        System.out.println("Total: " + total);
    }
}
