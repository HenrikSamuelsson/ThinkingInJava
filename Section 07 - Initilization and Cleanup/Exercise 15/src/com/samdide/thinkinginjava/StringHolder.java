package com.samdide.thinkinginjava;

/**
 * Class that holds a string that illustrates "instance initialization".
 * <p>
 * The instance initialization block is always called regardless of what
 * constructor that is used, s is in this way guaranteed to have been set.
 * 
 * @author Henrik Samuelsson
 */
public class StringHolder {
	String s;
	{
		s = "instance initialization";
		System.out.println("Inside instance initialization block.");
	}

	/**
	 * Constructor that does not take any arguments.
	 */
	public StringHolder() {
		System.out.println("Constructor without arguments, s = " + s + ".");
	}

	/**
	 * Constructor that takes a string as argument.
	 * 
	 * @param sIn
	 *            string that will be printed in a debug message
	 */
	public StringHolder(String sIn) {
		System.out.println("Constructor with string argument, sIn = " + sIn
				+ ", s = " + s + ".");
	}

}
