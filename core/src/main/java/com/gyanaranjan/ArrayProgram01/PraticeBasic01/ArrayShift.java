package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

import java.util.Arrays;

public class ArrayShift {

    // Method to perform left shift on the array
    public static void leftShift(int[] arr, int shiftBy) {
        int n = arr.length;
        shiftBy %= n; // Handle cases where shiftBy is greater than array length
        reverse(arr, 0, shiftBy - 1);
        reverse(arr, shiftBy, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Method to perform right shift on the array
    public static void rightShift(int[] arr, int shiftBy) {
        int n = arr.length;
        shiftBy %= n; // Handle cases where shiftBy is greater than array length
        reverse(arr, 0, n - 1);
        reverse(arr, 0, shiftBy - 1);
        reverse(arr, shiftBy, n - 1);
    }

    // Method to reverse the elements in the array within the specified range
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

//        leftShift(arr, 3); // Perform left shift by 2 positions
//        System.out.println("After left shift: " + Arrays.toString(arr));

        rightShift(arr, 10); // Perform right shift by 2 positions
        System.out.println("After right shift: " + Arrays.toString(arr));
    }
}
