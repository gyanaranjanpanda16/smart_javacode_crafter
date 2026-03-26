package com.gyanaranjan.dsa.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.max;

public class Java8 {
    public static void main(String[] args) {
        //java 8 filter  even number
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(collect);
        //java 8 unique number
        String i = String.valueOf(Arrays.asList(1, 7, 8, 2, 2, 3, 6, 6, 8).stream().distinct().max(Integer::compare).orElseThrow());
        String string = i;
        System.out.println(i);

    }

    private static <T> void max(Comparator<T> tComparator) {
    }
}
