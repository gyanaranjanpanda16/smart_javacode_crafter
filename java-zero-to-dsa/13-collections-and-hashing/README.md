# 13. Use ready-made containers

A list grows as you add items. A set keeps unique items. A map connects a key to a value, like a contact name to a phone number.

## New words

ArrayList: growable list. HashSet: unique values. HashMap: key/value lookup. <Integer>: stores boxed integers.

## CollectionsBasics

Use a list, set, and map.

Open [CollectionsBasics.java](CollectionsBasics.java). Read these steps alongside the code:

1. Add names to a list, including a duplicate.
2. A set removes duplicate membership.
3. A map stores a score under a name; get retrieves it.
4. Hash sets and maps do not promise an iteration order.

From the `java-zero-to-dsa` folder, run:

```sh
java 13-collections-and-hashing/CollectionsBasics.java
```

Expected output:

```text
List size: 3
Unique names: 2
Asha score: 90
```

**Try it yourself:** Count how often each word occurs in a short list.

**Work and memory:** Not needed yet; focus on understanding the steps.

## TwoSumBeginner

Find two different positions whose values add up to a target.

Open [TwoSumBeginner.java](TwoSumBeginner.java). Read these steps alongside the code:

1. For each value, calculate the missing partner.
2. Check whether that partner appeared earlier.
3. Store the current value after checking, so one position is never used twice.
4. Use long for subtraction to avoid overflow; return an empty array if no pair exists.

From the `java-zero-to-dsa` folder, run:

```sh
java 13-collections-and-hashing/TwoSumBeginner.java
```

Expected output:

```text
[0, 1]
```

**Try it yourself:** Try [3, 3] with target 6, then an input with no answer.

**Work and memory:** Expected O(n) time; O(n) extra space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../12-sorting/README.md) · [Next lesson](../14-prefix-sums-and-windows/README.md)
