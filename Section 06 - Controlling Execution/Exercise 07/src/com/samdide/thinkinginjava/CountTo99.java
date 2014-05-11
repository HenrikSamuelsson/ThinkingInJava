package com.samdide.thinkinginjava;

/**
 * Prints values from 1 to 99.
 * 
 * @author Henrik Samuelsson
 */
public class CountTo99 {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
			if(i == 99)
				break; // return; here will give the program equal behavior 
		}
	}
}