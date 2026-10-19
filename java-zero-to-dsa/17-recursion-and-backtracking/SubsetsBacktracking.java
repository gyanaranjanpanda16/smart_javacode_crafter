/** Beginner learning example. Read the README in this folder first. */
public class SubsetsBacktracking {
    static void subsets(int[] a, int index, java.util.List<Integer> chosen) {
        if (index == a.length) {
            System.out.println(chosen);
            return;
        }
        subsets(a, index + 1, chosen);
        chosen.add(a[index]);
        subsets(a, index + 1, chosen);
        chosen.remove(chosen.size() - 1);
    }
    public static void main(String[] args) {
        subsets(new int[]{1, 2}, 0, new java.util.ArrayList<>());
    }
}
