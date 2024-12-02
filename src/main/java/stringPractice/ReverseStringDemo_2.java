package stringPractice;

public class ReverseStringDemo_2 {

	public static void main(String[] args) {
		//Approach 2 - without using string methods
		String s = "Welcome";
		//Convert the string into Char array and in array it will be stored in same order
		//Read last character first and so on and store in a variable
		
		String rev = "";
		
		char arr[] = s.toCharArray(); //Convert the string to char array
		
		for(int i = arr.length-1; i>=0; i--) {
			rev = rev+arr[i];
		}
		
		System.out.println(rev);

	}

}
