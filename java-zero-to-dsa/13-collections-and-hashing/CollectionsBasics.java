/** Beginner learning example. Read the README in this folder first. */
public class CollectionsBasics {

    public static void main(String[] args) {
        java.util.List<String> names = new java.util.ArrayList<>();
        names.add("Asha");
        names.add("Asha");
        names.add("Ravi");
        java.util.Set<String> unique = new java.util.HashSet<>(names);
        java.util.Map<String, Integer> scores = new java.util.HashMap<>();
        scores.put("Asha", 90);
        System.out.println("List size: " + names.size());
        System.out.println("Unique names: " + unique.size());
        System.out.println("Asha score: " + scores.get("Asha"));
    }
}
