package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

class A {
	
	void run1() {
		System.out.println("hii");
	}
	
}

class B extends A {
	void run() {
		System.out.println(" iam");
	}
}


class C extends B{
	
}



public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//           A ob1 =   new  A();
           
//          ob1.run();
  
           B ob2 =   new  B();
           ob2.run();
           ob2.run();
           C ob3 =   new  C();
           ob3.run();
           ob3.run();
//           ob3.show();
	}

}
