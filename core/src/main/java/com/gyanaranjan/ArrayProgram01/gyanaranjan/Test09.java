package com.gyanaranjan.ArrayProgram01.gyanaranjan;

public class Test09 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] unsortedArray = {5, 2, 9, 1, 7, 4, 8};

        // Check if arrays are sorted
        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray));
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray));
    }

    // Method to check if an array is sorted in non-decreasing order
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // If an element is greater than the next element, the array is not sorted
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true; // If the loop completes, the array is sorted
    }
}

