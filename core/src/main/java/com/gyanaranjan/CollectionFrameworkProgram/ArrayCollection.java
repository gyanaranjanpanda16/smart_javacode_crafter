package com.gyanaranjan.CollectionFrameworkProgram;

import java.util.Arrays;

class ArrayCollection {
    // Array :-- in array we can Store many data in a single  variable . int[] a = new int [3];
    //           a variable we can store 3 variable which index starts from zero .
    //      :-> 1) In array only support homogeneous element / same type element.
    //          2) In Array  size is fixed . so we can't increase after you declare .
    // TO overcome problem with Array ; to overcome same type element we can use Object Array. Object[] .
    //                                :- to overcome size are fixed , we can use growable Array implement.

    public static void main(String[] args) {
        ArrayCollection arrayCollection = new ArrayCollection();
        // Object [] :==>  insert heterogeneous element in Array .
        Object[] obj = new Object[3];
        obj[0] = 1;
        obj[1] = "Hii";
        obj[2] = arrayCollection;
        for (Object obj2 : obj) {
            System.out.println(obj2);
        }
        // how to implement growable Nature in Array :-
        Object[] tempobj = new Object[5];
        for (int i = 0; i < tempobj.length; i++) {
            if (i < obj.length) {
                tempobj[i] = obj[i];
            }
        }
        tempobj[3] = 45;
        obj = tempobj;
        System.out.println(Arrays.toString(obj));
        System.out.println(obj.length);

    }
}
