package com.gyanaranjan.NWPro01;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringWithDigitProblem {
    public static void main(String[] args) {


        String s = "AZ3344az";
        IntStream chars = s.chars();
        System.out.println(chars.boxed().filter(n -> !Character.isDigit(n)).map(Character::toString).collect(Collectors.toList()));
//                .filter(n->{
//            if(n!=51&n!=52){
//                return true;

//            }else{
//                return false;
//            }
//        }).map(Character::toString).collect(Collectors.toList()));

    }
}
