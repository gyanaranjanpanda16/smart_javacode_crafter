package com.gyanaranjan.ToughJavaProgram17042024;

import java.util.Arrays;

//Write a Java method findMissingNumber(int[] numbers) that takes in an array of integers containing
//        unique numbers from 1 to n (where n is the length of the array + 1), except for one missing number.
//        The method should return the missing number. For example, if the input array is [1, 2, 4, 5],
//        the method should return 3, as 3 is the missing number.
//        Ensure that your solution has a time complexity of O(n) and uses O(1) extra space.
//        Input: [1, 2, 4, 5]
//        Output: 3
//        Input: [3, 7, 1, 2, 8, 4, 5]
//        Output: 6
public class FindMissingNumberInArray {
    public static int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int total = n*(n+1)/2;
        int sum = Arrays.stream(arr).sum();
        return  total-sum;
    }

    public static void main(String[] args) {
           int [] arr = {1,3,5,4,6,7,8};
        int missingNumber = FindMissingNumberInArray.findMissingNumber(arr);
        System.out.println(missingNumber);
    }
}
