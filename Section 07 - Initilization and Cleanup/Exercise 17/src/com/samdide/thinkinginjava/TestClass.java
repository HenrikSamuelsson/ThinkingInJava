package com.samdide.thinkinginjava;

/**
 * Class that prints a message when an instance of the class is constructed.
 */
public class TestClass {

	/**
	 * Constructor that prints a debug message when it runs.
	 * 
	 * @param s
	 *            string that is incorporated into the debug message
	 */
	TestClass(String s) {
		System.out.println("New objech created with argument = " + s);
	}
}
