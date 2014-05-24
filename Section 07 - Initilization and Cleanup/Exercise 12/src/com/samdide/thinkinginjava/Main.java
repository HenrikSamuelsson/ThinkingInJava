package com.samdide.thinkinginjava;

/**
 * Test program for the Tank class.
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
		// Create two tanks.
		Tank t1 = new Tank();
		Tank t2 = new Tank();

		// Fill both tanks.
		t1.fill();
		t2.fill();

		// Make a "mistake" and empty only one of the tanks.
		t2.empty();

		// Let go of the references to the tanks so that they can be garbage
		// collected.
		t1 = null;
		t2 = null;

		// Force finalization.
		System.gc();
		System.runFinalization();
	}

}
