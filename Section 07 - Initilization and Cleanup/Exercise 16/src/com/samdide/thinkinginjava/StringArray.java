package com.samdide.thinkinginjava;

/**
 * Creates an array of strings and prints the content of this array.
 * 
 * @author Henrik Samuelsson
 */
public class StringArray {

	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		String[] stringArray = { "one", "two", "three" };
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}

}
