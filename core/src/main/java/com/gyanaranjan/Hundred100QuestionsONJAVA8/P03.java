package com.gyanaranjan.Hundred100QuestionsONJAVA8;

// What is stream Api in java 8 , how filtering and mapping works ?

import java.util.Arrays;
import java.util.List;

// Stream Api :-> sequence data acces procees some operation , and immutable , lazy and functional Apporach :-
public class P03 {
    public static void main(String[] args) {
//        Stream can get from  own collection , or collection , or Array .
        List<String> str  = Arrays.asList("John", "Alice", "Bob", "David", "Dva");
        //filter out d strts with letter :-
        str.stream().filter(n->n.startsWith("D")).forEach(System.out::println);
        // count Each String length :-
        List<Integer> list = str.stream().map(String::length).toList();
        System.out.println(list);


    }

}
