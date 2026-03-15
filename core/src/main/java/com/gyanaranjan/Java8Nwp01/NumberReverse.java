package com.gyanaranjan.Java8Nwp01;

//  user will give input :- 14
//                 output :- 41 (should Receive)

public class NumberReverse {
    /**
     * this method is used to reverse Numeric value :->
     * @param  n is input for reverse Number
     * @return  output reverse Number
     */
    public static int returnNumReverse(int n){
       // Two-Way :-->
        StringBuilder sb = new StringBuilder();
        int remainder;
        while (n>0){
            remainder=n%10;
            sb.append(remainder);
            n=n/10;
        }
        return  Integer.parseInt((sb.toString()));

    }
    public static void main(String[] args) {
        //one-Way :-->
        int a = 35;
          System.out.println(returnNumReverse(a));
//        String s = String.valueOf(a);
//        StringBuilder  sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);

    }
}
