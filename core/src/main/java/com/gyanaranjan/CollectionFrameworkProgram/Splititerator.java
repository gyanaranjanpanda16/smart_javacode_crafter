package com.gyanaranjan.CollectionFrameworkProgram;

import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Splititerator {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Get a SplitIterator from the stream
        Spliterator<Integer> spliterator = stream.spliterator();

        // Create a parallel stream using the SplitIterator
        Stream<Integer> parallelStream = StreamSupport.stream(spliterator, true);

        // Perform parallel processing on the stream
        parallelStream.forEach(System.out::println);

    }
}
