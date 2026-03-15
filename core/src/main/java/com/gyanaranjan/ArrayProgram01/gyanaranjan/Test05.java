package com.gyanaranjan.ArrayProgram01.gyanaranjan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//wap to find Max and min in given Array ?
public class Test05 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 4, 8};
        int max = numbers[0];
        int min = numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];

            }
            if(min>numbers[i]){
              min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
