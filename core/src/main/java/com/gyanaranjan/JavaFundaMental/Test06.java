package com.gyanaranjan.JavaFundaMental;

final class Test06 extends Abc {
}
class  Abc {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer("hello");
        StringBuffer buffer2 = new StringBuffer("hello");

// Compare using CharSequence.equals()
        boolean areEqual = buffer1.equals(buffer2);

        System.out.println(areEqual);


//        StringBuffer buffer1 = new StringBuffer("hello");
//        StringBuffer buffer2 = new StringBuffer("hello");
//
//// Compare lengths first
//        if (buffer1.length() != buffer2.length()) {
//            System.out.println("Not equal: Different lengths");
//        } else {
//            // Compare character sequences only if lengths are the same
//            boolean areEqual = buffer1.toString().contentEquals(buffer2);
//            System.out.println(areEqual); // true, contents are same
//        }

    }
}