package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

import java.util.Scanner;

public class Test20 {
	public static final int PASSWORD_LENGTH = 6;
	private String str3;
	private String str4;	
	
	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public String getStr4() {
		return str4;
	}

	public void setStr4(String str4) {
		this.str4 = str4;
	}

	void validation() throws InterruptedException {
		Scanner a = new Scanner(System.in);
//		String str1 = "gyana16@gmail.com";
		
		String str3 = getStr3();
	    String str4 = getStr4();
	    Thread.sleep(5000);    
	    for (int i = 1; i <= 3; i++) {
	    System.out.println("Login starts .....Wait Please");
	    Thread.sleep(7000);  
	    System.out.println("Becarefull before entering world u have only 3 times option  provides correct input : ");  	
	    System.out.println("Enter your correct email id And password for succesful login" );   
	    System.out.println("Enter your email Id !");
	    String b =a.next();
	    System.out.println("Enter your password !");
	    String c = a.next();
	    System.out.println("Your validation is Begin Please Wait ...... ");
	    Thread.sleep(5000);
	   
	    
	    if (str3.equalsIgnoreCase(b) && str4.equals(c)) {
	    	System.out.println(" You are valid user and Your login succesfully..welcome to panda World ! ");
	    	System.out.println(" Excution completed  SucessFully...Happy to have U");
	    	System.exit(0);
	    }else { 
	    	 if(i>=2) {
	      System.out.println("YOU ENTER WRONG INPUT  "+i+"  times  ");
	      System.out.println("After 3 time wrong enter account will be locked ");
	      }
	      System.out.println(" you are not valid user and Try again ..!!  ");
	    	Thread.sleep(7000);
	    	if(i==3) {
	    		System.out.println("You are Exceed the limit of input : Maximum of   "+i+"    Times Allowed");
	    		Thread.sleep(5000);
	    		System.out.println(" Get lost waste fellow......");
	    		Thread.sleep(10000);
	    	System.out.println("your account is locked and contact to Admin");
	    	System.exit(0);
	        }
	    	
	       }
		 }
		
	}
	
	String validPassword() {
		Scanner input = new Scanner(System.in);
			 System.out.print(
	                "1. A password must have at least Six characters.\n" +
	                "2. A password consists of only letters and digits.\n" +
	                "3. A password must contain at least two digits \n" +
	                "Input a password (You are agreeing to the above Terms and Conditions.): ");
	        String s = input.nextLine();

	        if (is_Valid_Password(s)) {
	            System.out.println("Password is valid: " + s);
	            
	        } else {
	            System.out.println("Not a valid password: " + s);
//	           while(is_Valid_Password(s)!= false ){
//	        	   input.nextLine(); 
//	        	  System.out.println("enter correct input for password"); 
//	        	  if (is_Valid_Password(s));
//	        	  
	           }
	            
	        
          return input.nextLine();
	    }

	    public static boolean is_Valid_Password(String password) {

	        if (password.length() < PASSWORD_LENGTH) return false;

	        int charCount = 0;
	        int numCount = 0;
	        for (int i = 0; i < password.length(); i++) {

	            char ch = password.charAt(i);

	            if (is_Numeric(ch)) numCount++;
	            else if (is_Letter(ch)) charCount++;
	            else return false;
	        }


	        return (charCount >= 2 && numCount >= 2);
	    }

	    public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }


	    public static boolean is_Numeric(char ch) {

	        return (ch >= '0' && ch <= '9');
	}
	

 public static void main(String[] args) throws InterruptedException {
	 System.out.println("Welcome to panda World !");
    Test20 d = new Test20();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your  email");
    d.setStr3(sc.next());
    System.out.println("Enter the password but u have to folloe rule :- ");
//    d.validPassword();
//    d.setStr4(sc.next());  
    d.setStr4(d.validPassword());
    System.out.println("your email id is : ");
    System.out.println(d.str3);
    System.out.println(" your password is : ");
    System.out.println(d.str4);
//    System.out.println(d.getStr3());
//    System.out.println(d.getStr4());
    d.validation();
   
    
	
    
   }
}
