package com.samdide.thinkinginjava;

public class StringUtils {
	/**
	 * Calculates how many bytes that are required to store a string.
	 * 
	 * @param s
	 *            a string that shall be analyzed
	 * @return the numbers of bytes needed for the storage
	 */
	int storage(String s) {
		return s.length() * 2;
	}
}
