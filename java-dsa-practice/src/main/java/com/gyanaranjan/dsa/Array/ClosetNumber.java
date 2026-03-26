package com.gyanaranjan.dsa.Array;

import java.util.*;

public class ClosetNumber {
    public static void main(String[] args) {
        int [] arr = {6,7,8,34,10,11,12,22,23};
        Map<Integer,Integer> map = new TreeMap<>();
        int k =3;
        int x = 9;
        for(int ar :arr){
         map.put(ar ,Math.abs(ar-x));
        }
        // Step 2: convert to list for sorting
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // sort by distance
        Collections.sort(list, (a, b) -> a.getValue() - b.getValue());

        // Step 4: pick first k elements
        System.out.print("Closest numbers: ");
        for (int i = 0; i < k; i++) {
            System.out.print(list.get(i).getKey() + " ");
        }
    }
}
