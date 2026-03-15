package com.gyanaranjan.StreamApi;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Numeric operations
        int sum = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        int product = Stream.of(1, 2, 3, 4, 5).reduce(1, (a, b) -> a * b);
        int min = Stream.of(1, 2, 3, 4, 5).reduce(Integer.MAX_VALUE, Integer::min);
        int max = Stream.of(1, 2, 3, 4, 5).reduce(Integer.MIN_VALUE, Integer::max);

        // String operations
        String concat = Stream.of("hello", "world").reduce("", String::concat);
        String joinWithSpace = Stream.of("hello", "world").reduce("", String::join);

        // Boolean operations
        boolean anyMatch = Stream.of(1, 2, 3, 4, 5).anyMatch(x -> x > 3);
        boolean allMatch = Stream.of(1, 2, 3, 4, 5).allMatch(x -> x > 0);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Concatenation: " + concat);
        System.out.println("Join with Space: " + joinWithSpace);
        System.out.println("Any match greater than 3: " + anyMatch);
        System.out.println("All match greater than 0: " + allMatch);
    }
}
