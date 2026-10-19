# 16. Choose who comes out first

A stack is like stacked plates: last in, first out. A queue is like a checkout line: first in, first out.

## New words

push/pop: stack operations. add/remove: queue operations. ArrayDeque supports both.

## StackQueueDemo

Observe the two removal orders.

Open [StackQueueDemo.java](StackQueueDemo.java). Read these steps alongside the code:

1. Push 10, then 20 onto a stack.
2. Pop removes 20 first.
3. Add 10, then 20 to a queue. Remove takes 10 first.
4. Check isEmpty before removing when the container might be empty.

From the `java-zero-to-dsa` folder, run:

```sh
java 16-stacks-and-queues/StackQueueDemo.java
```

Expected output:

```text
Stack removes: 20
Queue removes: 10
```

**Try it yourself:** Add a third item to each and predict every removal.

**Work and memory:** Not needed yet; focus on understanding the steps.

## BalancedBrackets

Check matching brackets.

Open [BalancedBrackets.java](BalancedBrackets.java). Read these steps alongside the code:

1. Save opening brackets on a stack.
2. A closing bracket must match the latest opening bracket.
3. Finish with an empty stack. This method accepts only bracket characters.

From the `java-zero-to-dsa` folder, run:

```sh
java 16-stacks-and-queues/BalancedBrackets.java
```

Expected output:

```text
true
false
```

**Try it yourself:** Try an empty string, an extra closing bracket, and an unmatched opening bracket.

**Work and memory:** O(n) time; O(n) extra space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../15-linked-lists/README.md) · [Next lesson](../17-recursion-and-backtracking/README.md)
