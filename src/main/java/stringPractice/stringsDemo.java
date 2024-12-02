package stringPractice;

import java.util.Arrays;

/**
 * 
 */

public class stringsDemo {
	

	public static void main(String[] args) {
		
		String s = "Welcome!";
		
		String test = new String("Welcome");
		
		System.out.println("String : "+s);
		System.out.println("Another String : "+test);
		
		// length() -- returns the length of string i.e number of characters including space
		
		int length = s.length();
		
		System.out.println(" String Lenght : "+length);
		System.out.println("Using string option only lenght"+"Testing Using Lenght ".length());
		
		//conact() -- > To join the 2 strings 
		
		String s1 = "Welcome";
		String s2 = "to";
		String s3 = "Java";
		
		System.out.println(s1+s2+s3);
		System.out.println("Welcome To "+ "Python");
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		System.out.println("Welcome".concat("India"));
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim() -- To remove the space on left and right sides
		
		String spaceText = "   Hello  World :)   ";
		
		System.out.println(spaceText.length());
		
		System.out.println("Text after trim  : "+spaceText.trim());
		
		System.out.println("Lenght after trim--> "+spaceText.trim().length());
		
		//charAt() --> Returns a character from string based on index and index starts from 0
		
		System.out.println(spaceText.charAt(0));
		System.out.println(spaceText.trim().charAt(0));
	
		//contains() --> returns true or false if the text or character matches within main string
		System.out.println(spaceText.contains("H")); // true
		System.out.println(spaceText.contains("h")); //false
		
		System.out.println(spaceText.contains(" Hel")); // true
		System.out.println(spaceText.trim().contains(";)He")); //false
		System.out.println(spaceText.trim().contains("Word")); //false
		
		//Comparing strings
		//equals()
		//equalsIgnoreCase()
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equalsIgnoreCase("welcome"));
		
		
		//replace() - replaces single or multiple sequnce of characters in a string
		
		String text = "Welcome to Java Selenium Course";
		
		System.out.println(text.replace('e', 'i'));
		System.out.println(text.replace("Java", "Python"));
		
		//substring() - extracts substring from main string using index
		
		String mainString = "Selenium";
		
		System.out.println(mainString.substring(3)); // Starts from 3rd index i.e enium
		System.out.println(mainString.substring(0, 3)); // Display 0 to 3 Sel // till 2 3 not included
		//System.out.println(mainString.substring(7, 2)); // index out of bound exception
		
		
		//toUpperCase() and toLowerCase()
		System.out.println(mainString.toUpperCase());
		System.out.println(mainString.toLowerCase());
		
		
		//split() - split the string into multiple parts based on delimeter
		
		String email = "abc@gmail.com";
		
		String a[]=email.split("@");
		System.out.println(a[0]); // output abc
		System.out.println(a[1]); // output gmail.com
		
		// In substring only until index value is retained and if the value length increases it will get same number of characters
		//WHereas in split even if the value is changed based in delimiter values are retrieved into array
		System.out.println(Arrays.toString(a));
		
		//Reverse string - 4 approaches 
		//Using length() and charAt
		//Using array concept s.s.toCharArray();
		//Using StringBuffer
		//Using StringBuilder
		
		//Mutable -- Can change and change is possible
		//Immutable -We cannot change
		
		//String is immutable object
		//Stringbuffer and Stringbuilder are mutable objects and uses append for concatination
		
		//String comparison
		//==
		//equals()
		
		
		
		
		
	}

}
