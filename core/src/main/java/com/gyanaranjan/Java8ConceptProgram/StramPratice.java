package com.gyanaranjan.Java8ConceptProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramPratice {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(10, 23, 45, 63);

        List<Integer> updatedMarks = marks.stream()
                .map(mark -> mark % 5 == 0? mark + 5 : mark )
                .toList();

        System.out.println("Original Marks: " + marks);
        System.out.println("Updated Marks: " + updatedMarks);
    }
}
