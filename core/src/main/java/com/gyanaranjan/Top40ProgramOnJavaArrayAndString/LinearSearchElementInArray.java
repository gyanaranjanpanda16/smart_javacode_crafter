package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class LinearSearchElementInArray {
    public static void main(String[] args) {
        int [] arr = {20,5,6,8,89,9,9,10};
        int searchElement= 9;
        boolean flag = false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==searchElement){
                System.out.println("Yes Found Element In Given Array :- " +arr[i]);
                flag= true;
                break;
            }
        }
        if(!flag){
            System.out.println("Search Element is Not present in Array :-");
        }

    }
}
