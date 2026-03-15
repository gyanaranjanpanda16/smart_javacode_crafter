package com.gyanaranjan.NewJava8ProgramCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("John","Alex","Alice","Bob");
//        list.sort(Comparator.comparing(n->n.length()));
//        Collections.sort(list,Comparator.comparing(n->n.length()));
        list.sort(Comparator.comparing(String::length));
        System.out.println(list);




    }
}
