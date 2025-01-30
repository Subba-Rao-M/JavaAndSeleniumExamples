package stringPractice;

import java.util.Arrays;

public class StringExamples_1 {

	public static void main(String[] args) {
	
		//Example 1
		
		String amount = "$15,22,33"; // Output expected 152233
		System.out.println(amount.replace("$", "")); //15,22,33
		
		System.out.println(amount.replace(",", "")); //$152233
		System.out.println(amount.replace("$", "").replace(",", "")); //152233
		
		//Example 2
		
		String s = "abc,123@xyz";
		
		String arr1[] = s.split(",");
		System.out.println(Arrays.toString(arr1));
		
		String arr2[] = arr1[1].split("@");
		
		System.out.println(arr1[0] );
		System.out.println(arr2[0] );
		System.out.println(arr2[1] );
		
		//Example 3
		
		String s1 = "abc 123";
		String arr3[] = s1.split(" ");
		System.out.println(Arrays.toString(arr3));
		
		// *, (, ), %, ^ -- Cannnot be used as delimiter
		// arr1[] + arr2[] is not possible if value contains multiple values
		
		
		//Example 4
		
		String name = "John Kennedy";
		
		System.out.println(name.contains("john")); // false
		System.out.println(name.equalsIgnoreCase("john")); //false because partial comparison
		System.out.println(name.equalsIgnoreCase("john kennedy")); //true
		System.out.println(name.toLowerCase().contains("john")); //true
		System.out.println(name.replace('J', 'j').contains("john")); //true
		
		
	}

}
