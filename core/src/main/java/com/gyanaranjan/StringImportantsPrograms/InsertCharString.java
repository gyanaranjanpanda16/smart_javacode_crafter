package com.gyanaranjan.StringImportantsPrograms;

public class InsertCharString {
    public static void main(String[] args) {
        String s = "gyanaranjan"; // o/p :-- gy-an-ar-an-ja-n
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++){

           if(i%2==0&& i!=0) {
               builder.append("-");
           }
            builder.append(s.charAt(i));
       }
        System.out.println(builder);

    }
}
