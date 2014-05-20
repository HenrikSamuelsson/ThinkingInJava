package com.samdide.thinkinginjava;

/**
 * Dummy class that demonstrates overloading.
 * 
 * @author Henrik Samuelsson
 */

public class Dog {

	/**
	 * Constructs an object and prints "Woof!".
	 * 
	 * @param i
	 *            not used
	 * @param c
	 *            not used
	 */
	Dog(int i, char c) {
		System.out.println("Woof!");
	}

	/**
	 * Constructs an object and prints "Arf!".
	 * 
	 * @param c
	 *            not used
	 * @param i
	 *            not used
	 */
	Dog(char c, int i) {
		System.out.println("Arf!");
	}

}
