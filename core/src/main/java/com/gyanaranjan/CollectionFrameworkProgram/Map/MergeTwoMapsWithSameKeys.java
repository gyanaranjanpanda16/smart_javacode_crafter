package com.gyanaranjan.CollectionFrameworkProgram.Map;

import java.util.HashMap;

public class MergeTwoMapsWithSameKeys {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"one");
        map1.put(2,"two");
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1,"New Two");
        map2.put(4,"Three");

        // Merge map2 into map1
        map1.putAll(map2);

        System.out.println("Merged map :--");
        System.out.println(map1);
    }
}
