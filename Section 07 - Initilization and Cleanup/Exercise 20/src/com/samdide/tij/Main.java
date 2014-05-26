package com.samdide.tij;

/**
 * Prints strings provided as argumens to the program prior to the launch.
 * <p>
 * Note that varargs is used in main() instead of the more common array for
 * input to the application.
 * 
 * @author Henrik Samuelsson
 * 
 */
public class Main {

	/**
	 * Entry point to application.
	 * 
	 * @param args
	 *            variable amount of strings
	 */
	public static void main(String... args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
