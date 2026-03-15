package com.gyanaranjan.DsaProgram;

import java.util.Arrays;

public class ReverseBubbleSortVisualization {

    // Function to perform Bubble Sort in reverse (sorting the array in descending order)
    public static void reverseBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Swap adjacent elements if they are in the wrong order
                if (arr[j] < arr[j + 1]) { // Reverse the comparison for descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
            // Visualize the current state of the array after each pass
            printArray(arr);
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 12, 25, 34, 64, 90}; // Sorted array

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nSorting Steps:");
        reverseBubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
