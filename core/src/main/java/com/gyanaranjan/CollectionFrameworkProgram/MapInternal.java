package com.gyanaranjan.CollectionFrameworkProgram;

import java.util.*;

public class MapInternal {
//    TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();
    //        objectObjectTreeMap.put("ram",null);   :-> NO  ERROR
//        objectObjectTreeMap.put(null,"hari");  :->  NULL
//        objectObjectTreeMap.put(null,null);    :->  NULL
    public static void main(String[] args) {
     Map<String,Integer> map1 = new HashMap<>();
   //     Map<String,Integer> map1 = new LinkedHashMap<>();
//        Map<String,Integer> map1 = new TreeMap<>();//--> follow above
        map1.put("Ashok",107);
//        map1.put(null,null);
        map1.put("Rintu",107);
//        map1.put(null,110);
        map1.put("Panda",107);
        System.out.println(map1);
        Set<Map.Entry<String, Integer>> entrySet = map1.entrySet();

//        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
//        System.out.println(entries);

//                stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//                .forEach(System.out::println);
    }
}
