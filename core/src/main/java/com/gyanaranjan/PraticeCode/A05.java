package com.gyanaranjan.PraticeCode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A05 {
    public static void main(String[] args) {
        int [] arr = {10,20,40,67,20,40,56};
        Map<Integer, Long> collect = Arrays.stream(arr).mapToObj(n -> (Integer) n)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        Iterator<Map.Entry<Integer, Long>> iterator = collect.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Long> next = iterator.next();
            System.out.println(next.getKey() +"    "+ next.getValue());
        }

    }
}
