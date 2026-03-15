package com.gyanaranjan.StsIdeProgram.gyanaranjan;
//  Exception Handling :--->an unexpected event tht break normal flow of excution is
//                          called exception. way of restore the normal control flow 
//                          is called Exception Handling .
//  Exception are 3 parts :--->
//1)  Name of the Exception 
//2)  Description of the exception (meassage)
//3)  Location of the the Exception 
//    Throwable class :--> has 2 child 1) Exception 2 ) Error 
//                    Exception are further divide 2 type 1) CHECKED --compiler
//                                                        2) UNCHECKED--not checked
//                                                                      by compiler





	
public class Test07{
	
	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		
		}catch(Exception e) {
			 e.printStackTrace();
			System.out.println("An Exception Occured :-");
		}
		System.out.println("hii");
	}
  }


