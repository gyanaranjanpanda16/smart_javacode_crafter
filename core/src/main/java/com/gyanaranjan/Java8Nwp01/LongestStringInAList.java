package com.gyanaranjan.Java8Nwp01;

import java.util.Arrays;

public class LongestStringInAList {
    public static void main(String[] args) {
        String longestString = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry").stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).orElse(null);
        System.out.println(longestString);
    }
}
