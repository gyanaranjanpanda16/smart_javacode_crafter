package com.gyanaranjan.ArrayProgram01;

import java.util.ArrayList;

public class FindingSubArraySum {

    public static void findSubArrayWithSum(int [] arr , int targetSum){  // targetSum = 33
        int currentSum= 0;
        int start =0;
        ArrayList<Object> subArray = new ArrayList<>();
        for(int i =0;i< arr.length;i++){
            currentSum+=arr[i];
            subArray.add(arr[i]);
            while(currentSum>targetSum&&start<=1){
                currentSum -= arr[start];
                subArray.remove(0);
                start++;

            }
            if(currentSum==targetSum){
                System.out.println("SubArray found with given sum :"+subArray);
                return;
            }
        }
        System.out.println("SubArray  with Given sum not Found :-");
    }



    public static void main(String[] args) {
        int [] arr ={1,4,20,3,10,5};
        int targetSum = 13;
        findSubArrayWithSum(arr,targetSum);

    }
}
