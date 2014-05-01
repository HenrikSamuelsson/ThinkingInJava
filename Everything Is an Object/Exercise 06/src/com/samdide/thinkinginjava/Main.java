package com.samdide.thinkinginjava;

/**
 * Test program for the storage method found in StringUtils.
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
		StringUtils su = new StringUtils();
		int byteCount = su.storage("Hello world!");
		System.out.println("It takes " + byteCount
				+ " bytes to store the string \"Hello world!\"");
	}

}
