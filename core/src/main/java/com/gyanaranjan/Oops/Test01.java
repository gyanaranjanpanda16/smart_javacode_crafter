package com.gyanaranjan.Oops;
interface A1{
           void m1();    //interface    // full abstraction provided
        }
abstract class A2 implements A1{
    void m2(){
        System.out.println("Hii its abstract class"); // Abstraction :-- partial abstraction provide
    }

    abstract void m3();

    public A2() {
        System.out.println("its constructor");
    }
}
 class Test01  extends A2 implements A1{  // class : its logical template , help in object creation ,
     // without class can't create object.
    private int a; // data hiding
    private String name ;
    private int salary;

     public Test01(int a, String name, int salary) {
         this.a = a;
         this.name = name;
         this.salary = salary;
     }

     public Test01() {
         super();
     }

     public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {    // Encapsulation
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

     @Override
     public void m1() {
         System.out.println("overiding");
     }
     public void m1(int a) {
         System.out.println("overloading");
     }


     @Override
     void m3() {

     }
 }
class Test02 extends Test01{
//   public void m1(){
//       super.m1();
//       System.out.println("overloading");

    public void m1(int a,int b, int c){
       System.out.println();
    }
    public void setSalary(int salary) {    // inheritance

    }

    public static void main(String[] args) {
        Test02 test01 = new Test02();    // object -- instance of class , object have property ,does property
        test01.m1(10);
        test01.m1();
        System.out.println(test01.getName());
    }
}