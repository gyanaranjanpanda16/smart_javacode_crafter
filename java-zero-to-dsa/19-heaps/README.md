# 19. Repeatedly take the smallest item

A priority queue serves the most urgent item first; for integers, Java uses the smallest value by default.

## New words

Heap: structure supporting efficient priority removal. peek: inspect the next item without removing it.

## HeapExample

Remove values in increasing order.

Open [HeapExample.java](HeapExample.java). Read these steps alongside the code:

1. Add values in any order.
2. remove retrieves the smallest remaining value.
3. Iteration over a heap is not guaranteed to be sorted; repeated removal is.

From the `java-zero-to-dsa` folder, run:

```sh
java 19-heaps/HeapExample.java
```

Expected output:

```text
10
20
30
```

**Try it yourself:** Use java.util.Collections.reverseOrder() as the constructor comparator to remove the largest first.

**Work and memory:** Each add/remove is O(log n); peek is O(1); storage is O(n).

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../18-trees/README.md) · [Next lesson](../20-graphs/README.md)
