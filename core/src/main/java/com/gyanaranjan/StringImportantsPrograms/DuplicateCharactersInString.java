package com.gyanaranjan.StringImportantsPrograms;

import java.util.HashMap;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "Hello world";
        String s = str.replaceAll("\\s+", "").toLowerCase();
        System.out.println(s);
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(char c : s.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }
        charCountMap.forEach((k,v) -> {
            if(v>1){
                System.out.println(" "+k+"  appears "+v+"  times ");
            }

        });


    }
}
