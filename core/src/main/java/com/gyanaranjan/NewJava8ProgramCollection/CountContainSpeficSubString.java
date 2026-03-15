package com.gyanaranjan.NewJava8ProgramCollection;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class CountContainSpeficSubString {

        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "mango");

            // Filter words that contain the substring "an" and collect them into a new list
            List<String> filteredWords = words.stream()
                    .filter(word -> word.contains("an"))
                    .toList();

            // Print the filtered words
            System.out.println("Words containing 'an': " + filteredWords);
        }
    }


