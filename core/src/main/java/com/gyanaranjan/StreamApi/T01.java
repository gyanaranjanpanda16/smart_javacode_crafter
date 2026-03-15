package com.gyanaranjan.StreamApi;

import java.util.function.Function;
import java.util.function.Predicate;

public class T01 {
    public static void main(String[] args) {
        int [] x = {0,3,2,7,6,8,10};
        // Int predicate
        // Long predicate
        // Double predicate
        Function<Integer,Integer> f = i->i*i;
        for(int x1 :x) {
            System.out.print("  "+f.apply(x1));
        }
        // Performance is show in below ways :-
        Predicate <Integer> p =i ->i%2==0;// Integer to Int (Auto-unboxing)
        for(int x1 :x){
            if(p.test(x1)){ // int convert to Integer type (Auto-boxing)
                System.out.println(x1);
            }
        }

    }
}
