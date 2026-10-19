# 14. Reuse work across neighbouring ranges

To total several days of sales, reuse totals already calculated instead of adding everything again.

## New words

Prefix sum: total before a position. Window: a consecutive section. long: a wider whole-number type.

## RangeSum

Answer a range-total question using prefix sums.

Open [RangeSum.java](RangeSum.java). Read these steps alongside the code:

1. prefix[0] is zero.
2. prefix[i + 1] stores the total through item i.
3. For inclusive positions left to right, subtract prefix[left] from prefix[right + 1].

From the `java-zero-to-dsa` folder, run:

```sh
java 14-prefix-sums-and-windows/RangeSum.java
```

Expected output:

```text
18
```

**Try it yourself:** Find the total from index 0 to 2. Only use valid inclusive ranges.

**Work and memory:** Build: O(n) time and space. Each later range query: O(1) time.

## FixedWindow

Find the largest total among windows of exactly k values.

Open [FixedWindow.java](FixedWindow.java). Read these steps alongside the code:

1. Add the first k values.
2. Move one place: add the entering value and remove the leaving value.
3. Remember the largest total, even when all values are negative.

From the `java-zero-to-dsa` folder, run:

```sh
java 14-prefix-sums-and-windows/FixedWindow.java
```

Expected output:

```text
9
```

**Try it yourself:** Try all-negative values and k = 1. Why must k be between 1 and the array length?

**Work and memory:** O(n) time; O(1) extra space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../13-collections-and-hashing/README.md) · [Next lesson](../15-linked-lists/README.md)
