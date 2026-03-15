package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;
import java.util.*;

public class Test06 {

	public static void main(String[] args) {

	Scanner b =new Scanner(System.in);
	System.out.println("ENTER THE NUMBER THAT WANT TO PRINT TABLE");
    int a=b.nextInt();
	b.close();
	System.out.println("HERE THE TABLE OF GIVEN NUMBER IS :-->");
		 for (int i = 1; i <=10; i++) {
			System.out.println(a+ " *  "+ i +"  =     " +a*i)  ;
			
		}  
	   }
	}


