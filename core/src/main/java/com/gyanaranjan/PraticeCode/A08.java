package com.gyanaranjan.PraticeCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A08 {
    public static void main(String[] args) {
        int [] arr1 = { 1,4,5,7,6,7};
        int [] arr2 = { 1,3,5,7,6,8}; // common element in array
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i :arr1){
            set1.add(i);
        }
        for(int i :arr2){
            set2.add(i);
        }
        for(int i :set1){
            if(set1.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
