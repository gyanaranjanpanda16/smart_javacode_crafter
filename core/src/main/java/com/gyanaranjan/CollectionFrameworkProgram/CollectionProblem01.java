package com.gyanaranjan.CollectionFrameworkProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionProblem01 {
    public static void main(String[] args) {
        List<String >  names = new ArrayList<String>(6);
        names.add("Gyana");
        names.add("Panda");
        System.out.println(names);
        names.remove("Panda");
        names.add("Rintu");
        System.out.println(names);
        if(names.isEmpty()){
            names.add("Panda");
        }
        System.out.println(names);
        boolean abc = names.contains("Gyana");
        if (names.contains("Gyana")){
            names.set(0,"Ranjan");
        }
        System.out.println(abc);
        System.out.println(names.size());
        System.out.println("++++++++++++++++++");
        Object[] array = names.toArray();
        System.out.println(array);
        Iterator ite = names.listIterator();
        while (ite.hasNext()){
            Object next = ite.next();
            System.out.println(next);
        }
        names.clear();
    }
}
