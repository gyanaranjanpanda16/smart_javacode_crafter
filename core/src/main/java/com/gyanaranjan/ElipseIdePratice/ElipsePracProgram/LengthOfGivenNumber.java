package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

public class LengthOfGivenNumber {
	 public static void main(String[]args) {
		 int number = 564734637;
		 int leng =0;
		 int temp= number;
		 while(temp!=0) {
			 leng=leng+1;
			 temp=temp/10;
			 
		 }
		 System.out.println("lenth of "+number+"  is    "+ leng);
	 }

}
