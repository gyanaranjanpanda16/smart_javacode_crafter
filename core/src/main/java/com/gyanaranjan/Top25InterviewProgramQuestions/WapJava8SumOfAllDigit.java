package com.gyanaranjan.Top25InterviewProgramQuestions;

public class WapJava8SumOfAllDigit {
    public static void main(String[] args) {
        int num = 154;  // o/p: 10;
        int sum = String.valueOf(num).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);

    }
}
