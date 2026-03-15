package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        outer:
		for (int i = 1; i <=4; i++) {
			System.out.println(" i  is :" +i);
			
			for (int j = 1; i <=3; i++) {
				System.out.println(" j  is :" +j);
			    if( j== 3){
				      break outer;
			      }
			
		}
		
		
		}
		
		
	}

	
}
