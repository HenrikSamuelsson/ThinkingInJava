package com.samdide.thinkinginjava;

/**
 * Experiment with initialization of static fields.
 * 
 * @author Henrik Samuelsson
 * 
 */
public class StaticInitialization {
	static String s1 = "Initialized at definition.";
	static String s2;

	// A static block.
	static {
		s2 = "Initialized in static block.";
		// Can initialize more fields in here if needed.
	}

	/**
	 * Entry point to application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}

}
