package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;


import java.util.Arrays;
public class ParallelStreamExample {
    public static void main(String[] args) {
        // Create a large array
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Processing the array using a parallel stream
        long startTime = System.currentTimeMillis();
        Arrays.stream(array)
                .parallel() // Creating a parallel stream
                .map(ParallelStreamExample::timeConsumingFunction)
                .forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");
    }

    // Simulate a time-consuming operation
    private static int timeConsumingFunction(int n) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return n * n;
    }
}
