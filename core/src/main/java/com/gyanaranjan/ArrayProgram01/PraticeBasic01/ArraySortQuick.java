package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortQuick {
    public static void main(String[] args) {
        Integer[] myArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5}; // Integer array for sorting

        // Sort the array in ascending order
        Arrays.sort(myArray);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(myArray));

        // Sort the array in descending order
        Arrays.sort(myArray, Comparator.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(myArray));
    }
}