package com.gyanaranjan.PraticeCode;
//
//abc-array = 1,2,3,4,5,7,8,9
//        target = 20
//        a+b+c = target

import java.util.ArrayList;

public class ArrayProgram01 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,9};
        int target = 20; // a+b+c = 20;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i =0;i< arr.length;i++){
            if(arr[i]<9&&arr[i]>=5){
                num.add(arr[i]);
            }

        }
        int sum1 = 0;
        for(int a :num){
            int target1 =20;
            sum1=sum1+a;
            if(target1==sum1){
                System.out.println("Sucessfully found !");
            }
        }

        System.out.println(num);
    }
}
