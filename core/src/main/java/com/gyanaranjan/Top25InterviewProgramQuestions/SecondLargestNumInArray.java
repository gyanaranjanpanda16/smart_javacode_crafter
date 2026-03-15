package com.gyanaranjan.Top25InterviewProgramQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class SecondLargestNumInArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer secondMax = list.stream().sorted(Comparator.reverseOrder())
                .skip( 1).findFirst().get();
//        int reduce = list.stream().mapToInt(Integer::intValue).reduce(0, Integer::sum);
//        System.out.println(reduce);

//        System.out.println(asInt);


        System.out.println(secondMax);

    }
}
