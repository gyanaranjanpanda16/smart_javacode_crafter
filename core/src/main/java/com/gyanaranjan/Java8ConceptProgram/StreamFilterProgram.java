package com.gyanaranjan.Java8ConceptProgram;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//write a java 8 program takes a list of Strings, flitters out Strings starts with letter 'A'

public class StreamFilterProgram {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Apple","Hari","Ram","Diya","Ranjan","Pintu","Appa");
        List<String> stream = l.stream().filter(n->!n.startsWith("A")).map(n->n.toUpperCase())
                .collect(Collectors.toList());
        double stream1 =l.stream().mapToInt(String::length).average().orElse(0.0);
        System.out.println(stream);
        //System.out.println(Math.round(stream1));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String format = decimalFormat.format(stream1);
        System.out.println(format);
    }
}
