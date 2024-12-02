package oopsConcepts.inheritance;

public class Animal_TestSuperDemo {

	public static void main(String[] args) {
		Dog d = new Dog(); // to invoke immediate constructor 
		d.displayColor(); // SUper keyword for invoke variable from parent class
		
		d.eating(); // super keyword to call method from immediate parent class

	}

}
