package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;

public class WapSpiltTheStringBySpace {
    public static void main(String[] args) {
        String s1 = "gyana ranjan panda";
        //using java 8 ways :-->
        String[] array = Arrays.stream(s1.split("\\s+")).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
