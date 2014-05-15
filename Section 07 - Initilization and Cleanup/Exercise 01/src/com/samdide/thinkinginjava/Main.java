package com.samdide.thinkinginjava;

/**
 * Exercise that demonstrates that an uninitialized String reference is set to
 * null.
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
		StringHolder sh = new StringHolder();
		System.out.println("sh.i = " + sh.s);
	}
}
