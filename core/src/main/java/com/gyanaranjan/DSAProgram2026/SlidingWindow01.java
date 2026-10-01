package com.gyanaranjan.DSAProgram2026;
/*
Given an integer array arr[] and an integer k,
find the maximum sum of any contiguous subarray of size k.

Also, print the elements of that subarray.

📥 Example:
Input:
arr = [2, 1, 5, 1, 3, 2]
k = 3

Output:
Max Sum: 9
Subarray: 5 1 3
Here’s the best approach (Sliding Window → O(n) time, O(1) space) 👇

🔥 Optimal Solution (Sliding Window)
💡 Idea:
Compute sum of first k elements
Slide window → add next, remove previous
Track max sum + starting index
 */

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow01 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("----- FIXED WINDOW -----");
        fixedWindow(arr, k);

        System.out.println("\n----- VARIABLE WINDOW -----");
        variableWindow("abcabcbb");
    }

    // 🔥 FIXED WINDOW (size = k)
    public static void fixedWindow(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // sliding
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];        // add
            windowSum -= arr[i - k];    // remove

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Max Sum: " + maxSum);
    }

    // 🔥 VARIABLE WINDOW (dynamic size)
    public static void variableWindow(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // shrink window if duplicate
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest Unique Substring Length: " + maxLength);
    }


}
