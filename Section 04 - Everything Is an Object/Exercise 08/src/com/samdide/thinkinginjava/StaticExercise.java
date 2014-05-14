package com.samdide.thinkinginjava;

/**
 * Exercise that shows that static fields are shared by all objects of a
 * particular class.
 * 
 * @author Henrik Samuelsson
 */
public class StaticExercise {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		StaticFieldClass s1 = new StaticFieldClass();
		StaticFieldClass s2 = new StaticFieldClass();
		System.out.println("s1.i = " + s1.i + " and s2.i = " + s2.i);
		s1.i++;
		System.out.println("s1.i = " + s1.i + " and s2.i = " + s2.i);
		StaticFieldClass.i++; // Note that this is the preferred way to
								// reference a static field in a class, since it
								// is more clear what happens.
		System.out.println("s1.i = " + s1.i + " and s2.i = " + s2.i);
	}
}
