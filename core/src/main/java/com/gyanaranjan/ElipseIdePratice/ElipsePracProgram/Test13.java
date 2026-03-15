package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

// constructor chaining example program :-->
public class Test13{

    public static void main(String args[]) {
           // testing constructor chaining in Java
           Derived sub = new Derived();//"Test");
    }
}

class Base{
    protected String name;
 
    public Base(){
        this(""); //calling one arg constructor of same class
        System.out.println("Inside no argument constructor of Base class 1");
    }
 
    public Base(String name){
        this.name = name;
        System.out.println("One arg constructor of Base class 2");
    }
}

class Derived  extends Base{
 
   public Derived(){
       System.out.println("Inside no argument constructor of Derived class 3");
   }
 
   public Derived(String name){
       super(name); //calling one argument constructor of super class
       System.out.println("Inside one arg constructor from Derived class 4");
   
  }
}


