package com.samdide.thinkinginjava;

/**
 * Exercise involving bitwise operators.
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
	static public void main(String[] args) {
		int i = 0xAAAAAAAA;
		int j = 0x55555555;
		System.out.println("i = " + Integer.toBinaryString(i));
		System.out.println("j = " + Integer.toBinaryString(j));
		System.out.println("~i = " + Integer.toBinaryString(~i));
		System.out.println("~j = " + Integer.toBinaryString(~j));
		System.out.println("i&j = " + Integer.toBinaryString(i&j));
		System.out.println("i|j = " + Integer.toBinaryString(i|j));
		System.out.println("i^j = " + Integer.toBinaryString(i^j));	
	}
}
