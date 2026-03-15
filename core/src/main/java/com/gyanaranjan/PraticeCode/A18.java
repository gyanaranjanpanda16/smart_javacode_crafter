package com.gyanaranjan.PraticeCode;

import java.util.Arrays;
import java.util.List;

public class A18 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 7, 2, 8);
        double asDouble = list.stream().filter(n->n%2==0).mapToInt(Integer::intValue)
                .average().getAsDouble();
        System.out.println(asDouble);
    }
}
