package com.gyanaranjan.ArrayProgram01;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionExample {
    public static void main(String[] args) {
        Integer [] array1 ={1,2,3,4,5};
        Integer [] array2 ={3,4,8,6,7};
        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));

        // find intersection using retainAll()
        list1.retainAll(list2);
        System.out.println(list1);
        System.out.println("----------------------------");
        // convert the result back to an Array
        Integer[] array = list1.toArray(new Integer[0]);
        System.out.println("Intersection of arrays : ");
        for(Integer num :array){
            System.out.print(num +"  ");
        }


    }
}
