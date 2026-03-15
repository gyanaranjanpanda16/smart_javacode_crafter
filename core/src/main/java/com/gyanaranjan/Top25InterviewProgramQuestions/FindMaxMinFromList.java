package com.gyanaranjan.Top25InterviewProgramQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMaxMinFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(19,6,8,90,890,2);
        Integer i = list.stream().min(Comparator.naturalOrder()).get();
        int asInt = IntStream.of(19, 6, 8, 90, 890, 2).min().getAsInt();
        System.out.println(i +"   :   "+asInt);
        Integer i1 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(i1);
    }
}
