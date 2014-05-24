package com.samdide.thinkinginjava;

/**
 * Class that implements the finalize method as a test.
 * 
 * @author Henrik Samuelsson
 */
public class FinalizeTest {

	/**
	 * Will be called if an FinalizeTest object gets garbage collected.
	 */
	protected void finalize() {
		System.out.println("Finalize method GO!");
	}

}
