package com.gyanaranjan.ArrayProgram01;

// int [] arr = {1,5,3,4,6,3,4}; o/p -3
public class firstRepeatingNumber {
    public static void main(String[] args) {
        int [] arr = {1,5,3,1,6,4};
        for(int i =0;i<arr.length;i++){
            for(int j =i+1 ;j< arr.length;j++){
                if(arr[j]==arr[i]){
                    System.out.println(arr[i]);
                }
            }

        }


    }
}
