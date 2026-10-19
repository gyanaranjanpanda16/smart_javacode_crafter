/** Beginner learning example. Read the README in this folder first. */
public class GraphBfs {
    static int[] distances(int[][] graph, int start) {
        int[] distance = new int[graph.length];
        java.util.Arrays.fill(distance, -1);
        java.util.Queue<Integer> queue = new java.util.ArrayDeque<>();
        distance[start] = 0;
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.remove();
            for (int neighbour : graph[node]) {
                if (distance[neighbour] == -1) {
                    distance[neighbour] = distance[node] + 1;
                    queue.add(neighbour);
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {0, 3}, {0, 3}, {1, 2}, {}};
        System.out.println(java.util.Arrays.toString(distances(graph, 0)));
    }
}
