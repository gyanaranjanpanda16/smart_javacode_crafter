package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

import java.util.StringTokenizer;

public class Test23 {

	public static void main(String[] args) {
	StringTokenizer st = new StringTokenizer("this is my demo");
	System.out.println(st.countTokens());
//	while(st.hasMoreTokens()) {
	while(st.hasMoreElements()) {
		System.out.println(st.nextElement());
	}
	}

}
