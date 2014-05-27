package com.samdide.tij;

/**
 * Prints three arguments provided to the class on the command line.
 * <p>
 * Note that at least three arguments must be provided on the command line or
 * the application will crash.
 * 
 * @author Henrik Samuelsson
 */
public class CommandLineArguments {
	
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
