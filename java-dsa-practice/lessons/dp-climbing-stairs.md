# DP — Climbing stairs

You can climb one or two stairs at a time. Count the distinct step sequences reaching stair n. Define n=0 as one empty sequence. Input range for the long-based implementation: 0–91.

1. **State:** ways(i) counts sequences reaching stair i.
2. **Transition:** the last move is either one step from i−1 or two from i−2. These groups do not overlap, so ways(i)=ways(i−1)+ways(i−2).
3. **Base cases:** ways(0)=1 and ways(1)=1.
4. **Recursion:** direct recursion repeats subproblems, taking exponential time and O(n) stack. As an exercise, add memoization for O(n) time and O(n) space.
5. **Tabulation:** compute i=2 through n, with smaller dependencies already available. Return ways(n).
6. **Space reduction:** keep only the two previous states, reducing extra space from O(n) to O(1).

For n=4, counts are `1, 1, 2, 3, 5`; the five sequences are 1111, 112, 121, 211, 22. Both versions take O(n) arithmetic operations. Values beyond n=91 overflow signed long; the API explicitly rejects them. An unbounded extension should use BigInteger and revisit arithmetic cost assumptions.

[Source](../src/main/java/com/gyanaranjan/dsa/dp/ClimbingStairs.java) · [Tests](../src/test/java/com/gyanaranjan/dsa/dp/ClimbingStairsTest.java)

Follow-up: permitted steps {1,3,5}; then blocked stairs; then minimum climbing cost. Define a new recurrence before editing code.
