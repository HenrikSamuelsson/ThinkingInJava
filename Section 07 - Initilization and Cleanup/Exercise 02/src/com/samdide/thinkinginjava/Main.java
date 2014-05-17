package com.samdide.thinkinginjava;

/**
 * Applcation to test the StringHolder class.
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
		StringHolder sh = new StringHolder("String set at the construction.");
		System.out.println("sh.s1 = " + sh.s1);
		System.out.println("sh.s2 = " + sh.s2);
	}
}