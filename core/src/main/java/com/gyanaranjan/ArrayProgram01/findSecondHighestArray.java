package com.gyanaranjan.ArrayProgram01;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class findSecondHighestArray {

    Integer findSecondHghArry(int [] arr){
        IntStream arr1 = IntStream.of(arr);
        OptionalInt first = arr1.sorted().skip(1).findFirst();
        return first.getAsInt();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6,7}; //O/P --> 7
        findSecondHighestArray findSecond = new findSecondHighestArray();
        IntStream secondHghArry = IntStream.of(findSecond.findSecondHghArry(arr));
        System.out.println(secondHghArry);
    }
}
