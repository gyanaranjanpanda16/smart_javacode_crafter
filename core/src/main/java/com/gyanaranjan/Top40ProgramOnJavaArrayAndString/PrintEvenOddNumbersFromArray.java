package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class PrintEvenOddNumbersFromArray {
    public static void main(String[] args) {
        int [] arr= {4,7,9,3,4,6,10};
        System.out.println("----------------------");
        for(int value :arr) {
            if (value % 2 == 0) {
                System.out.println("Even value are :-->" + value);
            } else {
                System.out.println("Odd value are :-->" + value);
            }
        }
        System.out.println("================================");


        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even number in Array :-->"+arr[i]);
            }else{
                System.out.println("Odd number in Array :-->"+arr[i]);
            }
        }
    }
}
