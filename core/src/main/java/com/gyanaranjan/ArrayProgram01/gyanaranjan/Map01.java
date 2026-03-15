package com.gyanaranjan.ArrayProgram01.gyanaranjan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ram");
        map.put(2, "hari");
        map.put(3, "shyam");
        map.put(4, "sita");
        map.put(5, "pritam");
        System.out.println(map.entrySet());
        // Iterating through the Map using forEach
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println("====================================================");
        // Removing the entry with key "2"  or value "sita" using Iterator
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getValue().equals("sita")) {
                iterator.remove();
            }
        }
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println("=+=++===+===========================================");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

};
//        -----------------------------------------------------------------------------------
//    import java.util.ArrayList;
//    import java.util.Iterator;
//    import java.util.List;
//
//    public class AddValueForEachRemainingExample {
//        public static void main(String[] args) {
//            List<Integer> numbers = new ArrayList<>();
//            numbers.add(10);
//            numbers.add(15);
//            numbers.add(25);
//
//            Iterator<Integer> iterator = numbers.iterator();

//            // Creating a Consumer to add 20 to each element
//            java.util.function.Consumer<Integer> addTwenty = number -> {
//                // Adding 20 to each element
//                System.out.println("Original value: " + number);
//                number += 20;
//                System.out.println("Updated value: " + number);
//            };

            // Using forEachRemaining to apply the addTwenty Consumer to each element
//            iterator.forEachRemaining(addTwenty);

//    }
//
//
//}


