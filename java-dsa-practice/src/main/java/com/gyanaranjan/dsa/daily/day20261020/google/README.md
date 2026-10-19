# Google interview DSA practice

Started: 20 October 2026

This is a curated practice roadmap, not an official Google frequency ranking. Public company lists are based on candidate reports and change over time. The order below is a suggested learning sequence, from foundations to harder patterns; it does not indicate frequency.

## Question checklist

| Done | # | Question | Difficulty | Pattern |
| --- | --- | --- | --- | --- |
| [ ] | 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | Hash map |
| [ ] | 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | Linked lists, carry |
| [ ] | 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | Sliding window |
| [ ] | 4 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | Sorting, intervals |
| [ ] | 5 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | Stack |
| [ ] | 6 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | Linked lists |
| [ ] | 7 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | Single pass |
| [ ] | 8 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | Sorting, two pointers |
| [ ] | 9 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | Prefix and suffix products |
| [ ] | 10 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Medium | Prefix sums, hash map |
| [ ] | 11 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | Binary search |
| [ ] | 12 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Medium | Heap or buckets |
| [ ] | 13 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Medium | DFS or BFS |
| [ ] | 14 | [Course Schedule](https://leetcode.com/problems/course-schedule/) | Medium | Topological sort |
| [ ] | 15 | [Word Ladder](https://leetcode.com/problems/word-ladder/) | Hard | BFS |
| [ ] | 16 | [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | Medium | Tree recursion |
| [ ] | 17 | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | Hard | Tree DP |
| [ ] | 18 | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | Hard | Tree traversal |
| [ ] | 19 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | Medium | Hash map, doubly linked list |
| [ ] | 20 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | Two heaps |
| [ ] | 21 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | Min heap |
| [ ] | 22 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard | Sliding window |
| [ ] | 23 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | Two pointers |
| [ ] | 24 | [Coin Change](https://leetcode.com/problems/coin-change/) | Medium | Dynamic programming |
| [ ] | 25 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard | Binary search |

## Start today

1. Solve Two Sum with two loops, then improve it with a hash map.
2. Run `TwoSum.java` and trace how the map changes.
3. Complete the three methods in `Practice.java` in checklist order: #3, #5, #7. Each currently throws `UnsupportedOperationException` deliberately.
4. For every problem, record the approach, time and space complexity, and one edge case. Revisit it after two days.

Aim for two problems a day. Try each for 25–40 minutes before reading a solution. For linked list, tree, and design questions, use the corresponding LeetCode editor and its supplied types.

## Sources

Checked on 20 October 2026:

- [Candidate-reported Google question list](https://crackedprep.com/google-interview-questions) — reports Two Sum, Add Two Numbers, and Longest Substring Without Repeating Characters among its most frequently reported questions. The broader roadmap also includes standard preparation patterns.
- [LeetCode Google collection example: Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envId=google&envType=company&favoriteSlug=google-thirty-days).
- Each question above links to its original problem statement.
