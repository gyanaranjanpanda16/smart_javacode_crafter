package com.gyanaranjan.StringImportantsPrograms;

public class StringConcations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        StringBuilder sb = new StringBuilder();

        String jii = str1.concat("jii");
        String result = str1.concat(" ").concat(str2); // result will be "Hello World"
        System.out.println(result);
        System.out.println(jii);
    }
}
