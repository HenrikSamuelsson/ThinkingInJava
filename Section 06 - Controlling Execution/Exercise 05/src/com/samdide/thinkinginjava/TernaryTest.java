package com.samdide.thinkinginjava;

/**
 * Exercise involving bitwise operators and the ternary operator.
 * 
 * @author Henrik Samuelsson
 */
public class TernaryTest {

	/**
	 * Prints a binary representation of the input integer.
	 * 
	 * @param i
	 *            integer that shall be printed
	 */
	static public void printBinaryString(int i) {
		int m = 1; // used to mask out bits
		for (int j = 0; j < 32; j++) {
			System.out.print((i & m) == 0 ? '0' : '1');
			m = m << 1;
		}
		System.out.println();
	}

	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	static public void main(String[] args) {
		int i = 0xAAAAAAAA;
		int j = 0x55555555;
		System.out.print("i = ");
		printBinaryString(i);
		System.out.print("j = ");
		printBinaryString(j);
		System.out.print("~i = ");
		printBinaryString(~i);
		System.out.print("~j = ");
		printBinaryString(~j);
		System.out.print("i&j = ");
		printBinaryString(i & j);
		System.out.print("i|j = ");
		printBinaryString(i | j);
		System.out.print("i^j = ");
		printBinaryString(i ^ j);
	}

}
