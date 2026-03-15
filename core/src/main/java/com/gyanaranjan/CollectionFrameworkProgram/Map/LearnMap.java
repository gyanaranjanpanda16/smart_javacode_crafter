package com.gyanaranjan.CollectionFrameworkProgram.Map;

import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
       Map<String,String> person = new TreeMap<>();
        List<?> personlist = new ArrayList<>();
        Set<?> personset = new HashSet<>();
        System.out.println(person);
        System.out.println(personlist);
        System.out.println(personset);
       person.put("firstName :","Gyanaranjan");
       person.put("lastName :","Panda");
       person.put("roll No :","102");
        System.out.println(person);
    }
}
