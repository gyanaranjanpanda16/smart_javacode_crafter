package com.gyanaranjan.ToughJavaProgram17042024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Write a Java method findDuplicates(int[] nums) that takes in an array of integers and
//        returns a new array containing all the duplicate elements in the input array.
//        If there are no duplicates, return an empty array. Ensure that the order of
//        elements in the output array matches the order of their appearance in the input array.
//        Example:
//        Copy code
//        Input: [1, 2, 3, 4, 2, 5, 6, 3]
//        Output: [2, 3]
//        Input: [7, 8, 9, 10]
//        Output: []
public class FindDuplicateElementInArray {
    public static void main(String[] args) {
//        int [] arr = {1, 2, 3, 4, 2, 5, 6, 3}; // o/p will be Output: [2, 3]
        int [] arr = {1, 3, 4, 2, 5}; // o/p will be Output: []
        Set<Integer>  nums = new HashSet<>();
        int[] arrayElements = Arrays.stream(arr).filter(n -> !nums.add(n)).toArray();
        System.out.println(Arrays.toString(arrayElements));

    }

}
