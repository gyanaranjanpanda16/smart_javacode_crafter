package com.gyanaranjan.NewJava8ProgramCollection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacterOccuranceAsListString {


        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "mango");

            // Count the occurrence of each character in all words
            Map<Character, Integer> charCount = words.stream()
                    .flatMapToInt(CharSequence::chars)
                    .mapToObj(ch -> (char) ch)
                    .collect(HashMap::new, (map, ch) -> map.merge(ch, 1, Integer::sum), HashMap::putAll);

            // Print the character count
            System.out.println("Character count:");
            charCount.forEach((character, count) -> System.out.println(character + ": " + count));
        }
    }


