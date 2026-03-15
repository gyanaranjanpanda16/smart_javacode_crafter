package com.gyanaranjan.DsaProgram;

import java.util.Arrays;

public class BubbleSortVisualization {

    // Function to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Swap adjacent elements if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
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
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nSorting Steps:");
        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
