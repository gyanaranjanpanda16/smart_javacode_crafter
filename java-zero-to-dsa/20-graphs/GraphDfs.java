/** Beginner learning example. Read the README in this folder first. */
public class GraphDfs {
    static void visit(int[][] graph, int node, boolean[] visited, java.util.List<Integer> order) {
        visited[node] = true;
        order.add(node);
        for (int neighbour : graph[node]) {
            if (!visited[neighbour]) visit(graph, neighbour, visited, order);
        }
    }
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {0, 3}, {0, 3}, {1, 2}};
        java.util.List<Integer> order = new java.util.ArrayList<>();
        visit(graph, 0, new boolean[graph.length], order);
        System.out.println(order);
    }
}
