package stringPractice;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// Mutable vs Immutable
		
		int a[] = {10, 50, 20,30, 40, 50, 60};
		System.out.println("Before" +Arrays.toString(a));
		Arrays.sort(a);
		//Original elements are changed in variable, so it is mutable
		System.out.println("After"+Arrays.toString(a));
		
		//Immutable
		String s = "welcome";
		System.out.println("Before" +s);
		s.concat("Java");
		System.out.println("Before" +s);
		//TO get concatinated value it should be stored in another variable

	}

}
