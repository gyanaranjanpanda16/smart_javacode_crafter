package com.gyanaranjan.Top25InterviewProgramQuestions;

public class JavaProgramRemoveAllWhiteSpaceFromString {
    public static void main(String[] args) {
        String input = "OneSpajfsjf  sfjhsjfs  jfjfjs  sfjs";
        String strReplace = input.replaceAll("\\s+", "");
        System.out.println(strReplace);
    }
}
