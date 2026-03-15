package com.gyanaranjan.Top25InterviewProgramQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        // fibonacci series
        int count = 10; // Enter a Number :->
        int firstTerm=0;
        int secondTerm=1;
        for(int i=1;i<=count;i++){
            System.out.print(firstTerm+ " ");
            //compute the next term :-
            int nextTerm = firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;

        }
    }
}
