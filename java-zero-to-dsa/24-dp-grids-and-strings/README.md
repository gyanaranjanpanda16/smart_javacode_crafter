# 24. Use a two-dimensional table

A grid stores an answer for two changing pieces of information, such as row/column or positions in two words.

## New words

Subsequence: keeps order but may skip letters. Substring: consecutive letters. A 2D array is a table of rows and columns.

## GridPathsDp

Count routes from top-left to bottom-right using only right and down moves.

Open [GridPathsDp.java](GridPathsDp.java). Read these steps alongside the code:

1. Every cell in the first row or column has one route.
2. Every other cell can be reached from above or from the left.
3. Add those two route counts.
4. The demo restricts each dimension to 1–20 to keep counts within long.

From the `java-zero-to-dsa` folder, run:

```sh
java 24-dp-grids-and-strings/GridPathsDp.java
```

Expected output:

```text
6
```

**Try it yourself:** Draw all routes in a 2×3 grid. Later, add blocked cells.

**Work and memory:** O(rows × columns) time and space.

## LongestCommonSubsequenceDp

Find the length of a shared sequence of letters, allowing skips.

Open [LongestCommonSubsequenceDp.java](LongestCommonSubsequenceDp.java). Read these steps alongside the code:

1. dp[i][j] is the answer for the first i letters of a and first j letters of b.
2. If the last letters match, add one to the diagonal answer.
3. Otherwise, keep the better answer from dropping one last letter.
4. An empty prefix has answer zero. This returns the length, not the letters themselves.

From the `java-zero-to-dsa` folder, run:

```sh
java 24-dp-grids-and-strings/LongestCommonSubsequenceDp.java
```

Expected output:

```text
3
```

**Try it yourself:** The common sequence is ace. Try two words with no common letters and one empty word.

**Work and memory:** O(m × n) time and space for string lengths m and n. Use short strings while learning.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../23-dp-choice-problems/README.md)
