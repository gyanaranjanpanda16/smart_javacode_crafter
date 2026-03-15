package com.gyanaranjan.Java8ConceptProgram;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

class StreamsProgram02 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Apple");
        strings.add("PinePle");
        strings.add("Banana");
        strings.add("Guava");
//        List<String> l=strings.stream().filter(n->n.length()>=6).collect(Collectors.toList());
//        List<String> l=strings.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
//        List<String> l=strings.stream().filter(n->n.length()==5).map(n->n.toUpperCase()).collect(Collectors.toList());
//        long l=strings.stream().filter(n->n.length()==5).count();
        long l=strings.stream().count();
        System.out.println(l);
    }
}
