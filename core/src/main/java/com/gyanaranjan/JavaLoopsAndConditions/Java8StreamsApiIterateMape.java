package com.gyanaranjan.JavaLoopsAndConditions;

import java.util.HashMap;

public class Java8StreamsApiIterateMape {
    public static void main(String[] args) {
        HashMap<String,Integer> iterateMap = new HashMap<>();
        iterateMap.put("a",1);
        iterateMap.put("b",2);
        iterateMap.put("c",3);
        //using for each () and lamda Expression :---
        iterateMap.forEach((k,v)->System.out.println(k+" : "+v));
        // using Stream Api for keys :---
        iterateMap.keySet().stream().forEach(key->System.out.println(key+ "  :  "+iterateMap.get(key)));
       // using Stream Api for values :----
        iterateMap.values().stream().forEach(value->System.out.println( "  "+value+"     "));

    }
}
