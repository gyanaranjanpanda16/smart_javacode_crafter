package com.gyanaranjan.PraticeCode;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingAndAggregatingExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "banana");

        // Group fruits by name and count occurrences
        Map<String, Long> fruitCounts = fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Fruit Counts: " + fruitCounts);
    }
}
