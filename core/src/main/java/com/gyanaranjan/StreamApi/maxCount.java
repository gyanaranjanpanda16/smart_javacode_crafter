package com.gyanaranjan.StreamApi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class maxCount {
    public static void main(String[] args) {
                String inputString = "gyanaranjan";
        Map<Character, Long> collect = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(collect);
//        String [] arr = {"sira","sira","ram","gita","ram"};
                // Create a TreeMap to store character occurrences in order
//                Map<Character, Integer> charOccurrences = new TreeMap<>();
//                Map<String, Integer> charOccurrences = new HashMap<>();
//                // Iterate through the string and count character occurrences
//                for (String c : arr) {
//                    charOccurrences.put(c, charOccurrences.getOrDefault(c, 0) + 1);
//                }
//                System.out.println(charOccurrences);

    }
}
