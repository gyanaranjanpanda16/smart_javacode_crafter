package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

public class Test22 {

	public static void main(String[] args) {
		String name = "Gyanaranjan"; // here String is a Immutable Object ..
		name.concat(" Panda");
		System.out.println(name);
		StringBuffer name2 = new StringBuffer("Gyanaranjan");// here StringBuffer is a Mutable Object
		name2.append(" Panda");
		System.out.println(name2);
	}

}
