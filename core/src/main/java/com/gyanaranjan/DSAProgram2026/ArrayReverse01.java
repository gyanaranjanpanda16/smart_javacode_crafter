package com.gyanaranjan.DSAProgram2026;

import java.util.Arrays;

public class ArrayReverse01 {
    public static void main(String[] args) {
       int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        String str = "Gyanaran";
//        char[] arr = str.toCharArray();
        System.out.println("Original Array: " + Arrays.toString(arr));
//        char test = ' ';
        //Array Reverse :--
//        for (int i = 0, j = arr.length - 1;i<j; i++,j--) {
//            char temp1 = arr[i];
//            arr[i] = arr [j];
//            arr[j] = temp1;
//        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // print
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


}
