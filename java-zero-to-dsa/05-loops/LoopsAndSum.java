/** Beginner learning example. Read the README in this folder first. */
public class LoopsAndSum {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            total += i;
        }
        System.out.println("Sum: " + total);
        int remaining = 3;
        while (remaining > 0) {
            System.out.println("Countdown: " + remaining);
            remaining--;
        }
    }
}
