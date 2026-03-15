package com.gyanaranjan.Top25InterviewProgramQuestions;

public class SwapTheValueWithoutUsing3rdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; // o/p will be :-  (20,10)
        a=a+b; //30
        b=a-b; //10
        a=a-b; //20
        System.out.println(a+"  :  " +b);

    }
}
