# 7. Store a row of values

An array is a row of numbered boxes. Its size stays fixed.

## New words

Index: position, starting at 0. length: number of elements. Last valid index: length - 1.

## ArrayBasics

Read, update, and total an array.

Open [ArrayBasics.java](ArrayBasics.java). Read these steps alongside the code:

1. Use index 0 for the first item.
2. Change the second item using index 1.
3. A for-each loop visits each value.

From the `java-zero-to-dsa` folder, run:

```sh
java 07-arrays/ArrayBasics.java
```

Expected output:

```text
First: 70
Count: 3
Total: 245
```

**Try it yourself:** Find the smallest mark. Decide what to do if the array is empty.

**Work and memory:** O(n) time for n marks; O(1) extra space.

## ReverseArray

Reverse an array using two positions.

Open [ReverseArray.java](ReverseArray.java). Read these steps alongside the code:

1. Point left to the first item and right to the last.
2. Swap those two items.
3. Move both positions inward until they meet.

From the `java-zero-to-dsa` folder, run:

```sh
java 07-arrays/ReverseArray.java
```

Expected output:

```text
[4, 3, 2, 1]
```

**Try it yourself:** Try an empty array, a one-item array, and five items.

**Work and memory:** O(n) time; O(1) extra space. This changes the original array.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../06-methods/README.md) · [Next lesson](../08-strings/README.md)
