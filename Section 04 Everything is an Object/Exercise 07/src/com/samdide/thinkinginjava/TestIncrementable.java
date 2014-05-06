package com.samdide.thinkinginjava;

/**
 * Test program for the Incrementable class.
 * 
 * @author Henrik Samuelsson
 */
public class TestIncrementable {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Incrementable.printI();
		
		Incrementable i1 = new Incrementable();
		i1.increment();
		Incrementable.printI();
		
		Incrementable i2 = new Incrementable();
		i2.increment();
		Incrementable.printI();
		
		Incrementable.increment();
		Incrementable.printI();
	}
}
