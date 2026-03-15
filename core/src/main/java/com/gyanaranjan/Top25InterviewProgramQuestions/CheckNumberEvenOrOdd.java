package com.gyanaranjan.Top25InterviewProgramQuestions;

public class CheckNumberEvenOrOdd {
    public static void main(String[] args) {
        int num =20;
        if(num<0||num==1){
            System.out.println("can't Determined");
        } else if (num%2==0) {
            System.out.println("It's a Even Number :->");
        }else{
            System.out.println("it's a Odd Number :- ");
        }
    }
}
