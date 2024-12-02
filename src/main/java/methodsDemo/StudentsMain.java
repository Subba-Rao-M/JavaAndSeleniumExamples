package methodsDemo;

public class StudentsMain {

	public static void main(String[] args) {
		
		// How to access the class variables
		
		//Example 1: Using object reference variables access class variables
		
		/*Students std = new Students();
		std.sid = 1;
		std.sname = "Subba";
		std.sgrade = 'A';
		
		std.printStudentData(); 
		
		//Example 2 - Using methods 
		
		std.setStudentData(2, "John", 'B');
		std.printStudentData();
		
		*/
		
		// Example 3: Using constructor 
		
		/**
		 * Constructor is one type of method
		 * Constructor will have method name same as class name
		 * Methods can have any name
		 * Constructor will not return any values and not even void
		 * Don't add any return type including void
		 * Methods may or may not return values
		 * Constructor is used for only initializing the data into class variables and assign it to variables
		 * Constructor and Methods can take parameters
		 * Constructor will not have any implementation logic
		 * Method needs to be invoked by using object
		 * Constructor will be invoked on creation of object for class
		 * No need to explicitly call constructors
		 * Most of the time this approach is used
		 * If any variable needs to be operated then use above 2 approaches
		 * Multiple constructors can be created but with different parameters
		 * Default constructor - without any parameter and it will have only internal value assignment
		 * Parameterized constructor - Example below will pass the values to constructor 
		 */
		
		Students std1 = new Students(3, "Petter", 'C');
		std1.printStudentData();
	}

}
