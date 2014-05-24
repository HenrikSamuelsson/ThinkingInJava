package com.samdide.thinkinginjava;

/**
 * Example of explicit static initialization with the static clause.
 * <p>
 * Experiment with commenting out and uncommenting the rows marked with (1) and
 * (2) to see when static initialization is done.
 * 
 * @author Henrik Samuelsson
 */
public class ExplicitStatic {

	/**
	 * Entry point to application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.cup1.f(99); // (1)
	}

	static Cups cups1 = new Cups(); // (2)
	//static Cups cups2 = new Cups(); // (2)
}

/**
 * Dummy class called cup, does not really do anything besides printing debug
 * messages.
 */
class Cup {

	/**
	 * Constructs a Cup with a marker that identifies the construction by a
	 * printing a message.
	 * 
	 * @param marker
	 *            number that will be printed on construction
	 */
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}

	/**
	 * Prints a debug message when called.
	 * 
	 * @param marker
	 *            number used to identify the message
	 */
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

/**
 * Dummy class that hold two cups.
 */
class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	/**
	 * Constructs a Cups object and prints a debug message at the moment of
	 * construction.
	 */
	Cups() {
		System.out.println("Cups()");
	}

}
