package com.gyanaranjan.ArrayProgram01.gyanaranjan;

import java.util.HashMap;
import java.util.Map;

public class Test08 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 4, 8, 5, 2, 7, 4, 2, 5};

        // Call the findFrequency method
        Map<Integer, Integer> frequencyMap = findFrequency(numbers);

        // Display the frequency of each element
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }

    // Method to find the frequency of each element in an array
    private static Map<Integer, Integer> findFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            // If the number is already in the map, increment its frequency
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the number is not in the map, add it with a frequency of 1
                frequencyMap.put(num, 1);
            }
        }

        return frequencyMap;
    }
}
