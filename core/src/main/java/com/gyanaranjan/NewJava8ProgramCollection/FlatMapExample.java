package com.gyanaranjan.NewJava8ProgramCollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> list2 = Arrays.asList("date", "elderberry", "fig");

        // Create a stream of lists
        Stream<List<String>> listOfListsStream = Stream.of(list1, list2);

        // Use flatMap to flatten the stream of lists into a single stream of elements
        Stream<String> flattenedStream = listOfListsStream.flatMap(Collection::stream);

        // Collect the elements into a list
        List<String> flattenedList = flattenedStream.toList();

        // Print the flattened list
        System.out.println("Flattened List: " + flattenedList);
    }
}
