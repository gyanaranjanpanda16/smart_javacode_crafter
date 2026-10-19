# 11. Find an item

Linear search checks one item at a time. Binary search uses a sorted row and repeatedly discards half.

## New words

Sorted: in order. Search result here: an index, or -1 when missing.

## SearchExamples

Compare linear and binary search.

Open [SearchExamples.java](SearchExamples.java). Read these steps alongside the code:

1. Linear search works even when values are unsorted.
2. Binary search requires ascending sorted input.
3. Compare the middle value and keep only the half that could contain the target.

From the `java-zero-to-dsa` folder, run:

```sh
java 11-searching/SearchExamples.java
```

Expected output:

```text
3
3
-1
```

**Try it yourself:** Try empty input and a missing target. Explain why unsorted input breaks binary search.

**Work and memory:** Linear: O(n) time. Binary: O(log n) time. Both use O(1) extra space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../10-complexity/README.md) · [Next lesson](../12-sorting/README.md)
