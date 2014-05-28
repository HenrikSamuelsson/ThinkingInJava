package com.samdide.tij;

/**
 * Small example program, main purpose is to illustrate coding style conventions
 * in Java.
 * 
 * @author Henrik Samuelsson
 */
public class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	
	/**
	 * Setter method for the anIntegerRepresentingColors field.
	 * 
	 * @param color
	 *            to be set
	 */
	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = newHue;
	}
	
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		AllTheColorsOfTheRainbow color = new AllTheColorsOfTheRainbow();
		color.changeTheHueOfTheColor(64);
	}
}
