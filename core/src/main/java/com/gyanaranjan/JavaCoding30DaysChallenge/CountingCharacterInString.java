package com.gyanaranjan.JavaCoding30DaysChallenge;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//String array[] = {"ASDFASDFASDF","AA", "BBB", "CCCC", "DD", "EEDDDAD"};
//        List<String> list = Arrays.asList(array);
//        Map<Integer, String> map = list.stream()
//        .collect(Collectors.toMap(s -> s.length(), s -> s, (x, y) -> {
//        System.out.println("Dublicate key" + x);
//        return x;
//        },()-> new TreeMap<>((s1,s2)->s2.compareTo(s1))));
//        System.out.println(map);
//        Dublicate key AA
//
//  Output will be :-      {12=ASDFASDFASDF, 7=EEDDDAD, 4=CCCC, 3=BBB, 2=AA}
public class CountingCharacterInString {
    public static void main(String[] args) {
//        String [] strArray = {"ASDFASDFASDF","AA", "BBB", "CCCC", "DD", "EEDDDAD"};
//        Map<Integer, String> collect = Arrays.stream(strArray).collect((Collectors.groupingBy(String::length,)));
//        System.out.println(collect);
//        String[] array = {"ASDFASDFASDF", "AA", "BBB", "CCCC", "DD", "EEDDDAD",null};
//        Map<Integer, String> firstOccurrencesMap = new HashMap<>();
//        for (String s : array) {
//            if( s != null) {
//                firstOccurrencesMap.putIfAbsent(s.length(), s);
//            }
//        }

        // Optional: Sort by key in descending order if necessary
//        Map<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
//        sortedMap.putAll(firstOccurrencesMap);
//
//        System.out.println(sortedMap);
        System.out.println("================================================================");
        String[] array = {"ASDFASDFASDF", "AA", "BBB", "CCCC", "DD", "EEDDDAD", null};
        List<String> list = Arrays.asList(array);

        Map<String, Integer> unsortedMap = list.stream().filter(s -> s != null)
                .collect(Collectors.toMap(Function.identity(), String::length));
//        Map<String,Integer> newMap =new TreeMap<>(Comparator.reverseOrder());
//        newMap.putAll(unsortedMap);
//        System.out.println(unsortedMap);
        // Sort the entries by value in descending order and collect in a LinkedHashMap
        LinkedHashMap<String, Integer> sortedByValue = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                       (oldValue, newValue) -> oldValue, // Merge function, not used here as keys are unique
                        LinkedHashMap::new)); // Keep the order of entries as per the sorting

        // Print the sorted map
        System.out.println(sortedByValue);
    }
}

