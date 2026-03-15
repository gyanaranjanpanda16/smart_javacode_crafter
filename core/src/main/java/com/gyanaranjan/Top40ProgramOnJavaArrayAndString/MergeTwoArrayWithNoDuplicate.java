package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayWithNoDuplicate {
    private static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB)
    {
        return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB))
                .distinct()
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        int [] arr = {1,78,88,4,3,99,0,90};
        int [] arr1 = {1,78,88,4,3,96,56,4,2,6};
        String str = Arrays.toString(mergeArraysAndRemoveDuplicates(arr, arr1));
        System.out.println(str);

    }
}
