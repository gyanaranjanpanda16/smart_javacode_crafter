package com.gyanaranjan.StsIdeProgram.gyanaranjan;

import java.util.Arrays;

public class Test14 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ollhe";
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1,char2)){
            System.out.println("Given String is Anagram");
        }else {
            System.out.println("Given String is not a Anagram");
        }

    }
}
