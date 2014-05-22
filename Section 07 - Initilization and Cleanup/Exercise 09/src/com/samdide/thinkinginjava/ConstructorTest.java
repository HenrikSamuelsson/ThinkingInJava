package com.samdide.thinkinginjava;

/**
 * Class that show how to call other constructors from within a constructor.
 * 
 * @author Henrik Samuelsson
 */
public class ConstructorTest {

	/**
	 * Constructs a ConstructorTest object and prints a debug message.
	 * 
	 * @param s
	 *            string that will be printed during the construction
	 */
	ConstructorTest(String s) {
		this();
		System.out.println("Argument to this constructor: " + s);
	}

	/**
	 * Constructs a ConstructorTest object and prints a debug message.
	 */
	ConstructorTest() {
		System.out.println("Default constructor (no args).");
	}

}
