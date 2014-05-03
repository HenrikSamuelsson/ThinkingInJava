package com.samdide.thinkinginjava;

/**
 * Demonstrates aliasing during method calls.
 * <p>
 * Objects are passed as references to methods meaning that a method might
 * change the object.
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
		DummyFloat df = new DummyFloat();
		df.f = 1.0f;
		System.out.println(df.f);
		DummyFloatUtils.reset(df);
		System.out.println(df.f);
	}
}
