package com.samdide.thinkinginjava;

/**
 * Arithmetic calculation exercise. A velocity is calculated using a constant
 * distance and a constant time.
 * 
 * @author Henrik Samuelsson
 * 
 */
public class Velocity {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		int distance = 3000; // meters
		int time = 15; // minutes
		int secondsInOneMinute = 60;
		int velocity;

		velocity = distance / (time * secondsInOneMinute);
		System.out.println("Your average velocity is " + velocity
				+ " m/s if you run " + distance + " meters in " + time + " minutes.");
	}
}
