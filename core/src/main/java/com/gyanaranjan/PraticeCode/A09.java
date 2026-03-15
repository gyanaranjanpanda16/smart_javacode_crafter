package com.gyanaranjan.PraticeCode;
//Can overloaded method be overrided?
//
//        Yes, we can override a method which is overloaded in super class.

abstract class Hello{

    abstract void print();

}


 class A09 {
}
//63) What are the rules to be followed while overriding a method?
//
//        There are 5 main rules you should kept in mind while overriding a method. They are,
//
//        a) Name of the method must be same as that of super class method.
//
//        b) Return type of overridden method must be compatible with the method being overridden. i.e if a method has primitive type as it’s return type then it must be overridden with primitive type only and if a method has derived type as it’s return type then it must be overridden with same type or it’s sub class types.
//
//        c) You must not reduce the visibility of a method while overriding.
//
//        d) You must not change parameter list of a method while overriding.
//
//        e) You can not increase the scope of exceptions while overriding a method with throws clause.