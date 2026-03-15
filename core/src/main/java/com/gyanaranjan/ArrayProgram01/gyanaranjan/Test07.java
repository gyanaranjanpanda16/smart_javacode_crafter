package com.gyanaranjan.ArrayProgram01.gyanaranjan;
// wap to sort ascending order using bubble sort :--->
public class Test07 {
    public static void main(String[] args) {
            int[] numbers = {5, 2, 9, 1, 7, 4, 8};
        bubbleSort(numbers);

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Method to perform Bubble Sort on an array
 static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
//                <---GreaterThan 4321  >---- LessThan 1234
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
