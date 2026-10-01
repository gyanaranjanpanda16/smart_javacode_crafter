# Data structures and algorithms

**Active schedule:** [October 1–December 31, 2026](../docs/DAILY_PLAN.md). Follow the dated assignments; additional topics in this guide are optional reference material.

Follow [daily assignments](../docs/DAILY_PLAN.md). New packages are lowercase and topic-based. Existing `Array` examples remain at their current paths for compatibility.

## Start from zero

Begin with [Day 1: algorithms, variables and tracing](lessons/day-001-foundations.md). October 1–7 covers conditions, loops and methods; October 8–14 covers arrays, strings and simple search/sort. No DSA knowledge is assumed, and early assessments are untimed. Follow the foundation gate in the study plan before advancing.

## Starter references

| Topic | Implementation | Tests | Lesson |
| --- | --- | --- | --- |
| Arrays | [ArrayMaximum](src/main/java/com/gyanaranjan/dsa/arrays/ArrayMaximum.java) | [Tests](src/test/java/com/gyanaranjan/dsa/arrays/ArrayMaximumTest.java) | [Oct 9 lesson](lessons/day-001-array-maximum.md) |
| Sliding window | [LongestUniqueSubstring](src/main/java/com/gyanaranjan/dsa/strings/LongestUniqueSubstring.java) | [Tests](src/test/java/com/gyanaranjan/dsa/strings/LongestUniqueSubstringTest.java) | Optional after fixed-window basics |
| DP | [ClimbingStairs](src/main/java/com/gyanaranjan/dsa/dp/ClimbingStairs.java) | [Tests](src/test/java/com/gyanaranjan/dsa/dp/ClimbingStairsTest.java) | [DP derivation](lessons/dp-climbing-stairs.md) |

Create packages as exercises are implemented: `hashing`, `binarysearch`, `linkedlist`, `stackqueue`, `backtracking`, `trees`, `heaps`, `graphs`, `greedy`, `tries`, `bits`. Avoid empty placeholder classes and one package per day.

## Completion contract

An exercise is complete when you can state the input contract, produce a brute-force approach, justify the improvement, implement it, test meaningful boundary cases, and explain time/space complexity. Record whether hints were needed. Save notes using [PROBLEM.md](../templates/PROBLEM.md).

Use `mvn -pl java-dsa-practice -am test` from the repo root. Do not read the reference until you have attempted the problem.
