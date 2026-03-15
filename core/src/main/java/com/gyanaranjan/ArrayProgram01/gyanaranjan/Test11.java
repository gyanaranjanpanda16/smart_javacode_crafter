package com.gyanaranjan.ArrayProgram01.gyanaranjan;


import java.util.HashSet;
import java.util.Set;

public class Test11 {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 9, 1, 7, 4, 8};
        int[] array2 = {1, 3, 7, 9, 5, 6};

        // Call the findIntersection method
        int[] intersection = findIntersection(array1, array2);

        // Display the intersection elements
        System.out.println("Intersection Elements:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    // Method to find the intersection of two arrays
    private static int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        // Add elements from the first array to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Check common elements in the second array and add them to intersectionSet
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert intersectionSet to an array
        int[] intersectionArray = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersectionArray[index++] = num;
        }

        return intersectionArray;
    }
}
