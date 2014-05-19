package com.samdide.thinkinginjava;

/**
 * Class that prints a message on construction.
 * 
 * @author Henrik Samuelsson
 */
public class MessagePrint {

	/**
	 * Constructs an object and prints a default message.
	 */
	MessagePrint() {
		System.out.println("I print a message on construction!");
	}

	/**
	 * Constructs an object and prints an message.
	 * 
	 * @param message
	 *            the string that shall be printed on construction
	 * 
	 */
	MessagePrint(String message) {
		System.out.println(message);
	}

}
