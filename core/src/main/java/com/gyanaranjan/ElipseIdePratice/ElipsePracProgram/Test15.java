package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

public class Test15 {
	
	protected String model = "Apache";
	void run() {
		System.out.println("Runs ve3ry fast ");
	}
	   

}
 class MyCar extends Test15  {
	 private int price = 1000;
	 private String name = "hyundai";
	 static {
     System.out.println("hello");
	 }
	 public static void main(String[] args) {
			MyCar  obj = new 	MyCar();
			obj.run();
			
			System.out.println( obj.model+ "   price is "+ obj.price + " here is my new car -->   "
					+ (obj.name));
	}
	 
 }