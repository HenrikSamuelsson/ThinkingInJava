package com.samdide.thinkinginjava;

/**
 * Test program for the dog class.
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
		
		dog1.name = "Spot";
		dog1.says = "ruff";
		dog2.name = "Scruffy";
		dog2.says = "wurf";
	
		System.out.println(dog1.name + " says " + dog1.says + ".");
		System.out.println(dog2.name + " says " + dog2.says + ".");
	}
}
