package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class CountNumberInDigit {
    public static void main(String[] args) {
        int num = 234567;   // count number is 6
        // logic in java 8 :--->
//        long count = String.valueOf(num).chars().count();
//        System.out.println(count);
        // using data Stucture :-->
        int cnt =0;
        while(num>0){
            num /=10;
            cnt++;
        }
        System.out.println("Number of Digit :"+cnt);

    }
}
