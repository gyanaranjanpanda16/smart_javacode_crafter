package com.gyanaranjan.ZenCodingRoundQuestions01;


public class LongestEvenWord {

    public static String findLongestEvenWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+");
        String longestEvenWord = "";

        for (String word : words) {
            if (word.length() % 2 == 0 && word.length() > longestEvenWord.length()) {
                longestEvenWord = word;
            }
        }

        return longestEvenWord;
    }

    public static void main(String[] args) {
        String sentence = "This is a simple test sentence with some even length words";
        String result = findLongestEvenWord(sentence);
        System.out.println("Longest even length word: " + result);
    }
}
