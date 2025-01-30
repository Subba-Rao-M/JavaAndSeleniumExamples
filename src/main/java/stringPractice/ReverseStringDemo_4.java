package stringPractice;

public class ReverseStringDemo_4 {

	public static void main(String[] args) {
		
		String s = "madam";
		String rev = "";
		
		for(int i =s.length()-1; i >=0; i--) { // length will give the count of strings and index starts from 0 so have to du -1
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("String is paliondrom");
		}

	}

}
