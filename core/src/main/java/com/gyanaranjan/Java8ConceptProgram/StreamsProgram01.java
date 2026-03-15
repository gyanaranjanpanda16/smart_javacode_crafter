package com.gyanaranjan.Java8ConceptProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProgram01 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        //util 7 not to use Streams :-
        List<Integer> l1= new ArrayList<Integer>();
        for(Integer i1:l){
            if(i1%2==0){
                l1.add(i1);
            }
        }
        System.out.println(l1);
        // using Streams version :-->
        List<Integer> l2 =l.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(l2);
        //map function are covert single element to modified element ..
        List<Integer> l3 =l.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(l3);

    }
}
