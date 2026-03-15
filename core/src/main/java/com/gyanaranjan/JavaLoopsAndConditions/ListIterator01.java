package com.gyanaranjan.JavaLoopsAndConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 // Both direction can be Reverse :--
public class ListIterator01 {
    public static void main(String[] args) {
        List<String> listStr =new ArrayList<>();
        listStr.add("hello");
        listStr.add("hii");
        listStr.add("ram");
        listStr.add("shyam");
        ListIterator<String> stringListIterator = listStr.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previous());
        }
    }
}
