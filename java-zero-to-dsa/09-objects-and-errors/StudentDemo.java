/** Beginner learning example. Read the README in this folder first. */
public class StudentDemo {
    static class Student {
        private final String name;
        Student(String name) { this.name = name; }
        void introduce() { System.out.println("I am " + name); }
    }
    public static void main(String[] args) {
        Student first = new Student("Asha");
        Student second = new Student("Ravi");
        first.introduce();
        second.introduce();
    }
}
