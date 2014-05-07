package com.samdide.thinkinginjava;

/**
 * Finds all prime number below 1000.
 * 
 * @author Henrik Samuelsson
 */
public class PrimeNumbers {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		boolean isPrime;
		for(int i = 1; i < 1000; i++) {
			isPrime = true;
			for(int j = 2; j < i; j++ ) {
				if(i%j == 0){
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
