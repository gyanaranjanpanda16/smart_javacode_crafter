package com.gyanaranjan.Top25InterviewProgramQuestions;

public class ReverseStringWithoutBuitInFunction {
    public static void main(String[] args) {
        String str = "gyanaranjan";
        // using third String :-
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        // without using third String :-
//        for(int i=str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }

    }
}
