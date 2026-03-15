package com.gyanaranjan.StsIdeProgram.gyanaranjan;


import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class Test12 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 50, 60};

        // Use a Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        for (int element : arr) {
            uniqueElements.add(element);
        }

        // Convert the Set to an array
        int[] distinctArray = new int[uniqueElements.size()];
        int index = 0;
        for (int element : uniqueElements) {
            distinctArray[index] = element;
            index++;
        }

        System.out.println(Arrays.toString(distinctArray));
    }
}