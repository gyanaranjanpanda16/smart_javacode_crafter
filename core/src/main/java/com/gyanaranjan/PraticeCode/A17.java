package com.gyanaranjan.PraticeCode;


import java.util.stream.Stream;

public class  A17 {
    public static void main(String[] args) {
        // Create a stream of double values
        Stream<Double> stream = Stream.of(5.5, 6.2, 3.8, 7.1, 4.9);

        // Filter even numbers and calculate the average
        double averageOfEvens = stream // Filter even numbers
                .mapToDouble(Double::doubleValue) // Map to double primitive
                .average() // Calculate average
                .orElse(0.0); // Default value if stream is empty

        System.out.println("Average of even numbers: " + averageOfEvens);
    }
}
