# 22. Understand dynamic programming

DP saves answers to smaller repeated questions. Think of writing down a subtotal so you do not calculate it again.

## New words

State: what one stored answer means. Transition: how smaller answers combine. Base case: starting answer. Memoization: save recursive answers. Tabulation: fill a table in order.

## FibonacciDp

Compare plain recursion, memoization, and a table.

Open [FibonacciDp.java](FibonacciDp.java). Read these steps alongside the code:

1. Define F(0)=0 and F(1)=1; F(n)=F(n-1)+F(n-2).
2. Plain recursion repeatedly calculates the same values; use it only for small n.
3. Memoization stores each answer in a cache.
4. Tabulation fills answers from smaller n upward.
5. The main example uses n=10. Long values overflow beyond F(92); the methods enforce bounds.

From the `java-zero-to-dsa` folder, run:

```sh
java 22-dp-first-steps/FibonacciDp.java
```

Expected output:

```text
55
55
55
```

**Try it yourself:** Write the table for n=6 on paper: 0, 1, 1, 2, 3, 5, 8. Explain what dp[i] means.

**Work and memory:** Plain recursion: O(2^n) upper bound, O(n) stack. Memoization and table: O(n) time and space.

## ClimbingStairsDp

Count ways to climb n stairs taking one or two steps.

Open [ClimbingStairsDp.java](ClimbingStairsDp.java). Read these steps alongside the code:

1. ways(0)=1: one way to take no steps. ways(1)=1.
2. The last move came from one step below or two steps below.
3. Add those two counts. Store only the previous two values.

From the `java-zero-to-dsa` folder, run:

```sh
java 22-dp-first-steps/ClimbingStairsDp.java
```

Expected output:

```text
5
```

**Try it yourself:** List all five ways for four steps. Then allow steps of size three too.

**Work and memory:** O(n) time; O(1) extra space. The bound prevents long overflow.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../21-greedy/README.md) · [Next lesson](../23-dp-choice-problems/README.md)
