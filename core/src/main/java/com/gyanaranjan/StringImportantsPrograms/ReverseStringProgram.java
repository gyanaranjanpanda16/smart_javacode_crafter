package com.gyanaranjan.StringImportantsPrograms;

public class ReverseStringProgram {
    public static void main(String[] args) {
        String  a = "name is a bad ";
        // one way :--
//        StringBuilder sb = new StringBuilder(a);
//        System.out.println(sb.reverse());
        // Two way :---
        String rev = "";
        for (int i=a.length()-1;i>=0;i--){
            rev =rev+a.charAt(i);
        }
        System.out.println(rev);
//        System.out.println(rev);
        // Three way :--
//        for(int i =a.length()-1;i>=0;i--){
//            System.out.print(a.charAt(i));
//        }

    }
}
