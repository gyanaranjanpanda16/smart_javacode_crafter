package com.gyanaranjan.Java8ConceptProgram;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MapFilter {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,9,8,78,6,9,10);
       OptionalDouble l1=l.stream().mapToInt(n->n*n).filter(n->n<=50).average();
        System.out.println(l1);
    }

}
