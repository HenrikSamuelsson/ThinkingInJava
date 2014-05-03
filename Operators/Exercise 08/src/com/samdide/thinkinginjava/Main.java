package com.samdide.thinkinginjava;

/**
 * Exercise involving octal and hexadecimal notation.
 * 
 * @author Henrik Samuelsson
 *
 */
public class Main {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	static public void main(String[] args) {
		long n1 = 07; // assignment using octal notation
		long n2 = 0xf; // assignment using hexadecimal notation
		System.out.println("n1: " + Long.toBinaryString(n1));
		System.out.println("n2: " + Long.toBinaryString(n2));
	}
}
