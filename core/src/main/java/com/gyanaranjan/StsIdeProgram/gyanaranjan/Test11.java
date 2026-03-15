package com.gyanaranjan.StsIdeProgram.gyanaranjan;

import java.util.Arrays;
import java.util.List;

public class Test11 {
     public static void main(String[] args) {
		Integer[] arr = {10,20,30,10,30,50,60};
		List<Integer> a = Arrays.asList(arr);
		List<Integer> distinct  = a.stream().distinct().toList();
		System.out.println(distinct);
	}
}
