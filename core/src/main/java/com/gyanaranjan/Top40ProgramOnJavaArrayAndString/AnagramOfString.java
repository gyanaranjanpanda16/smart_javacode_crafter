package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;

public class AnagramOfString {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "acre";
        char[] charArray = s1.toCharArray();
        char[] charArray1 = s2.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        String str = String.valueOf(charArray);
        String str1 = String.valueOf(charArray1);
        // if(str.equals(str1)){
           if(Arrays.equals(charArray,charArray1)){
            System.out.println("Given Strings are  Anagram");
        }else {
            System.out.println("Given Strings are Not  Anagram");
        }

    }
}
