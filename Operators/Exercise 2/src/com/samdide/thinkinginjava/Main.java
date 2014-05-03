package com.samdide.thinkinginjava;

/**
 * Demonstrates aliasing by the use of a class that hold a float.
 * 
 * @author Henrik Samuelsson
 *
 */
public class Main {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		DummyFloat df1 = new DummyFloat();
		DummyFloat df2 = new DummyFloat();
		
		df1.f = 1.0f;
		df2.f = 2.0f;
		
		System.out.println("df1.f = " + df1.f);
		System.out.println("df2.f = " + df2.f);
		
		System.out.println("Setting df2 = df1");
		df2 = df1;
		
		System.out.println("df1.f = " + df1.f);
		System.out.println("df2.f = " + df2.f);
		
		System.out.println("Altering of df2");
		df2.f = 3.0f;
		
		System.out.println("df1.f = " + df1.f);
		System.out.println("df2.f = " + df2.f);
	}
}
