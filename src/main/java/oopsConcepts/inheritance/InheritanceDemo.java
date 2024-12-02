package oopsConcepts.inheritance;

public class InheritanceDemo {
	
	/**
	 * Acquiring all properties(variables) and behavior(methods) from one class to another class
	 * By using extends keyword we can do it
	 * class B extends A
	 * where A class is called parent/ super class
	 * B is called as child or derived class
	 * B can use variables and methods from A as well as created in B
	 * A can access only variables and methods of A and not from B in reverse order
	 * Objective - helps in Re-usability and avoids duplication
	 * 
	 * 
	 * 
	 * Examples: IN banking application working on loans section
	 * Personal Loan - 10 Classes
	 * Homes Loan - 20 Classes
	 * If worked as separate 1hr for each class will take 30 hrs
	 * If identified common classes for loan and if it is extended by home and person loan classes
	 * Say 5 common classes it reduces 5 classes in both section and also reduces development effort by 10 hrs
	 * 
	 * In Automation use of common utility class
	 * 
	 * Types of inheritance - 4 levels
	 * Single - One parent and child
	 * Multi-level - Parent - Child 1 - Child 2 - > Child 3 -- Like this one after other extends
	 * Hierachy -  Parent 1  - Child 1; Parent 1 - Child 2 - Same parent for multiple childs
	 * Multiple - Parent 1 - Child 1; Parent 2 : Child 1 , Multiple parents for same child class
	 * Multiple inheritance cannot be implemented using Class concept and it does not support
	 * Multiple inheritance can be implented using Interface
	 * WHy it is not supported in class concepts
	 * Class C3 extends C1, C2
	 * 	- Extends keyword supports only one class extention
	 *  - C1 and C2 may have same methods or variables which may result in ambuigity issue resulting conflict
	 *  - Object is root class or parent class for all classes
	 *  - WHen class is created by default it is extended by Object class, no need to write, but by default newly created class extends object class
	 *  - So classes can have duplicate methods
	 */

	

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 X obj= new X();
		// obj.

	}
	
	
	

}


class X{
	
}
