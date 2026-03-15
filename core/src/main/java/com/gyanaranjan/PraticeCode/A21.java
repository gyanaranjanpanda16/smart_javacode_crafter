package com.gyanaranjan.PraticeCode;

import java.util.*;

public class A21 {
    public static void main(String[] args) {
   Map<Integer, String> checkMap = new HashMap<>();
        checkMap.put(1,"hii");
        checkMap.put(null,"hii");
        checkMap.put(3,"hii");
//        checkMap.put(null,"hii");
//        checkMap.put(null,"hii");
//        ArrayList<String> objects = new ArrayList<>();
//        objects.add("hii");
//        objects.add("hello");
//        Collection<String> strings = Collections.unmodifiableCollection(objects);
//        strings.add("ghj");
//        System.out.println(objects);
//         checkMap.forEach((k,v)-> System.out.println(k+"  :   "+v));
        for(Integer key : checkMap.keySet()){
            System.out.println(key+"  : "+checkMap.get(key));
        }

    }

}
