package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        String str = "Java programming  selenium Automation";
        String s = str.replaceAll("\\s+", "");
        String st= " 1 java is 3 good";
        String s1 = st.replaceAll("\\s+|[^\\d+]", "");
        System.out.println(s1);
        System.out.println(s);
    }
}
