package com.samdide.thinkinginjava;

/**
 * Illustrates pitfalls when comparing content of strings.
 * 
 * @author Henrik Samuelsson
 */
public class StringCompare {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		compare("Cat", "Cat");
		compare("Cat", "Dog");
	}
	
	/**
	 * Compares strings and prints info about the comparisons.
	 * 
	 * @param s1 one of the strings to be compared 
	 * @param s2 one of tho strings to be compared
	 */
	public static void compare(String s1, String s2) {
		System.out.println(s1 + " == " + s2 + ": " + (s1 == s2));
		System.out.println(s1 + " != " + s2 + ": " + (s1 != s2));
		System.out.println(s1 + ".equals(" + s2 + "): " + (s1.equals(s2)));
		System.out.println("");		
	}
}
