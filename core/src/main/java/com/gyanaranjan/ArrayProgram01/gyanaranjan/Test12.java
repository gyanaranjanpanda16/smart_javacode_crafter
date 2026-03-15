package com.gyanaranjan.ArrayProgram01.gyanaranjan;


import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 1, 3};

        // Call the removeDuplicates method
        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);

        // Display the original and modified arrays
        System.out.println("Array with Duplicates: " + Arrays.toString(arrayWithDuplicates));
        System.out.println("Array without Duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }

    // Method to remove duplicates from an array
    private static int[] removeDuplicates(int[] arr) {
        int n = arr.length;

        // Check for empty or single-element array
        if (n <= 1) {
            return arr;
        }

        // Sort the array to group duplicates together
        Arrays.sort(arr);

        // Initialize variables for the result array and the current index
        int[] result = new int[n];
        int currentIndex = 0;

        // Iterate through the sorted array and add non-duplicate elements to the result array
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result[currentIndex++] = arr[i];
            }
        }

        // Add the last element to the result array
        result[currentIndex++] = arr[n - 1];

        // Create a new array with the correct size and copy the result array
        return Arrays.copyOf(result, currentIndex);
    }
}
