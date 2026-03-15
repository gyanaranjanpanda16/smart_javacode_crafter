package com.gyanaranjan.NewJava8ProgramCollection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class LongestStringInListOfStrings {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("Apple", "Banana", "Orange", "Grape", "Mango");

            // Find the longest word in the list
            String s = words.stream()
                    .max(Comparator.comparingInt(String::length)).get();

            // Print the longest word if present
            System.out.println(s);

        }
    }


