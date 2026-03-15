package com.gyanaranjan.ArrayProgram01;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,7,8,9,7}; // find duplicate element in Array
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i :arr){
            if(!set1.add(i)){
                set2.add(i);
            }
        }
        System.out.println(set2);
    }
}
