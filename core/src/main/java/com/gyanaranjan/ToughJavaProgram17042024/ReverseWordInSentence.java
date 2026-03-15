package com.gyanaranjan.ToughJavaProgram17042024;

import java.util.Arrays;
import java.util.stream.Collectors;

//Write a Java method reverseWords(String s) that takes in a string containing multiple words separated
//        by spaces and returns a new string where the words are reversed. You should preserve the order
//        of words and spaces in the input string.
//        Example:
//        Copy code
//        Input: "Hello World Java"
//        Output: "olleH dlroW avaJ"
//        Input: "Keep coding"
//        Output: "peeK gnidoc"
// DRVPR3778F
public class ReverseWordInSentence {

    public static String reverseWords(String s) {
        // Split the input string into words using space as delimiter
        String[] words = s.split(" ");

        // Reverse each word using streams and collectors
        return Arrays.stream(words)
                .map(word -> new StringBuilder(word).reverse()) // Reverse each word
                .collect(Collectors.joining(" ")); // Join the reversed words with space as delimiter

    }

    public static void main(String[] args) {

        System.out.println(reverseWords("Hello World Java"));
    }
}