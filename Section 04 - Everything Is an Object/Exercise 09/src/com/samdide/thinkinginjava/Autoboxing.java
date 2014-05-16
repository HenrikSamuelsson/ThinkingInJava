package com.samdide.thinkinginjava;

/**
 * Exercise that demonstrates autoboxing.
 * 
 * @author Henrik Samuelsson
 */
public class Autoboxing {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		// Variables of all the primitive types.
		boolean booleanPrimitive = true;
		char charPrimitive = 'a';
		byte bytePrimitive = 1;
		float floatPrimitive = 2.0f;
		int intPrimitive = 3;
		long longPrimitive = 4;
		short shortPrimitive = 5;
		double doublePrimitive = 6.0;

		Boolean booleanObject;
		booleanObject = booleanPrimitive; // Autoboxing.
		System.out.println(booleanObject);
		
		Character charObject;
		charObject = charPrimitive;	// Autoboxing.
		System.out.println(charObject);
		
		Byte byteObject;
		byteObject = bytePrimitive; // Autoboxing.
		System.out.println(byteObject);
		
		Float floatObject;
		floatObject = floatPrimitive;	// Autoboxing.
		System.out.println(floatObject);
		
		Integer intObject;
		intObject = intPrimitive; // Autoboxing.
		System.out.println(intObject);
		
		Long longObject;
		longObject = longPrimitive; // Autoboxing.
		System.out.println(longObject);
		
		Short shortObject;
		shortObject = shortPrimitive;	// Autoboxing.
		System.out.println(shortObject);
		
		double doubleObject;
		doubleObject = doublePrimitive;	// Autoboxing.
		System.out.println(doubleObject);
	}
}
