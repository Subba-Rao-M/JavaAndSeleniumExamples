package javaStreamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStream_Demo_2 {

	public static void main(String[] args) {
		//program using stream to calculate the number of names starting with letter A in a list
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Xavier");
		names.add("Test1");
		names.add("Pravin");
		names.add("Deeps");
		names.add("Anargya");
		
		long count = names.stream().filter(name->name.startsWith("A")).count();
		
		/**
		 * Lambda expression with -> parameter
		 * left side declare the parameter
		 * right side action needs to be performed to get value
		 * left side parameter scans all elements on which needs to operate
		 * streams scans whole collection parallelly
		 * define stream
		 * Intermediate operation 
		 * terminal operation - final result
		 * The stream operation does not change original source data
		 */
		
		
		//there is no life for intermediate operation if there is no terminal operation
		//terminal operation will not return anything for filter if there is no values returned from intermediate op
		//We can create stream using Stream class, no need to create collection every time 
		//If intermediate op has more than 1 line use { } after ->
		
		//To create a stream which is compatible
		long count1 =Stream.of("Abhi","Bat", "Test").filter(name->{
																		name.startsWith("A");
																		return true;
																	}
															).count();
		
		System.out.println("Number of names with A : "+count);
		System.out.println("Number of names with A : "+count1);
		
		//Print all the names available in array list with more than chr > 4
		//First filter names with lenght > 4 and for that filtered value, print the data
		names.stream().filter(s -> s.length()>5).forEach(s->System.out.println(s));
		
		//To print the first result
		names.stream().filter(s -> s.length()>5).limit(1).forEach(s->System.out.println(s));
	}

}
