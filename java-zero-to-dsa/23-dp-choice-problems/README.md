# 23. Use DP to compare choices

At each position, compare the possible choices using answers already known.

## New words

Recurrence: the equation connecting states. Unreachable state: no valid way to achieve that answer.

## HouseRobberDp

Choose non-adjacent values with the largest total.

Open [HouseRobberDp.java](HouseRobberDp.java). Read these steps alongside the code:

1. For each house, either skip it or take it.
2. Taking it adds its value to the best total from two houses back.
3. Keep the larger total. Values must be nonnegative.

From the `java-zero-to-dsa` folder, run:

```sh
java 23-dp-choice-problems/HouseRobberDp.java
```

Expected output:

```text
12
```

**Try it yourself:** Explain why choosing the largest single house first can fail. Try an empty array.

**Work and memory:** O(n) time; O(1) extra space.

## CoinChangeDp

Find the fewest coins needed to make an amount, with unlimited copies.

Open [CoinChangeDp.java](CoinChangeDp.java). Read these steps alongside the code:

1. dp[total] means the fewest coins for that total. dp[0]=0.
2. For each usable coin, try dp[total-coin]+1.
3. Keep the smallest reachable answer. Return -1 when the amount cannot be made.
4. For coins 1, 3, 4 and amount 6, choosing 4 greedily uses three coins; DP finds 3+3.

From the `java-zero-to-dsa` folder, run:

```sh
java 23-dp-choice-problems/CoinChangeDp.java
```

Expected output:

```text
2
-1
```

**Try it yourself:** Try amount 0 and an empty coin list. Write the table for totals 0 through 6.

**Work and memory:** O(amount × coin count) time; O(amount) extra space.

## KnapsackDp

Choose items for a bag with limited capacity; each item can be used once.

Open [KnapsackDp.java](KnapsackDp.java). Read these steps alongside the code:

1. dp[i][space] is the best value using only the first i items.
2. Skip the current item, or take it if it fits.
3. Both choices use the previous row, so each item is counted at most once.
4. This teaching version assumes equal-length arrays, positive weights, nonnegative values, and small nonnegative capacity.

From the `java-zero-to-dsa` folder, run:

```sh
java 23-dp-choice-problems/KnapsackDp.java
```

Expected output:

```text
35
```

**Try it yourself:** Identify the chosen items. Try capacity zero. Why would using the current row change the problem?

**Work and memory:** O(items × capacity) time and space. Keep examples small to limit table memory.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../22-dp-first-steps/README.md) · [Next lesson](../24-dp-grids-and-strings/README.md)
