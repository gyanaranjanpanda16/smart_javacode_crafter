package com.gyanaranjan.StringImportantsPrograms;


public class ReverseSentenceInString {
    public static void main(String[] args) {
        String sentence = "Hello World Java"; // O/p will be :- Java World Hello
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
    }
}
