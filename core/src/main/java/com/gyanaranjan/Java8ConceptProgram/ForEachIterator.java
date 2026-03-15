package com.gyanaranjan.Java8ConceptProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
//        al.forEach(System.out::println);
//        al.forEach(n-> System.out.println(n));
        Iterator<Integer> it = al.iterator();
        // print collection element :--
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        // remove if collection not match with condition : ---
        while (it.hasNext()) {
            Integer i = it.next();
            if (i ==30) {
                it.remove();
            }
        }
        System.out.println(al);
        // Print the first item
//        it.forEachRemaining(n->System.out.println(n));

        }
    }

