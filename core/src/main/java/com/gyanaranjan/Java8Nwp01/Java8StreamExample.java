package com.gyanaranjan.Java8Nwp01;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamExample {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana","bbaa","cherry", "date", "elderberry", "figa");
        // Grouping fruits by their first letter
        Map<Integer, List<String>> groupedByFirstLetter = fruits.stream()
                .collect(Collectors.groupingBy(String::length));//s -> s.charAt(0)

        System.out.println("Fruits grouped by first letter:");
        groupedByFirstLetter.forEach((letter, fruitList) -> System.out.println(letter + ": " + fruitList));

        // Partitioning fruits into two groups based on length
        Map<Boolean, List<String>> partitionedByLength = fruits.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 5));

        System.out.println("\nFruits partitioned by length (>5):");
        partitionedByLength.forEach((isLong, fruitList) -> {
            if (isLong)
                System.out.println("Long: " + fruitList);
            else
                System.out.println("Short: " + fruitList);
        });
    }
}
