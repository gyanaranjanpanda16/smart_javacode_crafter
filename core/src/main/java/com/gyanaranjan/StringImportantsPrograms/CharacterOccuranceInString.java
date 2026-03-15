package com.gyanaranjan.StringImportantsPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccuranceInString {
    public static void main(String[] args) {
        String str = "welcome";
        char[] ch = str.toCharArray();
        Map<Character, Integer> countcharmap = new LinkedHashMap<>();
        for(char c :ch){
            if(countcharmap.containsKey(c)){
                countcharmap.put(c,countcharmap.get(c)+1);
            }else{
                countcharmap.put(c,1);
            }
        }
        System.out.println(countcharmap);
    }
}
