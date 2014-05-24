package com.samdide.thinkinginjava;

/**
 * Test of the FinalizeTest class.
 * <p>
 * Creates loads of objects and then immediately let go of the objects by
 * letting f reference a new object. This might trigger the garbage collector
 * and the finalize method will run if this is the case.
 * <p>
 * This program runs the finalize method a few times on my system but may or may
 * run it on other systems.
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
		FinalizeTest f;
		for (int i = 0; i < 1000000; i++) {
			f = new FinalizeTest();
		}
	}

}
