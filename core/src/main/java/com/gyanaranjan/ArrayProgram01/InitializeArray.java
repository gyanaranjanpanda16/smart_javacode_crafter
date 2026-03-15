package com.gyanaranjan.ArrayProgram01;

import java.util.Arrays;

class InitializeArray {
/*    Array :-  An array is a data structure/object in Java used to store many homogeneous data
                elements in a single variable. Arrays are index-based, which means indices start
                from zero (0). Data insertion and access in arrays are very fast,  and array performance
                is high. However, arrays have relatively few predefined method . */

    // Array initialization in java :--
    //              Array symbol is square bracket.--> []. not Array -- only symbol [].
    //               int [] array = new int[0];//--> initialized by new keyword , yes zero size can be declared.
//                     int [] arr = new int [3];
//                     arr[0]=1;
//                     arr[1]=1;
//                     arr[2]=1;

    //              int[] arr ={1,2,3,4,5,6,7,8,9,10};// direct declare of Array Initialization .
    //              int [] arr1 = new int[]{10,20,30,40,50}; //--> anonymous way array declare, but size not to declare.
    public static void main(String[] args) {
//        way of writing Array :--
//        DataType --Array Symbol-- --variable Name -- = new keyword --DataType-- -Array Symbol-- [array size] or
//        { } or new dataType [] { ----- Elements --- } .
//        length:
//               Returns the length of the array (the number of elements).
        int[] myArray = {1, 2, 3, 4, 5};
        int length = myArray.length; // length is 5
        System.out.println(length);
//        clone:
//              Creates a shallow copy of the array.
        int[] originalArray = {1, 2, 3, 4, 5, 6};
        int[] clonedArray = originalArray.clone();
        System.out.println(Arrays.toString(clonedArray));
//        toString:
//                Converts the array to a string representation.
        int[] myArrayToString = {1, 2, 3, 4, 5};
        String arrayString = Arrays.toString(myArrayToString);
        System.out.println(arrayString);
//        copyOf:
//                 Copies the specified range of the array.
        int[] originalArray1 = {1, 2, 3, 4, 5};
        int[] copyArray = Arrays.copyOf(originalArray1, 1); // Copies first 3 elements
        System.out.println(Arrays.toString(copyArray));
//        equals:
//               Checks if two arrays are equal.
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(array1, array2); // Returns true
        System.out.println(isEqual);
//        fill:
//        Fills the array with a specified value.
        int[] myArrayfill = new int[5];
        Arrays.fill(myArrayfill, 42); // Fills the array with 42
        System.out.println(Arrays.toString(myArrayfill));
        // Array initialize :--
        int [] arr = new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(Arrays.toString(arr));
        System.out.println("Ways of print Array element :--");
        System.out.println("+++++++ for-Each loop +++++++++++");
        // Array iterate :--->
        // using for-each loop :-
        System.out.print("[ ");
        for(int a :arr){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println("]");
        System.out.println("+++++++ For-loop +++++++++++");
        // using for loops :-->
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("+++++++++ using Stream Api ++++++++++");
        Arrays.stream(arr).forEach(System.out::print);
    }
}



