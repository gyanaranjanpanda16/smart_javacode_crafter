package com.gyanaranjan.NWPro01;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoxedandAverageTempProblem {
    public static void main(String[] args) {
        double [] temp ={12.78,12.67,57,89,38.6,23.7};
        //Average  tempeture :-->
        double string = Arrays.stream(temp).average().orElse(Double.NaN);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String format = decimalFormat.format(string);
        System.out.println(format);
        System.out.println("+++++++++++++++++++++++++++");
        // fliter tempeture round to above 27 temperature :-->
         Arrays.stream(temp).filter(n -> n >= 27.00).forEach(System.out::println);


    }
}
