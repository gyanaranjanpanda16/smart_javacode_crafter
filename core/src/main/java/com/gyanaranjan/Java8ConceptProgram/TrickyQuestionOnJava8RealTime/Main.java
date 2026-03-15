package com.gyanaranjan.Java8ConceptProgram.TrickyQuestionOnJava8RealTime;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating list of lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9),
                Arrays.asList(10, 11, 12)
        );

        // Filtering - Selecting lists whose sum of elements is greater than 15
        List<List<Integer>> filteredLists = listOfLists.stream()
                .filter(list -> list.stream().mapToInt(Integer::intValue).sum() > 15)
                .toList();

        System.out.println("Filtered lists whose sum of elements is greater than 15:");
        filteredLists.forEach(System.out::println);

        // GroupingBy - Grouping lists by their sum of elements
        Map<Integer, List<List<Integer>>> groupedLists = listOfLists.stream()
                .collect(Collectors.groupingBy(list -> list.stream().mapToInt(Integer::intValue).sum()));

        System.out.println("\nGrouped lists by their sum of elements:");
        groupedLists.forEach((sum, lists) -> {
            System.out.println("Sum: " + sum);
            lists.forEach(System.out::println);
        });

        // PartitioningBy - Partitioning lists into two groups based on whether the sum of elements is greater than 15
        Map<Boolean, List<List<Integer>>> partitionedLists = listOfLists.stream()
                .collect(Collectors.partitioningBy(list -> list.stream().mapToInt(Integer::intValue).sum() > 15));

        System.out.println("\nPartitioned lists into two groups based on sum of elements:");
        partitionedLists.forEach((isGreaterThan15, lists) -> {
            if (isGreaterThan15) {
                System.out.println("Sum > 15:");
            } else {
                System.out.println("Sum <= 15:");
            }
            lists.forEach(System.out::println);
        });

        // CollectingAndThen - Getting the average sum of elements of all lists
        double averageSum = listOfLists.stream()
                .mapToDouble(list -> list.stream().mapToInt(Integer::intValue).sum())
                .average()
                .orElse(0);
        System.out.println("\nAverage sum of elements of all lists: " + averageSum);
    }
}
