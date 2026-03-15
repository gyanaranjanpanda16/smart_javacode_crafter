package com.gyanaranjan.Top25InterviewProgramQuestions;

public class CheckNumberPositiveOrNegative {
    public static void main(String[] args) {
        int number = -10;
        String result = (number < 0) ? "Negative" : (number > 0) ? "Positive" : "Zero";
        System.out.println(result);
    }
}
