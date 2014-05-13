package com.samdide.thinkinginjava;

/**
 * Prints numbers in the Fibonacci sequence.
 * <p>
 * The amount of Fibonacci numbers printed is based on a command line argument
 * that shall be provided to the application.
 * 
 * @author Henrik Samuelsson
 */
public class Fibonacci {
	/**
	 * Entry point to application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		// Convert the command line argument to an int.
		int arg = (new Integer(args[0])).intValue();
		int f1 = 1;
		int f2 = 1;
		int f3;
		
		if (arg < 1) {
			System.out.println("Error: Invalid argument!");
		}
		else if(arg == 1) {
			System.out.println(f1);
		}
		else if (arg == 2) {
			System.out.println(f1);
			System.out.println(f2);
		}
		else {
			System.out.println(f1);
			System.out.println(f2);
			for(int i = 3; i <= arg; i++) {
				f3 = f1 + f2;
				System.out.println(f3);
				f1 = f2;
				f2 = f3;
			}
		}
	}
}
