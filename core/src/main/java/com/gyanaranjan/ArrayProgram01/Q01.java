package com.gyanaranjan.ArrayProgram01;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
        int [] arr = new int[4];
        arr[0] =10;
        arr[1] =6;
        arr[2] =7;
        arr[3] =8  ;
        int searchvalue = 7;
        int index =1;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == searchvalue) {
                index += i;
                break;
            }
        }
//            int sum = 0;
//            for (int num : arr){
//                sum += num;
//            }
//            System.out.println(sum);
//            double avg = (double) sum/ arr.length;
//            System.out.println(avg);
//        System.out.println(index);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr ));
        }
    }

