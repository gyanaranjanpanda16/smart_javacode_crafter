# 21. Make a locally best choice when it is justified

For meeting scheduling, choosing the earliest finishing compatible meeting leaves as much room as possible afterward.

## New words

Greedy: commit to one choice at each step. This works only when the choice can be justified for the problem.

## MeetingSelection

Find the largest count of non-overlapping meetings in one room.

Open [MeetingSelection.java](MeetingSelection.java). Read these steps alongside the code:

1. Sort meetings by finish time.
2. Select a meeting if it starts at or after the last selected finish.
3. Replacing the first meeting of an optimal schedule with an earliest-finishing one leaves no less room for the rest.
4. Meetings use [start, end) times: one can start exactly when another finishes.

From the `java-zero-to-dsa` folder, run:

```sh
java 21-greedy/MeetingSelection.java
```

Expected output:

```text
3
```

**Try it yourself:** Try no meetings and fully overlapping meetings. Each meeting must have start < end.

**Work and memory:** O(n log n) time; sorting may use O(n) extra space. Reorders the input.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../20-graphs/README.md) · [Next lesson](../22-dp-first-steps/README.md)
