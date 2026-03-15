package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;


class Animal{
	String name ;
	String color ;
	
	void bark() {
		System.out.println("dog can bark");
		
	}
	
	void eat() {
		System.out.println("dog can be eat mean");
		
	}
}	
	
 class Car {
	  
	int amount;
	int price;
	String color;
	 void run() {
		 System.out.println("thr can be run in high speed");
	 }
	void acc() {
		System.out.println("the car can be accelrated very fast");
	}
	
 }
	

 
class JavaTest01 {
	public static void main(String[] args) {
//	  JavaTest01 obj   = new   JavaTest01();
	      Animal  obj2 = new Animal();
	   Car obj3 = new Car();
	   obj3.run();
	   obj3.amount =100;
	   System.out.println(obj3.amount);
	   System.out.println(obj3.price=10000);
	   System.out.println(obj2.name="hari");
	   obj2.eat();
	}
}
