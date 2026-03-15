package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
    int [] arr = {1,3,6,7,8,3,8,9};
     //  data st. way :-
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
         if(arr[i]==arr[i+1]){
             System.out.println("Duplicate Array is : "+arr[i]);
         }
     }
        // using Hash-set :-->
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int a :arr){
            if(!set1.add(a)){
                set2.add(a);
            }
        }
        System.out.println(set2);
    }
}
