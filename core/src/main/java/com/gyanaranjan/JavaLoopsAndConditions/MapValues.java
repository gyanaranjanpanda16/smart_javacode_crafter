package com.gyanaranjan.JavaLoopsAndConditions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapValues {
    public static void main(String[] args) {
        HashMap<String,Integer> iterateMap = new HashMap<>();
        iterateMap.put("a",1);
        iterateMap.put("b",2);
        iterateMap.put("c",3);

        // Using keSet() and enhancedloop
        for(Integer value :iterateMap.values()){
            System.out.println(value+"   "+iterateMap.get(value));
        }
        // usinf keyset and iterator
        Iterator<Integer> iterator = iterateMap.values().iterator();
        while (iterator.hasNext()){
            Integer values = iterator.next();
            System.out.println(values+"   "+iterateMap.get(values));
        }
    }
}
