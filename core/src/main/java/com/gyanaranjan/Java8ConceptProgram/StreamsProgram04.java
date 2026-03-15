package com.gyanaranjan.Java8ConceptProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsProgram04 {
    public static void main(String[] args) {
        // -> toArray() :-- to copy elements presents in a Stream  in specific Array
        // -->Stream.of() :-- we can also apply Stream for group of value and for Arrays.
        // for group  of value
         ArrayList<Integer> l = new ArrayList<Integer>();
                l.add(18);
                l.add(12);
                l.add(23);
                l.add(84);
                l.add(5);
//                Integer[] array =l.stream().toArray(n->new Integer[n]);
                Integer[] array =l.stream().toArray( Integer[]::new);
        System.out.println(Arrays.toString(array));
//        System.out.println(array[4]);
//        Stream<Integer> s = Stream.of(9,20,3,5,6,7,7);
//        s.forEach(System.out::print);
        Integer[] d= {10,20,49,67,89,990};
        Stream<Integer> s = Stream.of(d);
        s.forEach(System.out::print);
//        Predicate p = ()->
        Consumer<String> c = s1-> System.out.println(s1);
        c.accept("hii my name is Rintu");


    }
}
