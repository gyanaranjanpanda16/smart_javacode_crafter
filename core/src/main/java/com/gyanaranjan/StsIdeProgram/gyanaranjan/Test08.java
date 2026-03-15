package com.gyanaranjan.StsIdeProgram.gyanaranjan;

public class Test08 {
	int i = 10;
	{
		methodOne();
		System.out.println("First instance block");
	}
    Test08(){

		System.out.println("Parent class Constructor :");
    }
    public static void main(String[] args) {
//		LengthOfGivenNumber t = new LengthOfGivenNumber();
		System.out.println("main Method");
	}
    public void methodOne() {

		System.out.println(j);
    }
    {
    	System.out.println("Second instance block :");
    }
    int j = 20;
    
}
