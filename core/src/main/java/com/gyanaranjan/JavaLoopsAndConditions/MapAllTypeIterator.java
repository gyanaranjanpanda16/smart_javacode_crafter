package com.gyanaranjan.JavaLoopsAndConditions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapAllTypeIterator {
    public static void main(String[] args) {
        // Map.Entry(k,v) :--->
        HashMap<String,Integer> iterateMap = new HashMap<>();
        iterateMap.put("a",1);
        iterateMap.put("b",2);
        iterateMap.put("c",3);

        // iterate entrySet() and enhanced  for loop :--
       for( Map.Entry<String, Integer> entry : iterateMap.entrySet()){
            System.out.println("Get key :"+entry.getKey()+"   Get Values : "+entry.getValue());
        }
        System.out.println("-----------------------------");
        // using entrySet() and iterator.
        Iterator<Map.Entry<String, Integer>> iterator = iterateMap.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<String, Integer> next = iterator.next();
           System.out.println(next.getKey()+"    "+next.getValue());
       }
    }
}
