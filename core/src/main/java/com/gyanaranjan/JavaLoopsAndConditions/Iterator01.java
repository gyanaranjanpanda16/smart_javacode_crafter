package com.gyanaranjan.JavaLoopsAndConditions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// only one direction ae Allowed :-
 public class Iterator01
{
    public static void main(String[] args) {

        List<String> listStr =new ArrayList<>();
        listStr.add("hello");
        listStr.add("hii");
        listStr.add("ram");
        listStr.add("shyam");
        Iterator<String> iterator = listStr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

   
}
