/** Beginner learning example. Read the README in this folder first. */
public class LinkedListDemo {
    static class Node {
        int value; Node next;
        Node(int value) { this.value = value; }
    }
    static Node reverse(Node head) {
        Node previous = null;
        while (head != null) {
            Node savedNext = head.next;
            head.next = previous;
            previous = head;
            head = savedNext;
        }
        return previous;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = reverse(head);
        for (Node current = head; current != null; current = current.next) {
            System.out.println(current.value);
        }
    }
}
