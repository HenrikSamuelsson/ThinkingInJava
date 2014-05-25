package com.samdide.thinkinginjava;

/**
 * Shows that no actual TestClass objects are created when just creating a
 * reference to an array that can hold TestClass objects.
 * 
 * @author Henrik Samuelsson
 * 
 */
public class Main {

	/**
	 * Entry point to application
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		TestClass[] array = new TestClass[5];
	}

}
