package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;

public class CheckTwoStringsAreAnagram {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        char[] charArray = s1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(charArray);
        char[] charArray1 = s2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        if(Arrays.equals(charArray,charArray1)){
            System.out.println("Both Strings Are Anagram");
        }else{
            System.out.println("Both Strings Are Not Anagram");
        }
    }
}
