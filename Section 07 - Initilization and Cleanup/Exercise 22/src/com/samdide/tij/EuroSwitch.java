package com.samdide.tij;

/**
 * Demo of an enumerated type.
 * <p>
 * Will use a loop and a switch statement to describe all the entries in an enum
 * representing some euro bills.
 * 
 * @author Henrik Samuelsson
 */
public class EuroSwitch {

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
			switch (e) {
			case FIVE:
				System.out
						.println("The 5 euro bill is grey with classical architecure from the 5th century.");
				break;
			case TEN:
				System.out
						.println("The 10 euro bill is red with romanesque architecure from the 11th-12th century.");
				break;
			case TWENTY:
				System.out
						.println("The 20 euro bill is blue with gothic architecure from the 12th-14th century.");
				break;
			case FIFTY:
				System.out
						.println("The 50 euro bill is orange with renaissance architecure from the 15th-16th century.");
				break;
			case ONE_HUNDRED:
				System.out
						.println("The 100 euro bill is green with baroque and rococo architecure from the 17th-18th century.");
				break;
			case TWO_HUNDRED:
				System.out
						.println("The 200 euro bill is yellow with the age of iron and glass architecure from the 19th-20th century.");
				break;
			case FIVE_HUNDRED:
					System.out
					.println("The 500 euro bill is purple with modern 20th architecure from the 20th century.");
			break;
			default:
				System.out.println("Unknown euro bill.");
			}
		}
	}

}
