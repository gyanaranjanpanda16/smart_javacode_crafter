package com.gyanaranjan.JavaFundaMental;

class Test03 {
    void m1(){
        System.out.println("hii");
    }

}
class A{
    void m2() {
        Test03 ts = new Test03();
        ts.m1();
    }
}
class B{
    public static  void main(String[] args) {
        A a1 = new A();
        a1.m2();
    }
}