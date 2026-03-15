package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

public class Test12 {
	private int amount;
	
	private String color;
    private int bal;
	
	Test12(int amount,String color, int bal){
		this.amount=amount;
		this.color=color;
		
		this.bal=bal;
	}
	String run() {
		System.out.println(" a cat can be run fast");
		
		return "rintu";
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Test12 obj	=new Test12(1000,"Black",1000);
//	 obj.run();
	
	 System.out.println(obj.amount);
	 System.out.println(obj.color);
//     System.exit(0);
	 System.out.println(obj.bal);
	 
	 System.err.println(obj.run());
     
	}

}
