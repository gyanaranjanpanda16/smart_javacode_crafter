# 20. Explore connected places

A graph represents connections, like towns joined by roads. Unlike a tree, it may contain cycles.

## New words

Vertex: a place. Edge: a connection. Adjacency list: neighbours for each vertex. visited: prevents repeated exploration.

## GraphBfs

Find the fewest edges from a starting vertex in an unweighted graph.

Open [GraphBfs.java](GraphBfs.java). Read these steps alongside the code:

1. Store each vertex’s neighbours.
2. Start at distance zero and put the start in a queue.
3. Mark a neighbour when adding it to the queue, not later.
4. Unreached vertices retain distance -1. This is for equal-cost edges.

From the `java-zero-to-dsa` folder, run:

```sh
java 20-graphs/GraphBfs.java
```

Expected output:

```text
[0, 1, 1, 2, -1]
```

**Try it yourself:** Draw the five vertices and connect 4 to 3 in both directions. Predict the new distances. Use valid vertex indices.

**Work and memory:** O(V + E) time; O(V) extra space, excluding the graph.

## GraphDfs

Explore one branch before returning to alternatives.

Open [GraphDfs.java](GraphDfs.java). Read these steps alongside the code:

1. Mark the current node visited.
2. Add it to the traversal order.
3. Recursively visit each unvisited neighbour.
4. The traversal reaches only the start node’s connected component.

From the `java-zero-to-dsa` folder, run:

```sh
java 20-graphs/GraphDfs.java
```

Expected output:

```text
[0, 1, 3, 2]
```

**Try it yourself:** Change the neighbour order and observe the traversal. Large deep graphs may need an explicit stack.

**Work and memory:** O(V + E) time; O(V) extra space including recursion and results.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../19-heaps/README.md) · [Next lesson](../21-greedy/README.md)
