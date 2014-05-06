package com.samdide.thinkinginjava;

import java.util.Random;

/**
 * Compares random numbers 25 times.
 * 
 * @author Henrik Samuelsson
 */

public class NumberComparison {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		Random randomGenerator = new Random();
		int r1, r2;
		for(int i = 0; i < 25; i++) {
			r1 = randomGenerator.nextInt(100);
			r2 = randomGenerator.nextInt(100);
			if(r1 > r2) {
				System.out.println(r1 + " is larger than " + r2);
			}
			else if (r1 < r2) {
				System.out.println(r1 + " is smaller than " + r2);
			}
			else {
				System.out.println(r1 + " is equal to " + r2);
			}
		}
	}
}
