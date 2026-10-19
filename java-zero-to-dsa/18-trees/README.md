# 18. Explore branching information

A tree branches like folders on a computer. A binary tree node has at most two children.

## New words

Root: starting node. Leaf: node with no children. DFS: follow a branch. BFS: visit one level at a time.

## TreeTraversals

Visit a tree in two orders.

Open [TreeTraversals.java](TreeTraversals.java). Read these steps alongside the code:

1. Build root 2 with left child 1 and right child 3.
2. Inorder recursively visits left, node, right.
3. Level order uses a queue to visit nearby nodes first.
4. Inorder is sorted only for a binary search tree, not for every tree.

From the `java-zero-to-dsa` folder, run:

```sh
java 18-trees/TreeTraversals.java
```

Expected output:

```text
[1, 2, 3]
[2, 1, 3]
```

**Try it yourself:** Add a child with value 4 under node 3. Predict both outputs.

**Work and memory:** O(n) time. DFS stack O(h) for height h; BFS queue O(w) for maximum width w. Returned lists use O(n) space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../17-recursion-and-backtracking/README.md) · [Next lesson](../19-heaps/README.md)
