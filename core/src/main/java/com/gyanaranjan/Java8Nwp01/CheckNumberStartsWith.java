package com.gyanaranjan.Java8Nwp01;

import java.util.Arrays;

public class CheckNumberStartsWith {
    public static void main(String[] args) {
        int[] arr = {10, 67, 45, 19, 117}; // find out those starts with 1
        int[] array = Arrays.stream(arr).filter(n -> String.valueOf(n).startsWith("1")).toArray();
        System.out.println(Arrays.toString(array));
    }
}
