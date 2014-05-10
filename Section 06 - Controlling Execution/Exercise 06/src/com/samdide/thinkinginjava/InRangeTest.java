package com.samdide.thinkinginjava;

/**
 * Checks if numbers is inside a specified range.
 * <p>
 * Note that two similar methods are used. The latter of the two uses dual
 * return points and can in this way use one variable less than the first.
 * 
 * @author Henrik Samuelsson
 */
public class InRangeTest {
	/**
	 * Checks if a number is within a dynamically defined range.
	 * 
	 * @param begin
	 *            start point of the range
	 * @param end
	 *            end point of the range
	 * @param candidate
	 *            number that shall be checked if it is in the range
	 */
	static boolean rangeTesterVer1(int begin, int end, int candidate) {
		boolean result;
		if(candidate >= begin && candidate <= end)
			result = true;
		else 
			result = false;
		return result;
	}
	
	/**
	 * Checks if a number is within a dynamically defined range.
	 * 
	 * @param begin
	 *            start point of the range
	 * @param end
	 *            end point of the range
	 * @param candidate
	 *            number that shall be checked if it is in the range
	 */
	static boolean rangeTesterVer2(int begin, int end, int candidate) {
		if(candidate >= begin && candidate <= end)
			return true;
		return false;
	}
	
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		System.out.println(rangeTesterVer1(8, 10, 9));
		System.out.println(rangeTesterVer2(8, 10, 9));
		System.out.println(rangeTesterVer1(8, 10, 7));
		System.out.println(rangeTesterVer2(8, 10, 7));
		System.out.println(rangeTesterVer1(8, 10, 11));
		System.out.println(rangeTesterVer2(8, 10, 11));
	}

}
