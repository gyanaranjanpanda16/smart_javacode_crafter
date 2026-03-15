package com.gyanaranjan.ArrayProgram01.gyanaranjan;

public class Test10 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 4, 8};

        // Call the findSecondLargest method
        int secondLargest = findSecondLargest(numbers);

        // Display the second largest element
        System.out.println("Second Largest Element: " + secondLargest);
    }

    // Method to find the second largest element in an array
    private static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
            // Return -1 as an indication of an error or insufficient elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

