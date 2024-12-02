package stringPractice;

public class ReverseStringDemo_3 {

	public static void main(String[] args) {
		//Approach 3 - using String Buffer class
		StringBuffer s = new StringBuffer("Welcome");
		System.out.println(s);
		System.out.println(s.reverse());
		
		//Approch 4 - Using String builder class
		
		StringBuilder test = new StringBuilder("Testing");
		System.out.println(test.reverse());

	}

}
