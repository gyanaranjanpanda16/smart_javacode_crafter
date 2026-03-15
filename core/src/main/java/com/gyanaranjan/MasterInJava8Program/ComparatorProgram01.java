package com.gyanaranjan.MasterInJava8Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorProgram01 {
    public static void main(String[] args) {

       List<String> names = new ArrayList<String>();
       names.add("John");
       names.add("Rintu");
       names.add("Horn");
       names.add("Shayam");
       names.add("Priya");
       // comparare based on name :
//        Collections.sort(names);
//        System.out.println(names);
//        names.sort((name1, name2) ->name1.compareTo(name2));
//        names.sort(Comparator.naturalOrder());
        names.sort(String::compareTo);
        System.out.println(names);






    }
}
