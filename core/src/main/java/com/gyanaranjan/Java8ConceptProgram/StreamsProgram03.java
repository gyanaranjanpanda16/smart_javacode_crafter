package com.gyanaranjan.Java8ConceptProgram;

import java.util.ArrayList;
import java.util.List;

public class StreamsProgram03 {
    public static void main(String[] args) {
        // various method in Stream() :-->
        // sorted() :-->   [default, own sort method ] --> [Ascending order for num, Alphabetical  order]
        // sorted(Comparator c ) --->[ for customized sorting order]
        // forEach() -> to print value in Streams
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(18);
        l.add(12);
        l.add(23);
        l.add(84);
        l.add(5);
//        List<Integer> l1 = l.stream().sorted().toList();
//        List<Integer> l1 = l.stream().sorted((i1,i2)->  -i1.compareTo(i2)).toList();
//        Integer l1 = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
//        Integer l1 = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
//         l.stream().forEach(n-> System.out.println(n));
         l.stream().forEach(System.out::println);
//        System.out.println(l1);

    }
}
