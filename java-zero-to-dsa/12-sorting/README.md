# 12. Put values in order

Insertion sort is like placing each new playing card into its correct position in your hand.

## New words

Sorting: rearranging values into an order. In place: modifies the existing array.

## InsertionSort

Sort a small array from lowest to highest.

Open [InsertionSort.java](InsertionSort.java). Read these steps alongside the code:

1. Treat the first item as already sorted.
2. Save the next item and shift larger items to the right.
3. Insert the saved item into the gap.

From the `java-zero-to-dsa` folder, run:

```sh
java 12-sorting/InsertionSort.java
```

Expected output:

```text
[1, 2, 3, 4, 5]
```

**Try it yourself:** Try duplicates and an already sorted array. For everyday sorting, also try java.util.Arrays.sort(a).

**Work and memory:** Worst-case O(n²) time; best-case O(n); O(1) extra space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../11-searching/README.md) · [Next lesson](../13-collections-and-hashing/README.md)
