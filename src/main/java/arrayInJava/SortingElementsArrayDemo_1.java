package arrayInJava;

import java.util.Arrays;

public class SortingElementsArrayDemo_1 {

	public static void main(String[] args) {
		
		
		int a[] = {10, 20, 20, 10, 30, 40, 40, 50, 30, 20, 30};
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a)); // Print the array elements
		
		Arrays.sort(a); // Sort the array elements using builtin functions available in Java class
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
		

	}

}
