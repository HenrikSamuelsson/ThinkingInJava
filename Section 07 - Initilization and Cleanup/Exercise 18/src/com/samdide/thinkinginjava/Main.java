package com.samdide.thinkinginjava;

/**
 * Creates an array that can hold TestClass objects and then creates objects
 * that are stored in the array.
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
		for (int i = 0; i < array.length; i++) {
			array[i] = new TestClass(Integer.toString(i));
		}
	}

}
