package com.gyanaranjan.NewJava8ProgramCollection;

import java.util.Arrays;

public class Java8StringBasedQuestion {
    public static void main(String[] args) {
     String [] str = {"Rintu","Priya","Rahul","Boby","laxmi"};
     // 1 ) filter according 4 letter in String Array:-
    //        Arrays.stream(str).filter(name->name.length()==4).forEach(System.out::println);
     //2)  find out "laxmi" add with "Kanta" rest left as it , Print "laxmiKanta".
//        Object[] array = Arrays.stream(str).filter(n -> n.equalsIgnoreCase("laxmi"))
//                .map(s -> s+ " Kanta").toArray();
//        System.out.println(Arrays.toString(array));
    //3) Those are starts with "R" count And Print them :-
//        long count = Arrays.stream(str).filter(s -> s.startsWith("R")).count();
//        long count = Arrays.stream(str).filter(s -> {
//                if (s.startsWith("R")) {
//                    System.out.println(s);
//                    return true;
//                }
//                return false;
//        }).count();
//        System.out.println(count);
       //4)

    }
}
