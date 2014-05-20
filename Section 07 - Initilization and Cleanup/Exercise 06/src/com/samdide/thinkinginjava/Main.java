package com.samdide.thinkinginjava;

/**
 * Test program for the Dog class.
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
		int i = 1;
		char c = 'c';
		
		new Dog(i, c);
		new Dog(c, i);
	}
}