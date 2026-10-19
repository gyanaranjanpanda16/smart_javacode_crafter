# 10. Understand how work grows

Compare finding one named book on a known shelf with checking every book in a library. Complexity describes how work grows with input size.

## New words

O(1): constant work. O(n): one pass. O(n²): roughly all pairs. O(log n): repeatedly halve the search. Space: additional memory.

## CountOperations

Count visits in one loop and two nested loops.

Open [CountOperations.java](CountOperations.java). Read these steps alongside the code:

1. Use three items.
2. One loop visits each item once: three visits.
3. Two full nested loops visit every ordered pair: nine visits.
4. For six items, predict six and thirty-six before running.

From the `java-zero-to-dsa` folder, run:

```sh
java 10-complexity/CountOperations.java
```

Expected output:

```text
Single loop: 3
Nested loops: 9
```

**Try it yourself:** Try n = 6. Explain why counting loops alone is not enough when loop bounds differ.

**Work and memory:** First loop O(n); nested loops O(n²); O(1) extra space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../09-objects-and-errors/README.md) · [Next lesson](../11-searching/README.md)
