package com.samdide.thinkinginjava;

/**
 * Small experiment with the this keyword.
 * 
 * @author Henrik Samuelsson
 */
public class Main {
	
	/** 
	 * Dummy method that will call another method in two ways.
	 */
	public void a() {
		b();
		this.b(); // No need to use the this keyword in this case. 
	}
	
	/**
	 * Dummy method that will print a debug message when being called.
	 */
	public void b() {
		System.out.println("b() go!");
	}
	
	/**
	 * Entry point to application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		new Main().a();
	}
	
}
