package com.samdide.thinkinginjava;

/**
 * Dummy class that hold two strings.
 * 
 * @author Henrik Samuelsson
 */
public class StringHolder {
	String s1 = "String set at the definition.";
	String s2; // More flexible string that can be set by the use of a special
				// constructor.

	/**
	 * Constructs a StringHolder and sets s2.
	 * 
	 * @param s
	 *            content of s2
	 */
	StringHolder(String s) {
		s2 = s;
	}
}
