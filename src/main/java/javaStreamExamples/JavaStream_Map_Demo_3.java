package javaStreamExamples;

import java.util.stream.Stream;

public class JavaStream_Map_Demo_3 {

	public static void main(String[] args) {
		//To manipulate the data map can be used
		//To convert the data to upper case
		System.out.println("\n Using Map and upper case convertion");
		Stream.of("Abhi","balram", "Rama", "Krishna").filter(name->name.endsWith("a")).map(name->name.toUpperCase()).forEach(name->System.out.println(name));
		
		System.out.println("\n Using Sort");
		//To print the names in sorted order
		Stream.of("Abhi","balram", "Rama", "Krishna").filter(name->name.endsWith("a")).sorted().map(name->name.toUpperCase()).forEach(name->System.out.println(name));
		
	
	}

}
