package com.samdide.thinkinginjava;

/**
 * Displays the largest and smallest numbers that float and double can hold.
 * 
 * @author Henrik Samuelsson
 */
public class Main {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		System.out.println("Float min: " + Float.MIN_VALUE);
		System.out.println("Float max: " + Float.MAX_VALUE);
		System.out.println("Double min: " + Double.MIN_VALUE);
		System.out.println("Double max: " + Double.MAX_VALUE);
	}
}
