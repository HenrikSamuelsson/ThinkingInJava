package com.samdide.thinkinginjava;
import java.util.Random;

/**
 * Randomly flips a coin.
 * 
 * @author Henrik Samuelsson
 *
 */
public class CoinFlipping {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	static public void main(String[] args) {
		Random rand = new Random();
		boolean outcome = rand.nextBoolean();
		System.out.println("Outcome: " + ( outcome ? "head" : "tail" ));
	}
}
