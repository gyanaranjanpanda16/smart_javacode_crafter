package com.gyanaranjan.JavaFundaMental;

public class Test07 {

    public static void main(String[] args) {
        String originalName = "0123.409984849349943907677878898";
        double v = Double.parseDouble(originalName);
        System.out.println(v);
        String formattedValue = String.format("%.0f", v);
        String str = "";
        String str1 = null;

        System.out.println(str.isEmpty());
//        System.out.println(str1.isEmpty());
//        System.out.println(str1.isBlank());
        System.out.println(str.isBlank());


    }
}
