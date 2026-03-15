package com.gyanaranjan.ArrayProgram01;

public class FindingAllPairsofElementsInaArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("Pair of elements : ");
        for(int i= 0; i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }

    }
}
