package com.samdide.thinkinginjava;

/**
 * Test program for the StringHolder class.
 * 
 * @author Henrik Samuelsson
 */
public class Main {
	
	/**
	 * Entry point to application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		System.out.println("Inside main() 1.");
		new StringHolder();
		System.out.println("Inside main() 2.");
		new StringHolder("Hello!");
	}
	
}
