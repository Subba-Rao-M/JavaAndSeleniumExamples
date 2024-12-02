package oopsConcepts.constructors;

public class Box {
	
	double width, height, depth;
	
	// Constructor Name should be same as class name
	
	Box() { // Default constructor 
		
		//Constructor is used to assign the data to variables
		
		width = 0;
		height = 0; 
		depth = 0;
		
		//width = height = depth = 0;
	}

	Box(double w, double h, double d){ // Parameterized constructor
		//Assign the values to class variables
		width = w;
		height = h;
		depth = d;
		
		
	}
	
	Box(double len){ // To add more constructors follow the rules for number of parameters, data types and order of parameters
		
		width = height = depth = len;
	}
	
	double volume()
		{
			return (width * height * depth);
		}
}
