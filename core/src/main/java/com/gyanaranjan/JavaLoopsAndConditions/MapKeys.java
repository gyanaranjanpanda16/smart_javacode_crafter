package com.gyanaranjan.JavaLoopsAndConditions;

import java.util.*;

public class MapKeys {
    public static void main(String[] args) {
        HashMap<String,Integer> iterateMap = new HashMap<>();
        iterateMap.put("a",1);
        iterateMap.put("b",2);
        iterateMap.put("c",3);

        // Using keSet() and enhancedloop
        for(Map.Entry<String, Integer> key :iterateMap.entrySet()){
            System.out.println(key+"   "+iterateMap.get(key));
        }
        // usinf keyset and iterator
        Iterator<Map.Entry<String, Integer>> iterator = iterateMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next+"   "+iterateMap.get(next));
        }

    }
}
