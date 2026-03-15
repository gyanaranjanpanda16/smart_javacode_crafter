package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class CountEvenOddInaNumber {
    public static void main(String[] args) {
        int number = 159234478; // o/p will be Even Digits :- 3 , Odd digits :- 3
        int total_Count =0;
        int even_Count = 0;
        int odd_Count = 0;
        while(number>0){
            number= number/10;
            if(number%2==0){
                even_Count++;
            }else {
                odd_Count++;
            }
            total_Count++;
        }
        System.out.println("Total number are : "+total_Count);
        System.out.println("Even Count  Are :"+even_Count+"  Odd Count Are :"+odd_Count);
    }
}
