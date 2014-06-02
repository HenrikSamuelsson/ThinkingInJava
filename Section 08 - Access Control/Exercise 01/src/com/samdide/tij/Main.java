package com.samdide.tij;

import com.samdide.externalpackage.ExternalClass;

/**
 * Creates an object of a class found in another package.
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
		new ExternalClass(); // This class is imported above.
	}
	
}
