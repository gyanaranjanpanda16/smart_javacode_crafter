package com.gyanaranjan.Top25InterviewProgramQuestions;

public class FindFactorialOfNumberIterativeApporach {
    // Recursion Approach :->
    public static  int factorial(int n){
        if (n == 0||n<0) {
           return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        // iterative Approach :->
        int n = 3;
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial *=i;
        }
//        System.out.println(factorial);
        System.out.println( factorial(3));


    }
}
