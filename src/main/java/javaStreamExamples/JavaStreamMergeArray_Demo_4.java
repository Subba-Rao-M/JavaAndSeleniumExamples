package javaStreamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamMergeArray_Demo_4 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Xavier");
		names.add("Test1");
		names.add("Pravin");
		names.add("Deeps");
		names.add("Anargya");
		
		List<String> names1 = Arrays.asList("Ashles", "Adani", "Bharath", "Deepak");
		
		//Merging 2 lists and display values
		Stream <String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		//To get value matching in list
		boolean isPresent = names.stream().anyMatch(s->s.equalsIgnoreCase("Deeps"));
		System.out.println(isPresent);
		
		
		//Collect method will convert back the result stream values back to list
		List <String> ls= names.stream().filter(name->name.endsWith("a")).map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		//Identify unique values in below list
		
		List<Integer> values = Arrays.asList(1, 3, 4, 1, 3, 2, 1, 5);
		//values.stream().distinct().forEach(s->System.out.println(s));
		//Sort and give me the 3rd index value
		System.out.println(values.stream().sorted().distinct().collect(Collectors.toList()).get(2));
		
		
	}

}
