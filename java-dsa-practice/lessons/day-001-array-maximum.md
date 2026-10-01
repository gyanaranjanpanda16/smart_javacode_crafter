# October 9 — Array maximum and loop invariants

This reference retains its original filename. In the revised beginner calendar, study it on October 9, after loops and array traversal.

## Attempt

Given a nonempty integer array, return its maximum without sorting or changing the input. Examples: `[4, 1, 9, -3] → 9`, `[-8, -2, -5] → -2`. Null is invalid; an empty array has no maximum. Spend 15 minutes writing your own method and tests before opening the source.

Hints: must every element be examined? What maximum do you know after visiting the first element? Why is initializing the maximum to zero wrong?

## Explanation

Sorting would cost O(n log n) with a typical comparison sort and may mutate the input. Scan once instead. Before iteration i, `maximum` is the maximum of indices 0 through i−1. Comparing it with element i preserves the invariant. At termination every element has been considered. This also establishes the O(n) time lower bound for an arbitrary unsorted array: an unread element could be larger. Auxiliary space is O(1).

[Source](../src/main/java/com/gyanaranjan/dsa/arrays/ArrayMaximum.java) · [Tests](../src/test/java/com/gyanaranjan/dsa/arrays/ArrayMaximumTest.java)

Tests cover duplicates, all-negative values, a singleton, integer limits, invalid inputs, and preservation of the input. Follow-up: return the index of the first maximum, then find the second-largest **distinct** value. Explain what happens when there is no second distinct value.

Experienced-developer extension: explain why parallelizing tiny arrays may add overhead, and why this problem does not need streams or a framework.
