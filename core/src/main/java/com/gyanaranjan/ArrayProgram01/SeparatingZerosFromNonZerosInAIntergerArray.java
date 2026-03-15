package com.gyanaranjan.ArrayProgram01;

import java.util.Arrays;

public class SeparatingZerosFromNonZerosInAIntergerArray {
    public static void main(String[] args) {
       int [] arr = {0,2,0,1,0,3,4};  // output will be :--[2, 1, 3, 4, 0, 0, 0]
       int [] result = new int[arr.length];
       int index =0;

       // copy non-zero elements :=>
        for(int num :arr){
            if(num!=0){
                result[index++]=num;
            }
        }
        // copy zero elements :=>
        for(int num :arr){
            if(num ==0){
                result[index++]=num;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
