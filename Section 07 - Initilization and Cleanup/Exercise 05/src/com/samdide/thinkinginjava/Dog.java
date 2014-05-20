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
	 */
	Dog(int i) {
		System.out.println("Woof!");
	}

	/**
	 * Constructs an object and prints "Arf!".
	 * 
	 * @param c
	 *            not used
	 */
	Dog(char c) {
		System.out.println("Arf!");
	}
	
	/**
	 * Constructs an object and prints "Yap yap!".
	 * 
	 * @param d
	 *            not used
	 */
	Dog(double d) {
		System.out.println("Yap yap!");
	}

}
