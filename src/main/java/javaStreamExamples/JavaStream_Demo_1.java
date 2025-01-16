package javaStreamExamples;

import java.util.ArrayList;
import java.util.List;

public class JavaStream_Demo_1 {
	
	/**
	 * Stream introduced in java 8
	 * To perform aggregate actions on data returned from collection with reduced complexity and code
	 * 
	 */

	public static void main(String[] args) {
		//program without using stream to calculate the number of names starting with letter A in a list
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Xavier");
		names.add("Test1");
		names.add("Pravin");
		names.add("Deeps");
		names.add("Anargya");
		int count=0;
		for (int i=0; i< names.size(); i++) {
			String name = names.get(i);
			if(name.startsWith("A")) {
				count++;
			}
		}
		System.out.println("Number of names with A : "+count);
	}

}
