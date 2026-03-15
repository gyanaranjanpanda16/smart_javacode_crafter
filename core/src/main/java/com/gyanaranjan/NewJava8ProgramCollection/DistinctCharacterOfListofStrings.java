package com.gyanaranjan.NewJava8ProgramCollection;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctCharacterOfListofStrings {

        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "mango");

            // Find the distinct characters present in all words
            Set<Character> distinctCharacters = words.stream()
                    .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                    .collect(Collectors.toSet());

            // Print the distinct characters
            System.out.println("Distinct characters: " + distinctCharacters);
        }
    }


