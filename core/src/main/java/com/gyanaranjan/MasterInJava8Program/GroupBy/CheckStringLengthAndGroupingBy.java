package com.gyanaranjan.MasterInJava8Program.GroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckStringLengthAndGroupingBy {
    public static void main(String[] args) {
        String [] str = { "Banana", "Pine-apple", "Apple","Grape"};
        Map<Integer, List<String>> collect = Arrays.stream(str).collect(Collectors.groupingBy(n -> n.length()));
        collect.forEach((number,string)-> System.out.println(number +"  :   "+string));
    }
}
