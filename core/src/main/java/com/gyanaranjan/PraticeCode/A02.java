package com.gyanaranjan.PraticeCode;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class A02 {
    public static void main(String[] args) {

                // Create a list of double values
                List<Double> numbers = Arrays.asList(5.5, 6.2, 3.8, 7.1, 4.9);

                // Calculate the average of the numbers using streams and Java 8 features
                OptionalDouble average = numbers.stream()
                        .mapToDouble(Double::doubleValue) // Convert Double to double
                        .average(); // Calculate the average

                // Check if the average value is present and print the result
                if (average.isPresent()) {
                    System.out.println("Average value: " + average.getAsDouble());
                } else {
                    System.out.println("The list is empty, cannot calculate average.");
                }
            }
        }





