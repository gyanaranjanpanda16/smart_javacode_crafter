package com.gyanaranjan.ArrayProgram01.PraticeBasic01;


import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        int[] myArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        // Sort the array in ascending order
        Arrays.sort(myArray);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(myArray));

        // Sort the array in descending order
        Integer[] boxedArray = Arrays.stream(myArray).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Collections.reverseOrder());
        int[] sortedArrayDesc = Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
        System.out.println("Sorted array in descending order: " + Arrays.toString(sortedArrayDesc));
    }
}

