package com.gyanaranjan.Top25InterviewProgramQuestions;

public class FindLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 9, 19, 3, 7, 2};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
               max=arr[i] ;
            }
        }
        System.out.println(max);
    }
}
