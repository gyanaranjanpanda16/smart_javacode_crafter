package com.gyanaranjan.CollectionFrameworkProgram.Map;

import java.util.*;

public class SortHashMapByKeysorValues {
    public static void main(String[] args) {
        HashMap<Integer, String> sortMap = new HashMap<>();
        sortMap.put(10,"hari");
        sortMap.put(15,"ram");
        sortMap.put(3,"avay");
        System.out.println(sortMap);
        // convert  hash map to Map.Entry objects :
       List<Map.Entry<Integer, String>> entries = new ArrayList<>(sortMap.entrySet());
       // sort  based on keys :->
        Collections.sort(entries,Comparator.comparing(Map.Entry::getKey));
//         sort  based on values :->
//        Collections.sort(entries,Comparator.comparing(Map.Entry::getValue));

        // create a linkedHashMap :--->
        LinkedHashMap<Integer, String> objectObjectLinkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,String> entry:entries){
            objectObjectLinkedHashMap.put(entry.getKey(),entry.getValue());
        }
//        System.out.println("Sorted HashMap by Values :");
        System.out.println("Sorted HashMap by Keys :");
        System.out.println(objectObjectLinkedHashMap);

    }
}
