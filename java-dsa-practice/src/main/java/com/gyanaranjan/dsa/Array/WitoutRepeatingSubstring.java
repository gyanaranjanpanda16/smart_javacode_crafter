package com.gyanaranjan.dsa.Array;

import java.util.HashSet;
import java.util.Set;

public class WitoutRepeatingSubstring {

    public static int substring(String substring) {
       int left = 0;
       int max =0;
       Set<Character> set = new HashSet<>();
       for(int i = 0; i < substring.length(); i++){
          while(set.contains(substring.charAt(i))){
              set.remove(substring.charAt(i));
              left++;
          }
          set.add(substring.charAt(i));
          max = Math.max(max, i-left+1);
       }
       return max;
    }
    public static void main(String[] args) {

        System.out.println(substring("abcabcdbbab"));


    }
}
