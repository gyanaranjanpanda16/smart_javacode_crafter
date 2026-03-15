package com.gyanaranjan.StsIdeProgram.gyanaranjan;

import java.util.HashMap;
import java.util.Map;

// write a program to check String occurrence given String = Gyanaranjan .


public class Test10 {
    public static void main(String[] args) {
		String name = "gyanaranjanpanda";
		char[] namechr = name.toCharArray();
		Map<Character,Integer> namemap = new HashMap<>();
		for(char c :namechr) {
			if(namemap.containsKey(c)) {
				namemap.put(c,namemap.get(c)+1);
			}else {
				namemap.put(c,1);
			}
			
		}
    	System.out.println(namemap);	
	}

}
