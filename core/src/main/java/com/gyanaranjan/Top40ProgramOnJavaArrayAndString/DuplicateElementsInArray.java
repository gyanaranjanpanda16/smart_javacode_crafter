package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        String[] str={"java","c","c++","java"};
        int [] arr= {10,5,6,7,8,5,10};  // find duplicate element

        // take an data structure  way :--
        HashSet<Object> numSet = new HashSet<>();
        HashSet<Object> duplicateStrings = new HashSet<>();
//        for(String s :str){
//              if(!objects.add(s))   {
//                  duplicateStrings.add(s);
//              };
//        }
//        System.out.println(duplicateStrings);
        for(int a :arr){
             if(!numSet.add(a))   {
                  duplicateStrings.add(a);
              };
        }
        System.out.println(duplicateStrings);
    }
}
