package com.gyanaranjan.DsaProgram.DSA;

import java.util.*;

public class DsaProgram {

    // ==============================
    // 1️⃣ FOR LOOP (Basic Traversal)
    // ==============================
    static void forLoopExample() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ==============================
    // 2️⃣ TWO POINTER
    // Problem: Pair with given sum (sorted array)
    // ==============================
    static void twoPointerExample() {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair Found: " + arr[left] + ", " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No Pair Found");
    }

    // ==============================
    // 3️⃣ SLIDING WINDOW (Fixed Size)
    // Problem: Max sum of subarray of size k
    // ==============================
    static void slidingWindowExample() {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (i >= k - 1) {
                max = Math.max(max, sum);
                sum -= arr[i - (k - 1)];
            }
        }
        System.out.println("Max Sum = " + max);
    }

    // ==============================
    // 4️⃣ HASHING
    // Problem: Character Frequency
    // ==============================
    static void hashingExample() {
        String s = "aabbccdde";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }

    // ==============================
    // 5️⃣ PREFIX SUM
    // Problem: Range Sum Query
    // ==============================
    static void prefixSumExample() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int l = 1, r = 3; // sum from index 1 to 3
        int sum = prefix[r] - (l > 0 ? prefix[l - 1] : 0);

        System.out.println("Range Sum = " + sum);
    }

    // ==============================
    // 6️⃣ BINARY SEARCH
    // ==============================
    static void binarySearchExample() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 7;

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not Found");
    }

    // ==============================
    // 7️⃣ STACK
    // Problem: Reverse String
    // ==============================
    static void stackExample() {
        String s = "java";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        StringBuilder rev = new StringBuilder();
        while (!stack.isEmpty()) {
            rev.append(stack.pop());
        }

        System.out.println("Reversed = " + rev);
    }

    // ==============================
    // 8️⃣ QUEUE
    // ==============================
    static void queueExample() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        System.out.println();
    }

    // ==============================
    // 9️⃣ RECURSION
    // Problem: Factorial
    // ==============================
    static int recursionExample(int n) {
        if (n == 0) return 1;
        return n * recursionExample(n - 1);
    }

    // ==============================
    // 🔟 DYNAMIC PROGRAMMING
    // Problem: Fibonacci
    // ==============================
    static void dpExample() {
        int n = 6;
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println("Fibonacci = " + dp[n]);
    }

    // ==============================
    // 🚀 MAIN METHOD
    // ==============================
    public static void main(String[] args) {

        forLoopExample();
        twoPointerExample();
        slidingWindowExample();
        hashingExample();
        prefixSumExample();
        binarySearchExample();
        stackExample();
        queueExample();
        System.out.println("Factorial = " + recursionExample(5));
        dpExample();
    }
}
