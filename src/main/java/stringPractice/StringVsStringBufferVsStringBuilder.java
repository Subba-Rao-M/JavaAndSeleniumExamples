package stringPractice;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		String s = "Welcome";
		s.concat("To Java");
		System.out.println(s); //Immutable
		
		StringBuffer s1 = new StringBuffer("Welcome");
		s1.append(" To Java");
		System.out.println(s1); //Mutable
		
		StringBuilder s2 = new StringBuilder("Welcome");
		s2.append("To Java");
		System.out.println(s2); //Mutable
	}

}
