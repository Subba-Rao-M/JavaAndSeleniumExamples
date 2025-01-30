package oopsConcepts.dataabstracttion;

abstract class AbstractClassDemo {
	/**
	 * Abstraction is hiding the implementation details from user
	 * abstract class can have methods with implementation as well
	 * if any class with abstract method, then class is called as abstract class
	 * Example: Rules defined in abstract class and implementation can be done in class specific
	 * Object cannot be created for abstract class
	 * Private is not allowed for methods defined as private
	 * Interface:
	 * all methods should be abstract
	 * access specifier must be public static final for variables
	 * access modifier for method should be public
	 * Use class to implement interface
	 * 
	 * Abstract class:
	 * Only methods without body can be abstract
	 * Variables can have any access specifier
	 * Methods can have any access specifier other than private
	 * Use class to extend abstract class
	 */

	abstract void m1();
	void m2() {
		System.out.println("Non abstract methods");
	}

}
