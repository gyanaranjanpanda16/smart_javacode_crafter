package com.gyanaranjan.Hundred100QuestionsONJAVA8;

@FunctionalInterface
interface MathOperation{
    int operate(int x , int y);
}

public class P02 {
    public static void main(String[] args) {
        MathOperation addition = (int a , int b )->a+b;
        System.out.println("Addition  :" + addition.operate(5,3));
        MathOperation subtract = (int a , int b )->a-b;
        System.out.println("Subtraction :" + subtract.operate(5,3));




    }
}
