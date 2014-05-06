package com.samdide.thinkinginjava;

/**
 * Creation of an object and assigning of some values. The data is printed out
 * after assignment.
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
		DataOnly data = new DataOnly();
		data.i = 47;
		System.out.println("data.i = " + data.i);
		data.d = 1.1;
		System.out.println("data.d = " + data.d);
		data.b = false;
		System.out.println("data.b = " + data.b);
	}
}
