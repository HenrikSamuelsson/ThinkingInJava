package com.samdide.thinkinginjava;

/**
 * Exercise with switch statements.
 * 
 * @author Henrik Samuelsson
 */
public class SwitchTest {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		// First test that includes break.
		System.out.println("Starting first test.");
		for (int i = 0; i <= 3; i++) {
			switch (i) {
			case 0:
				System.out.println("case 0");
				break;
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			}
		}
		// Second test that does not includes break.
		System.out.println("Starting second test.");
		for (int i = 0; i <= 3; i++) {
			switch (i) {
			case 0:
				System.out.println("case 0");
			case 1:
				System.out.println("case 1");
			case 2:
				System.out.println("case 2");
			}
		}
	}
}
