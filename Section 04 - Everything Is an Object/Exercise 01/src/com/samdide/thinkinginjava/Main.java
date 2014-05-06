package com.samdide.thinkinginjava;

/**
 * A test to verify that that Java performs default initialization.
 * @author Henrik Samuelsson
 */
public class Main {
	public static void main(String[] args) {
		// Create a new object of type TestData. 
		// Note that the fields are not initialized to anything.
		TestData testData = new TestData();
		
		// Print the content of the fields in our object.
		System.out.println("testData.i = " + testData.i);
		System.out.println("testData.c = " + testData.c);
	}
}
