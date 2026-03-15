package com.gyanaranjan.CollectionFrameworkProgram.Map;

import java.util.*;

public class SortingInMap {
    public static void main(String[] args) {
        HashMap<Integer, String> integerHashMap = new HashMap<>();
        integerHashMap.put(1,"One");
        integerHashMap.put(20,"Twenty");
        integerHashMap.put(11,"Eleven");
        System.out.println(integerHashMap);
        integerHashMap.forEach((k,v)-> System.out.println(k+"  :  "+v));
        // sort by keys :-
        // sort by values :-
        // Sort by keys
//        Map<Integer, String> sortedByKey = new TreeMap<>(integerHashMap);
//        System.out.println("\nSorted by keys:");
//        sortedByKey.forEach((k, v) -> System.out.println(k + "  :  " + v));

        // Sort by values
        List<Map.Entry<Integer, String>> entrySort = new ArrayList<>(integerHashMap.entrySet());
        Collections.sort(entrySort, Map.Entry.comparingByValue());
        System.out.println("-----------------------------");
        LinkedHashMap<Integer, String> sortedByKey = new LinkedHashMap<>();
        entrySort.forEach(entry -> sortedByKey.put(entry.getKey(), entry.getValue()));

        System.out.println("\nSorted by values:");
        sortedByKey.forEach((k, v) -> System.out.println(k + "  :  " + v));
        System.out.println("--------------------------------");
        List<Map.Entry<Integer, String>> entrySort1 = new ArrayList<>(integerHashMap.entrySet());
        Collections.sort(entrySort1, Map.Entry.comparingByKey());

        LinkedHashMap<Integer, String> sortedByValue = new LinkedHashMap<>();
        entrySort1.forEach(entry -> sortedByValue.put(entry.getKey(), entry.getValue()));

        System.out.println("\nSorted by keys:");
        sortedByValue.forEach((k, v) -> System.out.println(k + "  :  " + v));
    }
}
