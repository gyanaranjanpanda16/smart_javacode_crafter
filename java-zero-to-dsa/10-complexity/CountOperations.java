/** Beginner learning example. Read the README in this folder first. */
public class CountOperations {

    public static void main(String[] args) {
        int n = 3;
        int single = 0, pairs = 0;
        for (int i = 0; i < n; i++) single++;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) pairs++;
        }
        System.out.println("Single loop: " + single);
        System.out.println("Nested loops: " + pairs);
    }
}
