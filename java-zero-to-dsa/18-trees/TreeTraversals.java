/** Beginner learning example. Read the README in this folder first. */
public class TreeTraversals {
    static class Node {
        int value; Node left, right;
        Node(int value) { this.value = value; }
    }
    static void inorder(Node node, java.util.List<Integer> result) {
        if (node == null) return;
        inorder(node.left, result);
        result.add(node.value);
        inorder(node.right, result);
    }
    static java.util.List<Integer> levelOrder(Node root) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        if (root == null) return result;
        java.util.Queue<Node> queue = new java.util.ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            result.add(node.value);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return result;
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        java.util.List<Integer> ordered = new java.util.ArrayList<>();
        inorder(root, ordered);
        System.out.println(ordered);
        System.out.println(levelOrder(root));
    }
}
