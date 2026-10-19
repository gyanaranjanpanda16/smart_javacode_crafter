# 17. Solve a smaller version of the same job

Recursion asks the same method to solve a smaller job. Backtracking tries a choice, explores it, then undoes it.

## New words

Base case: when to stop. Call stack: unfinished method calls. Backtracking: choose, explore, undo.

## FactorialRecursion

Calculate 5! = 5 × 4 × 3 × 2 × 1.

Open [FactorialRecursion.java](FactorialRecursion.java). Read these steps alongside the code:

1. 0! is defined as 1: this is the stopping case.
2. For a larger n, multiply n by factorial(n - 1).
3. Only accept 0 to 20 because larger factorials exceed long.

From the `java-zero-to-dsa` folder, run:

```sh
java 17-recursion-and-backtracking/FactorialRecursion.java
```

Expected output:

```text
120
1
```

**Try it yourself:** Draw the calls for factorial(3), then write a loop version.

**Work and memory:** O(n) time; O(n) call-stack space.

## SubsetsBacktracking

List every subset of two numbers.

Open [SubsetsBacktracking.java](SubsetsBacktracking.java). Read these steps alongside the code:

1. At each position, first try excluding the number.
2. Then add it and explore the including choice.
3. Remove it afterward to restore the current choice list.

From the `java-zero-to-dsa` folder, run:

```sh
java 17-recursion-and-backtracking/SubsetsBacktracking.java
```

Expected output:

```text
[]
[2]
[1]
[1, 2]
```

**Try it yourself:** Try three distinct numbers. Predict how many subsets appear.

**Work and memory:** O(n × 2^n) time including printing; O(n) auxiliary space. Keep inputs small.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../16-stacks-and-queues/README.md) · [Next lesson](../18-trees/README.md)
