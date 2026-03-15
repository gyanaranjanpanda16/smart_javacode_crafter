package com.gyanaranjan.PraticeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8ExampleWithForEach {
    public static List<Integer> findEvenNumberWithDoubleValue(List<Integer> number){
        ArrayList<Integer> numPrint = new ArrayList<>();
        for(int x : number){
            if(x%2==0){
                x*=x;
                numPrint.add(x);
            }
        }
        return numPrint;
    }


    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list = number.stream().filter(n -> n % 2 == 0).map(n -> n * n).toList();
        System.out.println("Answer By Stream() way :- "+ list );
        System.out.println("-------------+++++++++----------------");
        System.out.println("Answer By Normal way :-"+findEvenNumberWithDoubleValue(number));
   }
}
