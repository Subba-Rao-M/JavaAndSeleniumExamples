package arrayInJava;

import java.util.Arrays;

public class SortingElementsArrayDemo_3 {

	public static void main(String[] args) {
		
		
		String a[] = {"ABC", "QLM", "ACB", "abc", "L", "C", "B"};
		
		System.out.println("Before Sorting \n "+Arrays.toString(a));
		System.out.println(); // Print the array elements
		
		Arrays.sort(a); 
		
		System.out.println("After Sorting \n "+Arrays.toString(a));
		

	}

}
