package com.samdide.tij;

/**
 * Demo of an enumerated type.
 * <p>
 * Loops through and prints some values representing different euro bills.
 * 
 * @author Henrik Samuelsson
 */
public class EuroEnum {

	public enum EuroBill {
		FIVE, TEN, TWENTY, FIFTY, ONE_HUNDRED, TWO_HUNDRED, FIVE_HUNDRED
	}

	/**
	 * Entry point to application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		for (EuroBill e : EuroBill.values()) {
			System.out.println(e + ", ordinal " + e.ordinal());
		}
	}

}
