package com.samdide.thinkinginjava;

/**
 * Experiments with equals and == by the use of a class called Dog.
 * 
 * @author Henrik Samuelsson
 */
public class Main {
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	static public void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3;

		dog1.name = "Spot";
		dog1.says = "ruff";
		dog2.name = "Scruffy";
		dog2.says = "wurf";
		
		dog3 = dog1;

		System.out.println(dog1.equals(dog3));
		System.out.println(dog1 == dog3);
		System.out.println(dog2.equals(dog3));
		System.out.println(dog2 == dog3);
	}
}