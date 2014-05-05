package com.samdide.thinkinginjava;

/**
 * Dummy class used to learn about static methods.
 * 
 * @author Henrik Samuelsson
 */

public class Incrementable {
	static int i = 47;
	
	/**
	 * Increments i by one.
	 */
	static void increment() {
		i++;
	}
	
	/**
	 * Displays the current value of i.
	 */
	static void printI() {
		System.out.println("i: " + i);
	}
}
