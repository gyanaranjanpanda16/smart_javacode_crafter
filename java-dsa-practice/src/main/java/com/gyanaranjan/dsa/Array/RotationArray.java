
//Reverse a linked list from position m to n.
//
//
//
//        Example:
//
//        1 → 2 → 3 → 4 → 5
//
//m = 2, n = 4
//
//Output: 1 → 4 → 3 → 2 → 5.


package com.gyanaranjan.dsa.Array;

public class RotationArray {

    public static int[] reverseBetween(int[] array, int m, int n) {
        int left = m - 1;   // convert to 0-based index
        int right = n - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] result = reverseBetween(array, 2, 4);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}