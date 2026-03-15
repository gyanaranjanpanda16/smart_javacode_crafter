package com.gyanaranjan.DurgaSirNotePrograms;

public class SubArrayJava {
        public void reverseSubarray(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
          SubArrayJava arrayReversal = new SubArrayJava();
            int startIndex = 2;
            int endIndex = 3;
            System.out.println("Original Array: ");
            printArray(arr);
            arrayReversal.reverseSubarray(arr, startIndex, endIndex);
            System.out.println("Array after reversing subarray from index " + startIndex + " to index " + endIndex + ": ");
            printArray(arr);
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


