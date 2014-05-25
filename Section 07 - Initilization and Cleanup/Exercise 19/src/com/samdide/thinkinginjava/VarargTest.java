package com.samdide.thinkinginjava;

/**
 * Illustrates two different ways to call a function that takes a vararg String
 * array as argument.
 * 
 * @author Henrik Samuelsson
 */
public class VarargTest {

	/**
	 * Prints the strings that will be provided as arguments on a single line
	 * and ends the printing with a line break.
	 * 
	 * @param args
	 *            variable amount of strings to be printed
	 */
	static void printStrings(String... args) {
		for (String s : args) {
			System.out.print(s);
			System.out.print(" ");
		}
		System.out.println();
	}

	/**
	 * Entry point to application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		printStrings("one", "two", "three", "four");
		printStrings(new String[] { "five", "six", "seven", "eight"});
	}

}
