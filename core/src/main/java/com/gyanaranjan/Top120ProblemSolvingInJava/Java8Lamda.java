package com.gyanaranjan.Top120ProblemSolvingInJava;

@FunctionalInterface
interface LamdaExample{
    public int calculate(int a,int b);
}
public class Java8Lamda {
    public static void main(String[] args) {
        LamdaExample example = Integer::sum;
        LamdaExample example1=Integer::max;
        int calculate = example.calculate(20, 50);
        int calculate1 = example1.calculate(20, 50);
        System.out.println("Sum Of Two Number : "+calculate);
        System.out.println("Max Of Two Number : "+calculate1);
    }
}
