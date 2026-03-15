package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;


import java.util.Arrays;
    public class BinarySearchElementInArray {
        static int binarySearch(int[] arr, int key) {
            int low = 0, high = arr.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                // Check if key is present at mid
                if (arr[mid] == key) {
                    return mid;
                }
                // If key greater, ignore left half
                if (arr[mid] < key) {
                    low = mid + 1;
                }
                // If key is smaller, ignore right half
                else {
                    high = mid - 1;
                }
            }
            // Key not found
            return -1;
        }
        public static void main(String[] args) {
            int[] arr = {20, 5, 6, 8, 89, 9, 9, 10};
            int key = 5; // Element to search

            // Sorting the array
            Arrays.sort(arr);

            int index = binarySearch(arr, key);

            if (index != -1) {
                System.out.println("Element found at index " + index);
            } else {
                System.out.println("Element not present in the array");
            }
        }

        // Binary search function

    }


