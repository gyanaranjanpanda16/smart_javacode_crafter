package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;

public class MaximumElementInAnUnSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,6,7,8,99,100,4};  // output will be  100.
        int asInt = Arrays.stream(arr).max().getAsInt();
        System.out.println(asInt);
    }
}
