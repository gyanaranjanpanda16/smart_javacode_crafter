package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

import java.util.Map;
import java.util.TreeMap;


public class CharacterAndArrayAndWordOccurrence {
    // Character Occurrence Count :-
    Map<Character,Integer> characterCount(String str) {
        char[] chr = str.toCharArray();
        Map<Character, Integer> countmap = new TreeMap<>();
        for (char c : chr) {
            if (countmap.containsKey(c)) {
                countmap.put(c, countmap.get(c) + 1);
            } else {
                countmap.put(c, 1);
            }
        }
      return countmap;
    }
    // String Word Occurrence Count :-
    Map<String,Integer> wordCount(String str) {
        String[] count = str.split(" ");
        Map<String, Integer> countmap = new TreeMap<>();
        for ( String c : count) {
            if (countmap.containsKey(c)) {
                countmap.put(c, countmap.get(c) + 1);
            } else {
                countmap.put(c, 1);
            }
        }
        return countmap;
    }
    //Array Element Occurrence Count:-
    Map<Integer,Integer> ArrayElementCount(int[] arr) {
        Map<Integer, Integer> countmap = new TreeMap<>();
        for (int c : arr) {
            if (countmap.containsKey(c)) {
                countmap.put(c, countmap.get(c) + 1);
            } else {
                countmap.put(c, 1);
            }
        }
        return countmap;
    }

    public static void main(String[] args) {
        String str = "helloiamajavadeveloper";
        String lines = "I WANT A BECOME A GOOD JAVA DEVELOPER AND JAVA IS A GOOD PROGRAMMING LANG";
        int[] arr = {10, 50, 40, 10, 90, 50, 90, 30, 20};
        CharacterAndArrayAndWordOccurrence characterAndArrayAndWordOccurrence = new CharacterAndArrayAndWordOccurrence();
        Map<Character, Integer> characterIntegerMap = characterAndArrayAndWordOccurrence.characterCount(str);
        Map<String, Integer> stringIntegerMap = characterAndArrayAndWordOccurrence.wordCount(lines);
        Map<Integer, Integer> integerIntegerMap = characterAndArrayAndWordOccurrence.ArrayElementCount(arr);
        System.out.println(characterIntegerMap);
        System.out.println(stringIntegerMap);
        System.out.println(integerIntegerMap);

    }
}
