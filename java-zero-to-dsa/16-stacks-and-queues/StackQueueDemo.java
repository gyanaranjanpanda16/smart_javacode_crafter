/** Beginner learning example. Read the README in this folder first. */
public class StackQueueDemo {

    public static void main(String[] args) {
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack removes: " + stack.pop());
        java.util.Queue<Integer> queue = new java.util.ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        System.out.println("Queue removes: " + queue.remove());
    }
}
