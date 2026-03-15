package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;

public class CountWordsInaString {
    public static void main(String[] args) {
        String str = "Welcome to Java a new Way of Programming "; // output will be 8 .
        String [] strArr= str.split(" ");
        for(String rev :strArr){
            StringBuilder builder = new StringBuilder(rev);
            StringBuilder reverse = builder.reverse();
            System.out.print(reverse+" ");
        }

        System.out.println("++++++++++++++++++++++");
        // counting words :----
        int count =0;
        for(String st :strArr){
            count++;
        }
        System.out.println("Words are " +count+"  Present In Given String ");
    }
}
