package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

import java.util.Arrays;

// Find Second Highest :-
public class ArraySecondHighest {
//    public static int findSecondLargest(int[] arr) {
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        for (int num : arr) {
//            if (num > largest) {
//                secondLargest = largest;
//                largest = num;
//            } else if (num > secondLargest && num != largest) {
//                secondLargest = num;
//            }
//        }
//        return secondLargest;
//    }
    int findsecondHighestByApi(int[] arr){
        Arrays.parallelSort(arr);
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        int [] arr = {8,6,8,8,8};
        ArraySecondHighest arraySecondHighest = new ArraySecondHighest();
        int secondHighest = arraySecondHighest.findsecondHighestByApi(arr);
//        int secondLargest = arraySecondHighest.findSecondLargest(arr);
        System.out.println(secondHighest);
//        System.out.println(secondLargest);
    }
}
