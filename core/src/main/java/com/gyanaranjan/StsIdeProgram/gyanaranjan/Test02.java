package com.gyanaranjan.StsIdeProgram.gyanaranjan;
// interface  A{
//	 String add();
//	 String play();
// }
// abstract class Test02 implements A{
//	 public String add() {
//		return null;
//		 
//	 }
////	 public String play() {
////		return null;
////		 
////	 }
//}
//class B extends Test02{
//	
//}
//interface A{
//	int a = 10;
//}
//class B {
//	
//}
////class c implements A extends B{    ----> can't write the first implants then extends .
//class c extends B implements A{
//	public static void main(String[] args) {
//		int a=18;
//		System.out.println(A.a);
//		System.out.println(a);
//	}
//}
//
interface A{
    void check();
    int x = 10;
}
interface B {
    String check1();
    int x = 10;
}
class Test02 implements A,B{
	public static void main(String[] args) {
//		System.out.println(x);      ------------------->   The field x is ambiguous
      System.out.println(A.x);
      System.out.println(B.x);
	}

	@Override
	public String check1() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

	
	
}



















