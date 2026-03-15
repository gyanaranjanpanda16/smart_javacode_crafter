package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class RemoveSpecialCharInAString {
    public static void main(String[] args) {
        String str = "DhIK%4$4!D456j@#hggf%h6747gj";
        String s = str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(s);

    }
}
