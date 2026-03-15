package com.gyanaranjan.InterviewQ;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindromeUsingHashMap {
    public static void main(String[] args) {
        String str = "aba";
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFreqMap = new HashMap<>();

        // Calculate character frequencies for the first half of the string
        for (int i = 0; i < str.length() / 2; i++) {
            char c = str.charAt(i);
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }

        // Check characters from the second half of the string against the frequencies stored in the HashMap
        for (int i = str.length() - 1; i >= str.length() / 2; i--) {
            char c = str.charAt(i);
            if (!charFreqMap.containsKey(c) || charFreqMap.get(c) == 0) {
                // If the character is not present in the HashMap or its frequency is zero, it's not a palindrome
                return false;
            }
            // Decrease the frequency of the character in the HashMap
            charFreqMap.put(c, charFreqMap.get(c) - 1);
        }

        // If all characters in the second half match with frequencies in the HashMap, it's a palindrome
        return true;
    }
}
