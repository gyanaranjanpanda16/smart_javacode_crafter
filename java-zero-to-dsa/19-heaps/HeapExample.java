/** Beginner learning example. Read the README in this folder first. */
public class HeapExample {

    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> heap = new java.util.PriorityQueue<>();
        heap.add(30);
        heap.add(10);
        heap.add(20);
        while (!heap.isEmpty()) System.out.println(heap.remove());
    }
}
