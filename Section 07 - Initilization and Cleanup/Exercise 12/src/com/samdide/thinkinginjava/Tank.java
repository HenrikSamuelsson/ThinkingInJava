package com.samdide.thinkinginjava;

/**
 * Can be full or empty.
 * <p>
 * Note: Shall be always be empty before the object is cleaned up by the garbage
 * collector.
 * 
 * @author Henrik Samuelsson
 * 
 */
public class Tank {
	boolean full;
	
	/**
	 * Empties the tank.
	 */
	public void empty() {
		full = false;
	}
	
	/**
	 * Fills the tank.
	 */
	public void fill() {
		full = true;
	}
	
	protected void finalize() {
		if(full) {
			System.out.println("Error: A tank was not empty at cleanup.");
		}
	}
}
