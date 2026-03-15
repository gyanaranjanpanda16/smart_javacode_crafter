package com.gyanaranjan.PraticeCode;

public class FindTargetElementInArray {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,9};
    int target = 20; // a,b,c = 20;
    for(int i =0;i<arr.length-2;i++){
        for(int j=i+1;j< arr.length-1;j++){
            for(int k=j+1;k< arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==20){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }
      }
    }
}
