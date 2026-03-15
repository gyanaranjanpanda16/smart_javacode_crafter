package com.gyanaranjan.Java8ConceptProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three");

        List<String> modifiedList = strings.stream()
                .peek(s -> System.out.println("Before: " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("After: " + s))
                .collect(Collectors.toList());

    }
}
