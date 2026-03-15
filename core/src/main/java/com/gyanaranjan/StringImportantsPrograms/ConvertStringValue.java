package com.gyanaranjan.StringImportantsPrograms;

public class ConvertStringValue {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        double v = Double.parseDouble(str);
//        boolean b = Boolean.parseBoolean(str);
        Float b = Float.valueOf(str);
        System.out.println(num);
        System.out.println(v);
        System.out.println(b);

    }
}
